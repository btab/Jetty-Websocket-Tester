import sbt._
import sbt.Process._
import scala.io.Source
import scala.util.parsing.json.JSON

class JettyWebsocketTesterProject(info: ProjectInfo) extends DefaultWebProject(info) {
	val jettyClient    = "org.eclipse.jetty"  % "jetty-client"    % "7.4.2.v20110526" % "compile,test"
	val jettyWebApp    = "org.eclipse.jetty"  % "jetty-webapp"    % "7.4.2.v20110526" % "compile,test"
	val jettyWebSocket = "org.eclipse.jetty"  % "jetty-websocket" % "7.4.2.v20110526" % "compile,test"
	
	override def compileOptions = super.compileOptions ++ Seq(Unchecked)
}
