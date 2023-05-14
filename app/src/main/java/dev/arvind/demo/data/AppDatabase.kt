package dev.arvind.demo.data

import androidx.room.Database
import androidx.room.RoomDatabase
import dev.arvind.demo.model.Transaction

@Database(
    entities = [Transaction::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getTransactionDao(): TransactionDao
}