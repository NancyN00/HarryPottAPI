package com.example.harrypotterapi.harryinterface

import com.example.harrypotterapi.apiresponse.Character
import retrofit2.http.GET

interface HarryPotterInterface {

    @GET ("characters")
    suspend fun getCharacters () : List<Character>
}