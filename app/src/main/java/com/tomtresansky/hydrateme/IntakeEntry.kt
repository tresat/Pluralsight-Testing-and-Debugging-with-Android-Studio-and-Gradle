package com.tomtresansky.hydrateme

class IntakeEntry(quantity: Int) {
    val timestamp: Long = System.currentTimeMillis();
    val intake = quantity
}