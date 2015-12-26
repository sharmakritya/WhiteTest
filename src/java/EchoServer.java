
import java.util.logging.Logger;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;


@ServerEndpoint("/echo")
public class EchoServer {

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @OnOpen
    public void onConnectionOpen(Session session) {
        logger.info("Connection opened ... " + session.getId());
    }

    @OnMessage
    public String onMessage(String message) {
        return message;
    }

    @OnClose
    public void onConnectionClose(Session session) {
        logger.info("Connection close .... " + session.getId());
    }
}
