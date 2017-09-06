package com.git.ruben.android_login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class loginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        findViewById(R.id.btnLinkToRegisterScreen).setOnClickListener {
            val intent = Intent(this, registerActivity::class.java)
            startActivity(intent)
        }

    }
}
