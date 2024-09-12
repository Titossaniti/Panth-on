package com.example.myapplication

import android.content.Context
import com.example.myapplication.model.Olympian

object Pantheon {
    fun getOlympians(context: Context): List<Olympian> {
        return listOf(
            Olympian(
                context.getString(R.string.zeus),
                context.getString(R.string.zeus_desc),
                R.drawable.zeus
            ),
            Olympian(
                context.getString(R.string.hera),
                context.getString(R.string.hera_desc),
                R.drawable.hera
            ),
            Olympian(
                context.getString(R.string.poseidon),
                context.getString(R.string.poseidon_desc),
                R.drawable.poseidon
            ),
            Olympian(
                context.getString(R.string.demeter),
                context.getString(R.string.demeter_desc),
                R.drawable.demeter
            ),
            Olympian(
                context.getString(R.string.aphrodite),
                context.getString(R.string.aphrodite_desc),
                R.drawable.aphrodite
            ),
            Olympian(
                context.getString(R.string.artemis),
                context.getString(R.string.artemis_desc),
                R.drawable.artemis
            ),
            Olympian(
                context.getString(R.string.apollon),
                context.getString(R.string.apollon_desc),
                R.drawable.apollon
            ),
            Olympian(
                context.getString(R.string.athena),
                context.getString(R.string.athena_desc),
                R.drawable.athena
            ),
            Olympian(
                context.getString(R.string.hermes),
                context.getString(R.string.hermes_desc),
                R.drawable.hermes
            ),
            Olympian(
                context.getString(R.string.hephaistos),
                context.getString(R.string.hephaistos_desc),
                R.drawable.hephaistos
            ),
            Olympian(
                context.getString(R.string.ares),
                context.getString(R.string.ares_desc),
                R.drawable.ares
            ),
            Olympian(
                context.getString(R.string.dyonisos),
                context.getString(R.string.dyonisos_desc),
                R.drawable.dyonisos
            )
        )
    }
}
