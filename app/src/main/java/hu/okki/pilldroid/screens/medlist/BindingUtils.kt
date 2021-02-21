package hu.okki.pilldroid.screens.medlist

import android.widget.TextView
import androidx.databinding.BindingAdapter
import hu.okki.pilldroid.model.Medication

@BindingAdapter("medicationName")
fun TextView.setMedicationName(item: Medication) {
    text = item.name
}