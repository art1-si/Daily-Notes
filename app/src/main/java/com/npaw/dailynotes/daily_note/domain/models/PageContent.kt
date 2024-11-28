package com.npaw.dailynotes.daily_note.domain.models

import java.util.Date

data class PageContent(
    val date: Date,
    val sections: Array<PageContent>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PageContent

        if (date != other.date) return false
        if (!sections.contentEquals(other.sections)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = date.hashCode()
        result = 31 * result + sections.contentHashCode()
        return result
    }

}
