package com.teyyub.listes.model

import androidx.room.Entity
import androidx.room.PrimaryKey

//Model for goal, book, or movie
@Entity
data class Thing (
    var what: String, //is book, movie or goal
    var name: String,
    var details: String, //additional information
    var isDone: Boolean
) {
    @PrimaryKey(autoGenerate = true)
    var thingId: Int = 0 //id of thing

    companion object {
        //Possible 'what' property values of Thing object
        const val THING_GOAL = "Goal"
        const val THING_BOOK = "Book"
        const val THING_MOVIE = "Movie"
    }
}