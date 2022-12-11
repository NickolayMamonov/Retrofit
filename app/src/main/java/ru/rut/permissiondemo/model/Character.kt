package ru.rut.permissiondemo.model

data class Character(
    var url: String,
    var name: String,
    var culture: String,
    var born : String,
    var titles: List<String>,
    var aliases: List<String>,
    var playedBy: List<String>,
)
