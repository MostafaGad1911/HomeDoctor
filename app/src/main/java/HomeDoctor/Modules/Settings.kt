package mostafa.projects.doctorjobs.Modules

import android.app.Activity
import android.content.Context
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.Module
import dagger.Provides
import homedoctor.adapters.Details_adapter
import homedoctor.helper.Constants
import homedoctor.models.Detail
import homedoctor.viewmodel.HomeDoctorViewModel
import mostafa.projects.doctorjobs.Connection.ApiInterface
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@Module
class Settings @Inject constructor() {
    lateinit var apiInterface: ApiInterface
    lateinit var retrofit: Retrofit
    @Provides
    fun getService(): ApiInterface {
        apiInterface = getClient().create(ApiInterface::class.java)
        return apiInterface
    }

    @Provides
    fun provideLinearLayoutManager(context: Context): LinearLayoutManager {
        return LinearLayoutManager(context)
    }

    @Provides
    fun provideDetails(): Detail.Builder {
        return Detail.Builder()
    }

    @Provides
    fun provideViewModel(activity: FragmentActivity): HomeDoctorViewModel {
        return ViewModelProviders.of(activity).get(HomeDoctorViewModel::class.java)
    }

    @Provides
    fun provideDetailsAdapter(context: Activity, detailList: ArrayList<Detail>): Details_adapter {
        return Details_adapter(detailList, context)
    }


    @Provides
    fun getClient(): Retrofit {
        val client = OkHttpClient.Builder()
                .connectTimeout(100, TimeUnit.SECONDS)
                .readTimeout(100, TimeUnit.SECONDS).build()

        retrofit = Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()

        return retrofit
    }
}