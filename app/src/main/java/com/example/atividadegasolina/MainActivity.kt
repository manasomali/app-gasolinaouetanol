package com.example.atividadegasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao_comparar.setOnClickListener {
            val img_res: ImageView = findViewById<ImageView>(R.id.img_resultado)
            var valor_gasosa:String = text_gasolina.text.toString()
            var valor_etanol:String = text_etanol.text.toString()

            if ((valor_etanol.trim().length>0)&&(valor_gasosa.trim().length>0)){
                if(valor_etanol.toDouble()<(valor_gasosa.toDouble()*0.7)) {
                    img_res.setImageResource(R.drawable.abasteca_etanol);
                }else {
                    img_res.setImageResource(R.drawable.abasteca_gasolina);
                }
            }
        }
        ico_pergunta.setOnClickListener {
            val view:TextView = findViewById(R.id.textView3)
            view.visibility = if (view.visibility == View.VISIBLE){
                View.INVISIBLE
            } else{
                View.VISIBLE
            }
        }
    }
}
