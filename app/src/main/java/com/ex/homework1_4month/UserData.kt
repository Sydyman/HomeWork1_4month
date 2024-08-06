package com.ex.homework1_4month


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class UserData(
    val name: String,
    val email: String,
    val password: Int
): Parcelable
