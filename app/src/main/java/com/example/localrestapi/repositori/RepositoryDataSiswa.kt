package com.example.localrestapi.repositori

import com.example.localrestapi.apiservice.ServiceApiSiswa
import com.example.localrestapi.modeldata.DataSiswa
import retrofit2.Response

interface RepositoryDataSiswa{
    suspend fun getDataSiswa() : List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa) :retrofit2.Response<Void>
 //   suspend fun getSatuSiswa(id: Int) : DataSiswa
   // suspend fun editSatuSiswa(id: Int,dataSiswa: DataSiswa):retrofit2.Response<Void>
    //suspend fun hapusSatuSiswa(id: Int):retrofit2.Response<Void>
}

class JaringanRepositoryDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
): RepositoryDataSiswa{
    override suspend fun getDatasiswa() : List<DataSiswa> = serviceApiSiswa.getSiswa()

    override suspend fun postDataSiswa(dataSiswa: DataSiswa):retrofit2
        .Response<Void> = serviceApiSiswa.postSiswa(dataSiswa)

    //override suspend fun getSatuSiswa(id: Int): DataSiswa = serviceApiSiswa.getSatuSiswa
    //override suspend fun editSatuSiswa(id: Int,dataSiswa: DataSiswa):retrofit2.Response<Void>
    //override suspend fun hapusSatuSiswa(id: Int):retrofit2.Response<Void> = serviceApiSiswa
}