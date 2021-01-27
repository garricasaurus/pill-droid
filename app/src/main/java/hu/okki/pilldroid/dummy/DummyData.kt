package hu.okki.pilldroid.dummy

import hu.okki.pilldroid.model.Dosage
import hu.okki.pilldroid.model.Medication
import java.util.*

var dummyMedList = mutableListOf(
    Medication(UUID.randomUUID(), "Medication 1", mutableListOf(
        Dosage(1, 9, 0, "100mg"),
        Dosage(1, 18, 0, "50mg")
    )),
    Medication(UUID.randomUUID(),"Medication 2", mutableListOf(
        Dosage(2, 12, 0, "200mg")
    )),
    Medication(UUID.randomUUID(),"Medication 3", mutableListOf(
        Dosage(1, 9, 0, "50mg"),
        Dosage(1, 12, 0, "50mg"),
        Dosage(1, 19, 0, "50mg")
    ))
)