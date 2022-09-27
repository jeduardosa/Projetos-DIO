package learn.project.filmesflix.model


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val id: Int,
    val titulo: String,
    val imagem: String?,
    val descricao: String?,
    @SerializedName("data_lancamento")
    val dataLancamento: String?
): Parcelable {
    annotation class SerializedName(val value: String)
}
