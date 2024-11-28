package com.npaw.dailynotes.daily_note.domain

import com.npaw.dailynotes.daily_note.domain.models.BlockContent
import com.npaw.dailynotes.daily_note.domain.models.PageContent
import java.util.Date

interface DailyNoteRepository {
    suspend fun getPageContent(date: Date) : PageContent
    suspend fun createBlock(content: BlockContent, date: Date)
    suspend fun createSection(title: String,order: Int?, date: Date)
}