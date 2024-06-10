package com.example.misscar.models
data class CategoryModel(
    val name : String,
    val coverUrl : String,
    val price : Int
) {
    constructor() : this("","", 0)
}