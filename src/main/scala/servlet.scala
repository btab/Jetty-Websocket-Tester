package com.bluetheta.jwtester

import javax.servlet.http._
import org.eclipse.jetty.websocket._
import org.eclipse.jetty.websocket.WebSocket._

class Servlet extends WebSocketServlet {
	def doWebSocketConnect(request: HttpServletRequest, protocol: String) = new ServletSocket
}

class ServletSocket extends WebSocket with OnTextMessage {
	var connection: Connection = null
	def onClose(code: Int, message: String) = Unit
	def onOpen(c: Connection) = { connection = c }
	
	def onMessage(data: String): Unit = {
		val log = "thread " + Thread.currentThread.getId + " received: " + data
		println(log)
		connection.sendMessage(log)
	}
}
