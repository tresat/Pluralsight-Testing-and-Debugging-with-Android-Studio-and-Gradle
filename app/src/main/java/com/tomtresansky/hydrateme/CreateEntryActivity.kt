package com.tomtresansky.hydrateme

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class CreateEntryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_create_entry)
        setTitle(getString(R.string.title_activity_create_entry))

        val addButton: View = findViewById(R.id.add_entry_button)
        val entryEditText: EditText = findViewById(R.id.intake_edit_text)
        addButton.setOnClickListener { view ->
            Snackbar.make(view, getString(R.string.entry_saved), Snackbar.LENGTH_LONG).show()
            Log.d(CreateEntryActivity::class.qualifiedName, entryEditText.text.toString())

            val intakeInMl = entryEditText.text.toString().toInt()
            val data = Intent()

            data.putExtra("intake", intakeInMl)
            setResult(RESULT_OK, data)
            finish()
        }
    }
}