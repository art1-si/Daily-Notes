package com.npaw.dailynotes.daily_note.domain.models

data class PageSection(
    val id: Int,
    val order: Int,
    val title: String,
    val blocks: Array<BlockElement>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PageSection

        if (id != other.id) return false
        if (order != other.order) return false
        if (title != other.title) return false
        if (!blocks.contentEquals(other.blocks)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + order
        result = 31 * result + title.hashCode()
        result = 31 * result + blocks.contentHashCode()
        return result
    }


}
