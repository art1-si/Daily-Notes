package com.npaw.dailynotes.daily_note.domain.models

import java.util.Date

data class BlockElement(val id: Int, val date: Date, val sectionId: Int, val blockContent: BlockContent)

sealed class BlockContent(){
    data class NoteBlockContent(val title : String?, val bodyText : String) : BlockContent()
    data class ToDoBlockContent(val done : Boolean, val description : String) : BlockContent()
}