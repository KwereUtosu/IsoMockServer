package isomockserver.isomockserver.utility;

import org.jpos.iso.ISOMsg;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by ... on 24/11/2018.
 */
public class IsoLogger {

    private IsoLogger() {

    }

    public static String dump(ISOMsg msg) {
        if (msg == null) {
            return "<nothing>";
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

        msg.dump(ps, " ");
        return baos.toString();
    }
}
