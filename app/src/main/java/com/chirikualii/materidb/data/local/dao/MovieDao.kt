package com.chirikualii.materidb.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.Query
import androidx.room.Update
import com.chirikualii.materidb.data.local.entity.MovieEntity
import com.chirikualii.materidb.data.model.Movie



@Dao
interface MovieDao {

    @Insert(onConflict =OnConflictStrategy.IGNORE)
    suspend fun insertMovie(movie:MovieEntity)


    @Query("SELECT * FROM movie WHERE type_movie = (:typeMovie)")
    suspend fun getListMovieNoPlaying(
        typeMovie:String
    ):List<MovieEntity>

    @Query("SELECT * FROM movie WHERE type_movie = (:typeMovie)")
    suspend fun getListMoviePopular(
        typeMovie:String
    ):List<MovieEntity>

    @Update(entity = MovieEntity::class)
    suspend fun updateMovie(MovieEntity:MovieEntity)

    @Query("UPDATE movie SET bookmark= :bookmark WHERE movieId = :movieId")
    suspend fun updateMovieWithQuery(movieId : String ,bookmark : Int)
}