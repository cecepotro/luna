package mx.itson.luna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.itson.luna.entidades.Ubicacion
import mx.itson.luna.utilerias.RetrofitUtil
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        obtenerUbicacion()
    }

    fun obtenerUbicacion(){
        val llamada : Call<Ubicacion> =
            RetrofitUtil.getApi().getClima("27.9676629", "-110.9188319", true)

        llamada.enqueue(object: Callback<Ubicacion> {
            override fun onResponse(call: Call<Ubicacion>, response: Response<Ubicacion>) {
                val ubicacion : Ubicacion? = response.body()

                var a : Int = 1
            }

            override fun onFailure(call: Call<Ubicacion>, t: Throwable) {
                var a : Int = 1
            }
        })
    }
}