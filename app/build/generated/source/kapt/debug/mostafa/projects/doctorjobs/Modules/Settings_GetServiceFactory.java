// Generated by Dagger (https://dagger.dev).
package mostafa.projects.doctorjobs.Modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import mostafa.projects.doctorjobs.Connection.ApiInterface;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Settings_GetServiceFactory implements Factory<ApiInterface> {
  private final Settings module;

  public Settings_GetServiceFactory(Settings module) {
    this.module = module;
  }

  @Override
  public ApiInterface get() {
    return getService(module);
  }

  public static Settings_GetServiceFactory create(Settings module) {
    return new Settings_GetServiceFactory(module);
  }

  public static ApiInterface getService(Settings instance) {
    return Preconditions.checkNotNull(instance.getService(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
