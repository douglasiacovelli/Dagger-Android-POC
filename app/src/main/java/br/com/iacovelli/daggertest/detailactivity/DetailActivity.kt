package br.com.iacovelli.daggertest.detailactivity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

class DetailActivity: AppCompatActivity() {

    val age by lazy { intent.getIntExtra(AGE, -1) }

    @Inject
    lateinit var repository: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        repository.sendAge()
    }

    companion object {
        private const val AGE = "Age"
        fun createIntent(context: Context, age: Int): Intent {
            return Intent(context, DetailActivity::class.java).apply {
                putExtra(AGE, age)
            }
        }
    }

}