package com.example.mdimasuts

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(val name: String, val imageId: Int, val deskripsi: String) : Parcelable