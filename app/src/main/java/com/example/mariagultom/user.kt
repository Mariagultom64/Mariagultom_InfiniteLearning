package com.example.mariagultom

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
public class user (
    val editUsername:String,
    val editPassword:String
): Parcelable

