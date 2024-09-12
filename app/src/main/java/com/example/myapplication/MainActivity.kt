package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.OlympianAdapter
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantheon)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = OlympianAdapter(Pantheon.getOlympians(this))
    }
}



/* * Afficher une liste avec recyclerView (il recycle les info pour afficher uniquement ce qu'il doit afficher)
adapter : -olympianadapter
- olympianViewHolder (pour bind automatiquement image, name et desc

model : class Olympian

data: Pantheon

values : strings.xml

layout : pantheon.xml

//https://developer.android.com/codelabs/basic-android-kotlin-training-recyclerview-scrollable-list?hl=fr#0
* */