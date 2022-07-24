package uz.umarxon.roomcoroutines.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import uz.umarxon.roomcoroutines.RoomDBViewModel
import uz.umarxon.roomcoroutines.data.api.ApiHelper
import uz.umarxon.roomcoroutines.data.local.DatabaseHelper

class ViewModelFactory(private val apiHelper: ApiHelper, private val dbHelper: DatabaseHelper) :
    ViewModelProvider.Factory {
    /**
     * Creates a new instance of the given `Class`.
     *
     * Default implementation throws [UnsupportedOperationException].
     *
     * @param modelClass a `Class` whose instance is requested
     * @return a newly created ViewModel
     */
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RoomDBViewModel::class.java)) {
            return (RoomDBViewModel(apiHelper, dbHelper) as T)
        }
        throw IllegalArgumentException("Unknown class name")
    }
}