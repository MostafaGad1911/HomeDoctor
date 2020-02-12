// Generated by Dagger (https://dagger.dev).
package mostafa.projects.dagger2.Component;

import dagger.internal.Preconditions;
import mostafa.projects.doctorjobs.Modules.Settings;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMainComponent implements MainComponent {
  private DaggerMainComponent() {

  }

  public static Builder builder() {
    return new Builder();
  }

  public static MainComponent create() {
    return new Builder().build();
  }

  @Override
  public Settings connect() {
    return new Settings();}

  public static final class Builder {
    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder settings(Settings settings) {
      Preconditions.checkNotNull(settings);
      return this;
    }

    public MainComponent build() {
      return new DaggerMainComponent();
    }
  }
}