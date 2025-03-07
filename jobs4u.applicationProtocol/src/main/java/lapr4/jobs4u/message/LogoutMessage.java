package lapr4.jobs4u.message;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import lapr4.jobs4u.EventListener;
import lapr4.jobs4u.protocol.MessageCode;
import lapr4.jobs4u.protocol.ProtocolMessage;

/**
 * @author 2DI2
 */
public class LogoutMessage extends Message {

    public LogoutMessage(final ProtocolMessage protocolMessage, final DataOutputStream output, final Socket socket,
            final EventListener eventListener) {
        super(protocolMessage, output, socket, eventListener);
    }

    @Override
    public void handle() throws IOException {
        eventListener.removeClient(socket);
        send(new ProtocolMessage((byte) 1, MessageCode.ACK));
    }
}