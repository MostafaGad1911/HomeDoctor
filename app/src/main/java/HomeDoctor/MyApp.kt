package HomeDoctor

import android.app.Application
import com.appizona.yehiahd.fastsave.FastSave

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        FastSave.init(applicationContext)

    }
}