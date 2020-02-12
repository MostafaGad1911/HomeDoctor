// Generated by Dagger (https://dagger.dev).
package mostafa.projects.doctorjobs.Modules;

import HomeDoctor.Models.Detail;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Settings_ProvideDetailsFactory implements Factory<Detail> {
  private final Settings module;

  private final Provider<String> bloodAndGlucoseAndHeartAndMailAndPhoneAndRespireAndTempProvider;

  public Settings_ProvideDetailsFactory(Settings module,
      Provider<String> bloodAndGlucoseAndHeartAndMailAndPhoneAndRespireAndTempProvider) {
    this.module = module;
    this.bloodAndGlucoseAndHeartAndMailAndPhoneAndRespireAndTempProvider = bloodAndGlucoseAndHeartAndMailAndPhoneAndRespireAndTempProvider;
  }

  @Override
  public Detail get() {
    return provideDetails(module, bloodAndGlucoseAndHeartAndMailAndPhoneAndRespireAndTempProvider.get(), bloodAndGlucoseAndHeartAndMailAndPhoneAndRespireAndTempProvider.get(), bloodAndGlucoseAndHeartAndMailAndPhoneAndRespireAndTempProvider.get(), bloodAndGlucoseAndHeartAndMailAndPhoneAndRespireAndTempProvider.get(), bloodAndGlucoseAndHeartAndMailAndPhoneAndRespireAndTempProvider.get(), bloodAndGlucoseAndHeartAndMailAndPhoneAndRespireAndTempProvider.get(), bloodAndGlucoseAndHeartAndMailAndPhoneAndRespireAndTempProvider.get());
  }

  public static Settings_ProvideDetailsFactory create(Settings module,
      Provider<String> bloodAndGlucoseAndHeartAndMailAndPhoneAndRespireAndTempProvider) {
    return new Settings_ProvideDetailsFactory(module, bloodAndGlucoseAndHeartAndMailAndPhoneAndRespireAndTempProvider);
  }

  public static Detail provideDetails(Settings instance, String mail, String phone, String temp,
      String glucose, String blood, String respire, String heart) {
    return Preconditions.checkNotNull(instance.provideDetails(mail, phone, temp, glucose, blood, respire, heart), "Cannot return null from a non-@Nullable @Provides method");
  }
}
