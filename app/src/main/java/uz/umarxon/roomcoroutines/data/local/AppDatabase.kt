package uz.umarxon.roomcoroutines.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import uz.umarxon.roomcoroutines.data.local.dao.UserDao
import uz.umarxon.roomcoroutines.data.local.entity.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

}