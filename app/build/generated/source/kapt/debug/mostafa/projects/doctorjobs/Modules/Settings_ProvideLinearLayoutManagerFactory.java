// Generated by Dagger (https://dagger.dev).
package mostafa.projects.doctorjobs.Modules;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Settings_ProvideLinearLayoutManagerFactory implements Factory<LinearLayoutManager> {
  private final Settings module;

  private final Provider<Context> contextProvider;

  public Settings_ProvideLinearLayoutManagerFactory(Settings module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public LinearLayoutManager get() {
    return provideLinearLayoutManager(module, contextProvider.get());
  }

  public static Settings_ProvideLinearLayoutManagerFactory create(Settings module,
      Provider<Context> contextProvider) {
    return new Settings_ProvideLinearLayoutManagerFactory(module, contextProvider);
  }

  public static LinearLayoutManager provideLinearLayoutManager(Settings instance, Context context) {
    return Preconditions.checkNotNull(instance.provideLinearLayoutManager(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
