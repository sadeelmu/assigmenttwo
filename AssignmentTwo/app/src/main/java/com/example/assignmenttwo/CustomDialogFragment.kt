package com.example.assignmenttwo

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class CustomDialogFragment: DialogFragment(R.layout.fragment_to_do) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cancelBT: Button = view.findViewById(R.id.cancelBT)
        val submitBT: Button = view.findViewById(R.id.submitBT)

        val radioGroup = view.findViewById<RadioGroup>(R.id.RatingRadioGroup)
        cancelBT.setOnClickListener{
            dismiss()
        }

        submitBT.setOnClickListener{
            val selectedOption:Int = radioGroup.checkedRadioButtonId
            val radioButton = view.findViewById<RadioButton>(selectedOption)
            Toast.makeText(context,radioButton.text, Toast.LENGTH_SHORT).show()
            val m1:MainActivity = getActivity() as MainActivity
            m1.recieveFeedback(radioButton.text.toString())
            dismiss()
        }

    }
}