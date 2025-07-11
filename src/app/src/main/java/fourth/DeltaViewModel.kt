package edu.chapman.monsutauoka.ui.fourth

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DeltaViewModel : ViewModel() {
    val text: MutableLiveData<String> = MutableLiveData("")
}
