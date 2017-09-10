import io.github.gitbucket.runner.controller.RunnerController
import io.github.gitbucket.solidbase.model.Version

class Plugin extends gitbucket.core.plugin.Plugin {
  override val pluginId: String = "gbrunner"
  override val pluginName: String = "GitBucket Runner Plugin 🐼"
  override val description: String = "Run some tasks"
  override val versions: List[Version] = List(new Version("1.0.0"))

  println("🌍 Hey I'm starting...")


  override val controllers = Seq(
    "/*" -> new RunnerController()
  )
}
