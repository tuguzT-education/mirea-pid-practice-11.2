package io.github.tuguzt.navigationapi1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.*
import com.google.android.material.snackbar.Snackbar
import io.github.tuguzt.navigationapi1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.appBar.toolbar)

        binding.appBar.fab.setOnClickListener {
            Snackbar.make(it, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()
        }

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment2) as NavHostFragment
        val navController = navHostFragment.navController
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val destinationIds = setOf(R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
        appBarConfiguration = AppBarConfiguration(destinationIds, binding.drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.navView.setupWithNavController(navController)

        // получаем переданное из предыдущих UI значение arg1
        val str = intent.getStringExtra("arg1")
        Toast.makeText(this, str, Toast.LENGTH_LONG).show()

        // отправка данных обратно вызывающему
        navController.previousBackStackEntry?.savedStateHandle?.set("result_from_activity", "ответ на: $str")
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.activity_second_toolbar, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment2)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}
