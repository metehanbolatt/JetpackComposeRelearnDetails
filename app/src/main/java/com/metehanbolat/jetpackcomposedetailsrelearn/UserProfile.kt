package com.metehanbolat.jetpackcomposedetailsrelearn

data class UserProfile(
    val name: String,
    val status: Boolean,
    val drawableId: Int
)

val userProfileList = arrayListOf(
    UserProfile(name = "Metehan Bolat", status = true, drawableId = R.drawable.profile_picture),
    UserProfile(name = "Emily Blunt", status = false, drawableId = R.drawable.emily),
    UserProfile(name = "John Krasinski", status = false, drawableId = R.drawable.john),
    UserProfile(name = "Metehan Bolat", status = true, drawableId = R.drawable.profile_picture),
    UserProfile(name = "Emily Blunt", status = false, drawableId = R.drawable.emily),
    UserProfile(name = "John Krasinski", status = false, drawableId = R.drawable.john),
    UserProfile(name = "Metehan Bolat", status = true, drawableId = R.drawable.profile_picture),
    UserProfile(name = "Emily Blunt", status = false, drawableId = R.drawable.emily),
    UserProfile(name = "John Krasinski", status = false, drawableId = R.drawable.john),
    UserProfile(name = "Metehan Bolat", status = true, drawableId = R.drawable.profile_picture),
    UserProfile(name = "Emily Blunt", status = false, drawableId = R.drawable.emily),
    UserProfile(name = "John Krasinski", status = false, drawableId = R.drawable.john),
    UserProfile(name = "Metehan Bolat", status = true, drawableId = R.drawable.profile_picture),
    UserProfile(name = "Emily Blunt", status = false, drawableId = R.drawable.emily),
    UserProfile(name = "John Krasinski", status = false, drawableId = R.drawable.john),
    UserProfile(name = "Metehan Bolat", status = true, drawableId = R.drawable.profile_picture),
    UserProfile(name = "Emily Blunt", status = false, drawableId = R.drawable.emily),
    UserProfile(name = "John Krasinski", status = false, drawableId = R.drawable.john),
)