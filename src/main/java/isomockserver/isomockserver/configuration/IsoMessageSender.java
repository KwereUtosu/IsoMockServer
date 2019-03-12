package isomockserver.isomockserver.configuration;

import isomockserver.isomockserver.packager.IsoMockPackager;
import isomockserver.isomockserver.utility.IsoLogger;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOPackager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

/**
 * @author Kwerenachi Utosu
 * @date 2/8/2019
 */

@Component
public class IsoMessageSender implements Consumer<byte[]> {

    private static final Logger logger = LoggerFactory.getLogger(NetworkClient.class);

    private final ExecutorService executors = Executors.newFixedThreadPool(10);

    private ISOPackager packager = new IsoMockPackager();


    /**
     * Accepts a byte array and converts to an ISOMsg used to notify waiting
     * @param bytes the data to be processed as a response
     */
    @Override
    public void accept(byte[] bytes) {
        ISOMsg responseIso = new ISOMsg();
        try {
            packager.unpack(responseIso, bytes);
            logger.info("The Actual Iso Message Gotten {}", IsoLogger.dump(responseIso));
        } catch (ISOException e) {
            logger.error("Could not unpack response iso bytes", e);
        }
        logger.error("Could not get response matcher for response {}", IsoLogger.dump(responseIso));
    }

    public String checkMTIICode(ISOMsg isoMsg){
        String mtii = "";
        if (isoMsg != null){
            mtii = isoMsg.getString(0);
        }
        return mtii;
    }


}
