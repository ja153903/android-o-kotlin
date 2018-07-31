package academy.learnprogramming.buttoncounterapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var userInput: EditText? = null
    private var button: Button? = null
    private var textView: TextView? = null
    private var numTimesClicked = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userInput = findViewById(R.id.editText)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)
        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod()

        // If not null, then do this
        button?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                numTimesClicked++
                textView?.append("The button got tapped $numTimesClicked time")
                if (numTimesClicked != 1) {
                    textView?.append("s\n")
                } else {
                    textView?.append("\n")
                }
            }
        })
    }
}
