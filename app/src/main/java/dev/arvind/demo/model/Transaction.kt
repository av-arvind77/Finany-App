package dev.arvind.demo.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.text.DateFormat

@Entity(tableName = "all_transactions")
data class Transaction (
    @ColumnInfo(name = "title")
    var title: String,
    @ColumnInfo(name = "account")
    var amount: Double,
    @ColumnInfo(name = "createdAt")
    var createdAt: Long =
        System.currentTimeMillis(),
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0
) : Serializable {
    val createdAtDateFormat: String
        get() =DateFormat.getDateTimeInstance()
            .format(createdAt) // Date Format: May 16, 2023, 01:35 AM
}