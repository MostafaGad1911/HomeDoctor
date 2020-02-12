package HomeDoctor.Models

import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Named

@Module
class Detail @Inject
constructor(
    @param:Named("email") @get:Provides var email: String
    , @param:Named("phone") @get:Provides var phone: String
    , @param:Named("temperature") @get:Provides var temperature: String
    , @param:Named("glucose") @get:Provides var glucose: String
    , @param:Named("bloodP") @get:Provides var bloodP: String
    , @param:Named("respiration") @get:Provides var respiration: String
    , @param:Named("heart") @get:Provides var heart: String

) {

    override fun toString(): String {
        return "Detail(email='$email', phone='$phone', temperature='$temperature', glucose='$glucose', bloodP='$bloodP', respiration='$respiration', heart='$heart')"
    }
}
