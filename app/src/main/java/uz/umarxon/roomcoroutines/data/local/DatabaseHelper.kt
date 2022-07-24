package uz.umarxon.roomcoroutines.data.local

import uz.umarxon.roomcoroutines.data.local.entity.User


interface DatabaseHelper {

    suspend fun getUsers(): List<User>

    suspend fun insertAll(users: List<User>)

}