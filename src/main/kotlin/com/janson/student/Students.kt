package com.janson.kotlin

class Students(var name: String, var english: Int, var math: Int) {
    fun print() {
        System.out.println(name + "\t" + english + "\t" + math
                + "\t" + (english+math)/2 );
    }
}