// Generated by Dagger (https://dagger.dev).
package mostafa.projects.doctorjobs.Modules;

import HomeDoctor.Models.Detail;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Settings_ProvideDetailsFactory implements Factory<Detail.Builder> {
  private final Settings module;

  public Settings_ProvideDetailsFactory(Settings module) {
    this.module = module;
  }

  @Override
  public Detail.Builder get() {
    return provideDetails(module);
  }

  public static Settings_ProvideDetailsFactory create(Settings module) {
    return new Settings_ProvideDetailsFactory(module);
  }

  public static Detail.Builder provideDetails(Settings instance) {
    return Preconditions.checkNotNull(instance.provideDetails(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
