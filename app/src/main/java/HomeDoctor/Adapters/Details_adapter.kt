package homedoctor.adapters

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.karumi.dexter.Dexter
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionDeniedResponse
import com.karumi.dexter.listener.PermissionGrantedResponse
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.single.PermissionListener
import homedoctor.models.Detail
import kotlinx.android.synthetic.main.userrow.view.*
import projects.mostafagad.Diploma.R


class Details_adapter(val Details_list: ArrayList<Detail> , val ctx: Activity) :
    RecyclerView.Adapter<ViewHolderr>() {


    override fun onCreateViewHolder(parent: ViewGroup , viewType: Int): ViewHolderr {
        return ViewHolderr(
            LayoutInflater.from(ctx).inflate(
                R.layout.userrow ,
                parent ,
                false
            )
        )
    }

    // TODO src : https://www.youtube.com/watch?v=4kP_nqEhnPw
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onBindViewHolder(holder: ViewHolderr , position: Int) {
       val detail = Details_list.get(position)
        holder.username.text = detail.email
        holder.gluocosevalue.text = detail.glucose
        holder.bloodPressurevalue.text = detail.bloodP
        holder.heartratevalue.text = detail.heart
        holder.respirationratevalue.text = detail.respiration
        holder.temperaturevalue.text = detail.temperature
       holder.callImg.setOnClickListener(object : View.OnClickListener{
           override fun onClick(view: View?) {
               val call_number: String = detail.phone!!.trim()
               if (!call_number.equals("", ignoreCase = true) || !call_number.equals(null, ignoreCase = true)) {
                   val uri = "tel:$call_number"
                   callServiceProvider(uri)
               }


           }

       })
    }

    fun callServiceProvider(uri: String) {
        Dexter.withActivity(ctx)
                .withPermission(Manifest.permission.CALL_PHONE)
                .withListener(object : PermissionListener {
                    override fun onPermissionGranted(response: PermissionGrantedResponse) {
                        val intent = Intent(Intent.ACTION_DIAL)
                        intent.data = Uri.parse(uri)
                        ctx.startActivity(intent)
                    }

                    override fun onPermissionDenied(response: PermissionDeniedResponse) {
                        if (response.isPermanentlyDenied) {
                            Toast.makeText(ctx, "Please enable permissions", Toast.LENGTH_SHORT).show()
                        }
                    }

                    override fun onPermissionRationaleShouldBeShown(permission: PermissionRequest, token: PermissionToken) {
                        token.continuePermissionRequest()
                    }
                }).check()
    }


    override fun getItemCount(): Int {
        return Details_list.size
    }
}

class ViewHolderr(view: View) : RecyclerView.ViewHolder(view) {
    val username: TextView = view.username
    val callImg: ImageView = view.callImg
    val temperaturevalue:TextView = view.temperaturevalue
    val gluocosevalue :TextView = view.gluocosevalue
    val bloodPressurevalue :TextView = view.bloodPressurevalue
    val respirationratevalue:TextView = view.respirationratevalue
    val heartratevalue:TextView = view.heartratevalue
}
