package com.example.fitfrenzy.data.repository

import androidx.lifecycle.LiveData
import com.example.fitfrenzy.data.db.HistoryDao
import com.example.fitfrenzy.data.models.HistoryModel

class HistoryRepository(private val historyDao: HistoryDao) {

    val getDatabase: LiveData<List<HistoryModel>> = historyDao.getDatabase()

    suspend fun insertItem(historyModel: HistoryModel) {
        historyDao.insertItem(historyModel)
    }

    suspend fun deleteDatabase() {
        historyDao.deleteDatabase()
    }
}