package learn.project.filmesflix.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import learn.project.filmesflix.R
import learn.project.filmesflix.model.Movie

class MainActivity : AppCompatActivity() {

    private val listOfMovies = arrayListOf(
        Movie(
            id = 0,
            titulo = "Titanic",
            imagem = null,
            dataLancamento = null
        ),
        Movie(
            id = 0,
            titulo = "Central do Brasil",
            imagem = null,
            dataLancamento = null

        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        populateList()
    }

    private fun populateList(){
        moviesList.apply{
            hasFixedSize()
            adapter = MoviesAdapter(listOfMovies)
        }
    }
}