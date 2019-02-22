package br.com.tecapp.personproject.ui.photos.list

import android.os.Bundle
import android.view.View
import android.view.ViewTreeObserver
import androidx.appcompat.app.AppCompatActivity
import br.com.tecapp.personproject.R
import br.com.tecapp.personproject.utils.TransictionsUtils
import kotlinx.android.synthetic.main.photo_list_screen.*

class PhotoListActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_CIRCULAR_REVEAL_X = "EXTRA_CIRCULAR_REVEAL_X"
        const val EXTRA_CIRCULAR_REVEAL_Y = "EXTRA_CIRCULAR_REVEAL_Y"
    }

    private var revealX: Int = 0
    private var revealY: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.photo_list_screen)

        setupTransaction()
    }

    override fun onBackPressed() {
        TransictionsUtils.unRevealActivity(clContent, revealX, revealY, 0f, 400, onEnd = {
            clContent.visibility = View.INVISIBLE
        })
        super.onBackPressed()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun setupTransaction() {
        if (intent.hasExtra(EXTRA_CIRCULAR_REVEAL_X) && intent.hasExtra(EXTRA_CIRCULAR_REVEAL_Y)) {
            revealX = intent.getIntExtra(EXTRA_CIRCULAR_REVEAL_X, 0)
            revealY = intent.getIntExtra(EXTRA_CIRCULAR_REVEAL_Y, 0)

            val viewTreeObserver = clContent.viewTreeObserver
            if (viewTreeObserver.isAlive) {
                viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
                    override fun onGlobalLayout() {
                        val radius = (Math.max(clContent.width, clContent.height) * 1.1).toFloat()
                        TransictionsUtils.revealActivity(clContent, revealX, revealY, radius, 400)
                        clContent.viewTreeObserver.removeOnGlobalLayoutListener(this)
                    }
                })
            }
        }
    }
    
}
