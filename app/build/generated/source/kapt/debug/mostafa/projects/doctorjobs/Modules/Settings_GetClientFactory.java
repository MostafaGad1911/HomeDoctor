// Generated by Dagger (https://dagger.dev).
package mostafa.projects.doctorjobs.Modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Settings_GetClientFactory implements Factory<Retrofit> {
  private final Settings module;

  public Settings_GetClientFactory(Settings module) {
    this.module = module;
  }

  @Override
  public Retrofit get() {
    return getClient(module);
  }

  public static Settings_GetClientFactory create(Settings module) {
    return new Settings_GetClientFactory(module);
  }

  public static Retrofit getClient(Settings instance) {
    return Preconditions.checkNotNull(instance.getClient(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
