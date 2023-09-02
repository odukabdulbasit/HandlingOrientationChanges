package com.odukabdulbasit.handlingorientationchanges

import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var editTextValue = ""
    private var checkboxChecked = false
    private lateinit var editText: EditText
    private lateinit var checkBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize your UI components
        // For example, you have an EditText and a CheckBox
        // Assume you have EditText with ID: editText and CheckBox with ID: checkBox

        editText = findViewById(R.id.editText)
        checkBox = findViewById(R.id.checkBox)

        if (savedInstanceState != null) {
            // Restore the saved data from savedInstanceState
            editTextValue = savedInstanceState.getString("editTextValue", "")
            checkboxChecked = savedInstanceState.getBoolean("checkboxChecked", false)
        }

        // Apply the restored values to the UI components
        editText.setText(editTextValue)
        checkBox.isChecked = checkboxChecked

        // Handle other setup tasks
    }

    override fun onSaveInstanceState(outState: Bundle) {
        // Save the state of UI components into the outState Bundle
        outState.putString("editTextValue", editText.text.toString())
        outState.putBoolean("checkboxChecked", checkBox.isChecked)

        super.onSaveInstanceState(outState)
    }
}
