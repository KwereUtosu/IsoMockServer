package isomockserver.isomockserver.configuration;

import isomockserver.isomockserver.listener.NetworkListener;
import isomockserver.isomockserver.packager.IsoMockPackager;
import isomockserver.isomockserver.utility.IsoLogger;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOPackager;
import org.jpos.transaction.participant.Switch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Kwerenachi Utosu
 * @date 2/5/2019
 */
@Component
public class NetworkClient implements NetworkListener {

    private static final Logger logger = LoggerFactory.getLogger(NetworkClient.class);

    private boolean isSignedUp;
    private Timer signOnTimer;
    private Timer keyExchangeTimer;
    private Timer pollingTimer;
    private final ExecutorService executors = Executors.newFixedThreadPool(10);

    private ISOPackager packager = new IsoMockPackager();

    @Autowired
    private NetworkConfig networkConfig;

    @Override
    public void notifyConnect() {
        logger.info("Connection event notified");
        executors.submit(() -> {
//            doSignOn();
        });
    }

    @Override
    public void notifyDisconnect() {
//        reset();
    }

    public ISOMsg sendRequest(ISOMsg isoMsg) throws IOException{
        ISOMsg response = new ISOMsg();

        if (isoMsg == null) {
            response.set(0, "0210");
            response.set(39, "99");
            return response;
        }
            isoMsg.setPackager(packager);

        byte[] message;
        try {
            message = isoMsg.pack();
        } catch (ISOException e) {
            logger.error("Could Not Package Exception ==> ", e);
            throw new IOException("Could not pack sign-on iso message", e);
        }

        byte[] fullMessage = prependLenBytes(message);

        try {
            System.out.println("In the Switch");
            networkConfig.write(fullMessage);
        } catch (IOException e) {
//            responseMatcherMap.remove(responseMatcher.getKey());
//            throw e;
        }
            return response;
    }

    private static byte[] prependLenBytes(byte[] data) {
        short len = (short) data.length;
        byte[] newBytes = new byte[len + 2];
        newBytes[0] = (byte) (len / 256);
        newBytes[1] = (byte) (len & 255);
        System.arraycopy(data, 0, newBytes, 2, len);
        return newBytes;
    }

}
