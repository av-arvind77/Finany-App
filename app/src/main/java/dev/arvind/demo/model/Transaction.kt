package dev.arvind.demo.model

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "all_transactions")
data class Transaction (
    @ColumnInfo(name = "title")
    var title: String,
    @ColumnInfo(name = "account")
    var amount: Double
)