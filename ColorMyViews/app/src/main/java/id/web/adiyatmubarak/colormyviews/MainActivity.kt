package id.web.adiyatmubarak.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(
            box_one_text,
            box_two_text,
            box_three_text,
            box_four_text,
            box_five_text,
            constraint_layout
        )

        clickableViews.forEach { it ->
            it.setOnClickListener {
                makeColored(it)
            }
        }
    }

    private fun makeColored(view: View) {
        when(view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.RED)
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_orange_dark)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
