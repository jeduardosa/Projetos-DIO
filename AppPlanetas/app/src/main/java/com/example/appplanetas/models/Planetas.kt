package com.example.appplanetas.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Planetas(val Nome: String, val Descricao: String, val Imagem: Int):Parcelable
