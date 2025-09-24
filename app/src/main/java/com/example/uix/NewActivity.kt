package com.example.uix

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.Gravity
import android.graphics.Color

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Crear un LinearLayout para contener las vistas
        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        // Establecer el color de fondo a guinda
        layout.setBackgroundColor(Color.parseColor("#800000"))

        // Crear un TextView para mostrar una frase
        val textView = TextView(this)
        textView.text = "¡Has llegado a la nueva actividad! 🎉"
        textView.textSize = 24f
        textView.textAlignment = TextView.TEXT_ALIGNMENT_CENTER
        textView.setTextColor(Color.WHITE)

        // Añadir el TextView al LinearLayout
        layout.addView(textView)

        // Establecer el layout como la vista de la actividad
        setContentView(layout)
    }
}
