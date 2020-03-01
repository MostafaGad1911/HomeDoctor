package HomeDoctor.Models

import dagger.Module
import javax.inject.Inject

@Module
class Detail @Inject
constructor(
        val email: String?
        , val phone: String?
        , val temperature: String?
        , val glucose: String?
        , val bloodP: String?
        , val respiration: String?
        , val heart: String?

) {

    data class Builder(var email: String? = null
                       , var phone: String? = null
                       , var temperature: String? = null
                       , var glucose: String? = null
                       , var bloodP: String? = null
                       , var respiration: String? = null
                       , var heart: String? = null) {

        fun email(mail:String) = apply { this.email = mail }
        fun phone(phone:String) = apply { this.phone = phone }
        fun temperature(temp:String) = apply { this.temperature = temp }
        fun glucose(glucose:String) = apply { this.glucose = glucose }
        fun bloodP(bloodP:String) = apply { this.bloodP = bloodP }
        fun respiration(respiration:String) = apply { this.respiration = respiration }
        fun heart(heart:String) = apply { this.heart = heart }
        fun build() = Detail(email, phone, temperature, glucose , bloodP , respiration , heart)


    }

    override fun toString(): String {
        return "Detail(email='$email', phone='$phone', temperature='$temperature', glucose='$glucose', bloodP='$bloodP', respiration='$respiration', heart='$heart')"
    }
}
