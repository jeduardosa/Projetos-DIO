package learn.project.filmesflix.view


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import kotlinx.android.synthetic.main.movie_item_layout.view.*
import learn.project.filmesflix.R
import learn.project.filmesflix.model.Movie

class MoviesAdapter(private val moviesList: List<Movie>): RecyclerView.Adapter<MoviesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item_layout, parent, false)
        return MoviesViewHolder(view)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.itemView.apply {
        movieTitle.text = moviesList[position].titulo
        movieImage.load(moviesList[position].imagem) {
            placeholder(R.drawable.ic_image)
            fallback(R.drawable.ic_image)
        }
        }
    }

    override fun getItemCount(): Int = moviesList.size
}



