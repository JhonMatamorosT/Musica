package com.undiremos.musica

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.undiremos.musica.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setTheme(R.style.Theme_Musica)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.aleatorioBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, PlayerActivity::class.java)
            startActivity(intent)
        }
        binding.favoritosBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, FavoritosActivity::class.java)
            startActivity(intent)
        }
        binding.playlistBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, PlayListActivity::class.java)
            startActivity(intent)
        }
        binding.pistasBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, PistasActivity::class.java)
            startActivity(intent)
        }
        binding.albumesBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, AlbumesActivity::class.java)
            startActivity(intent)
        }
        binding.artistasBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, ArtistasActivity::class.java)
            startActivity(intent)
        }
        binding.carpetasBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, CarpetasActivity::class.java)
            startActivity(intent)
        }
        binding.anoBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, AnoActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}