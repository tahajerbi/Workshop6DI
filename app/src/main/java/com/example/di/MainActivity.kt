package com.example.di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val TAG: String = "AppDebug"

    @Inject
    lateinit var app: MyApp

    @Inject
    lateinit var someRandomString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Log.d(TAG, "oncreate: ${someRandomString}")
        Log.d(TAG, "oncreate: ${app}")
    }
}