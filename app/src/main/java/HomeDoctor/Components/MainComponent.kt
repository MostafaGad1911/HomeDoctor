package mostafa.projects.dagger2.Component

import dagger.Component
import mostafa.projects.doctorjobs.Modules.Settings
import javax.inject.Singleton

@Singleton
@Component(modules = [Settings::class])
interface MainComponent {
    fun connect(): Settings
}