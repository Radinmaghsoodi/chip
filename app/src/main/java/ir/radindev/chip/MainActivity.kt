package ir.radindev.chip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ir.radindev.chip.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.chipAndroid.setOnClickListener {
//
//        }

//        binding.chipAndroid.setOnCheckedChangeListener { buttonView, isChecked ->
//
//            if (isChecked) {
//                Toast.makeText(this, "chip is checked", Toast.LENGTH_SHORT).show()
//            } else {
//                Toast.makeText(this, "chip is not checked", Toast.LENGTH_SHORT).show()
//            }
//
//        }

        binding.ChipGroupMain.setOnCheckedChangeListener { group, checkedId ->

            when ( checkedId ) {

                R.id.chip_android -> {
                    Toast.makeText(this, "android", Toast.LENGTH_SHORT).show()
                }
                R.id.chip_web -> {
                    Toast.makeText(this, "web", Toast.LENGTH_SHORT).show()
                }
                R.id.chip_Python -> {
                    Toast.makeText(this, "Python", Toast.LENGTH_SHORT).show()
                }
                R.id.chip_php -> {
                    Toast.makeText(this, "PHP", Toast.LENGTH_SHORT).show()
                }
                R.id.chip_java -> {
                    Toast.makeText(this, "JAVA", Toast.LENGTH_SHORT).show()
                }
                R.id.chip_JS -> {
                    Toast.makeText(this, "JS", Toast.LENGTH_SHORT).show()
                }

            }

        }
    }
}