package com.example.hp.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)

        val rollButton2: Button = findViewById(R.id.roll_button2)
        rollButton2.setOnClickListener {

            rollDice2()
        }

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()

        }


    }

    private fun rollDice2() {

        var randomInt2 = Random().nextInt(6) + 1

        val drawableResource = when (randomInt2) {1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else
            -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

        val playerTwo = "Second Player"
        Toast.makeText(this, "Dice is rolled BY $playerTwo your score is $randomInt2", Toast.LENGTH_SHORT).show()



            val score2: TextView = findViewById(R.id.textView2)
            score2.text = randomInt2.toString()

    }

    private fun rollDice() {

        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when (randomInt) {1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else
            -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)



        val playerOne = "First Player"
        Toast.makeText(this, "Dice is rolled BY $playerOne your score is $randomInt", Toast.LENGTH_SHORT).show()

        var score: TextView = findViewById(R.id.textView)
        score.text = randomInt.toString()
    }



}
