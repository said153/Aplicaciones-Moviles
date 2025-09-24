package com.example.uix.fragments

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.uix.MainActivity
import com.example.uix.NewActivity
import com.example.uix.R
import com.example.uix.databinding.FragmentInfoBinding


class InfoFragment : Fragment() {

    private var _binding: FragmentInfoBinding? = null
    private val binding get() = _binding!!

    private var progressHandler: Handler? = null
    private var progressRunnable: Runnable? = null
    private var currentProgress = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        // Actualizar texto compartido
        updateSharedText()

        // TextView dinámico que cambia con el texto compartido
        binding.tvDynamic.text = "Texto actual: ${MainActivity.sharedText}"

        // **AQUÍ ESTÁ LA CORRECCIÓN**
        // ImageView con click listener que inicia la nueva actividad
        binding.ivClickable.setOnClickListener {
            val intent = Intent(requireActivity(), NewActivity::class.java)
            startActivity(intent)
        }

        // Botones de progreso
        binding.btnStartProgress.setOnClickListener {
            if (progressRunnable == null) {
                startCircularProgress()
            }
        }

        binding.btnStopProgress.setOnClickListener {
            if (progressRunnable != null) {
                stopCircularProgress()
            }
        }

        // Botón de actualización
        binding.btnUpdateInfo.setOnClickListener {
            updateAllInformation()
        }

        // Botón para ir a la nueva actividad
        binding.btnGoToNewActivity.setOnClickListener {
            val intent = Intent(requireActivity(), NewActivity::class.java)
            startActivity(intent)
        }
    }

    private fun startCircularProgress() {
        progressHandler = Handler(Looper.getMainLooper())
        progressRunnable = object : Runnable {
            override fun run() {
                currentProgress = (currentProgress + 10) % 110 // Incrementa el progreso
                binding.pbCircular.progress = currentProgress
                binding.tvProgress.text = "Progreso: $currentProgress%"

                if (currentProgress >= 100) {
                    currentProgress = 0
                    stopCircularProgress()
                    Toast.makeText(requireContext(), "Progreso completado", Toast.LENGTH_SHORT).show()
                } else {
                    progressHandler?.postDelayed(this, 500) // Se repite cada 500ms
                }
            }
        }
        progressHandler?.post(progressRunnable!!)
    }

    private fun stopCircularProgress() {
        progressHandler?.removeCallbacks(progressRunnable!!)
        progressRunnable = null
    }

    private fun updateSharedText() {
        val newText = "Texto de Fragmento " + (0..100).random()
        MainActivity.sharedText = newText
        binding.tvDynamic.text = "Texto actual: $newText"
        Toast.makeText(requireContext(), "Texto compartido actualizado", Toast.LENGTH_SHORT).show()
    }

    private fun updateGlobalStatus() {
        val status = if (MainActivity.isFeatureEnabled) {
            "✅ Función especial ACTIVADA"
        } else {
            "❌ Función especial DESACTIVADA"
        }

        binding.tvGlobalStatus.text = status

        // Cambiar color del estado
        val color = if (MainActivity.isFeatureEnabled) {
            resources.getColor(android.R.color.holo_green_dark)
        } else {
            resources.getColor(android.R.color.holo_red_dark)
        }
        binding.tvGlobalStatus.setTextColor(color)
    }

    private fun updateAllInformation() {
        updateSharedText()
        updateGlobalStatus()

        // Actualizar contador de actualizaciones
        val currentCount = binding.tvUpdateCounter.text.toString()
            .substringAfterLast(": ")
            .toIntOrNull() ?: 0

        binding.tvUpdateCounter.text = "Actualizaciones: ${currentCount + 1}"
    }

    override fun onResume() {
        super.onResume()
        // Reanudar animaciones y actualizar información cuando regresamos al fragment
        if (progressRunnable != null) {
            startCircularProgress()
        }
        updateAllInformation()
    }

    override fun onPause() {
        super.onPause()
        // Pausar animaciones cuando salimos del fragment
        progressHandler?.removeCallbacks(progressRunnable!!)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        progressHandler?.removeCallbacks(progressRunnable!!)
        progressHandler = null
    }
}