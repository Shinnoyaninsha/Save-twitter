package com.example.twitter

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MyViewModel(application:Application) : AndroidViewModel(application) {
    fun getTweet() {
        //fun getTweet(user:String)
        viewModelScope.launch {

            val result: TweetReponse =
                API.retrofitService.getTweets("Bearer AAAAAAAAAAAAAAAAAAAAAO80lAEAAAAAozx48NkNnEnMqYi5XpP1RFwT3Mg%3DWstl3aQ13pwkndkXiTP8rAqO0lXfOgavyoQhedLLK68JrelP1I")
            //Log.d("Tweets", API.retrofitService.getTweets("Bearer AAAAAAAAAAAAAAAAAAAAAO80lAEAAAAAozx48NkNnEnMqYi5XpP1RFwT3Mg%3DWstl3aQ13pwkndkXiTP8rAqO0lXfOgavyoQhedLLK68JrelP1I").toString())
            //getTweets(user...)
            /*withContext(Dispatchers.Main) {
                Toast.makeText(getApplication(), result.data[0].text, Toast.LENGTH_LONG).show()
            }*/
            withContext(Dispatchers.Main){
                _Listtweets.value=result.data
                //je n'ai pas trouvé comment récupérer la valeur de chaque champ dans le résultat
            }
        }
    }

    val _Listtweets=MutableLiveData<List<Tweet>>()
}