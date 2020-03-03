package homedoctor

import android.app.Application
import com.appizona.yehiahd.fastsave.FastSave

class app : Application() {
    override fun onCreate() {
        super.onCreate()
        FastSave.init(applicationContext)

    }
}