package isomockserver.isomockserver.utility;

/**
 * Static metode za razna konvertovanja.
 */
public class MainConverter {

    /**
     * String niz sa vrednostima za oznake hexa vrednosti "0" -- "F".
     */
    private final static String[] hexChars = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

    /**
     * Converts a byte string to String with hex values<p>
     *
     * @param data Byte string that converts to String
     *
     * @return String
     */
    public static String hexify(byte[] data) {
        if (data == null) {
            return "null";
        }

        StringBuffer out = new StringBuffer(256);
        int x = data.length;

        for (int i = 0; i < x; i++) {
            out.append(hexChars[(data[i] >> 4) & 0x0f]);
            out.append(hexChars[data[i] & 0x0f]);
        }
        return out.toString();
    }

    /**
     * Parse bytes encoded as Hexadecimals into a byte array.<p>
     * @param byteString String containing HexBytes.
     *
     * @return byte array containing the parsed values of the given string.
     */
    public static byte[] parseHexString(String byteString) {
        int x = byteString.length();
        byte[] result = new byte[x / 2];
        for (int i = 0; i < x; i += 2) {
            String toParse = byteString.substring(i, i + 2);
            result[i / 2] = (byte) Integer.parseInt(toParse, 16);
        }
        return result;
    }

    /**
     * tring array.
     */
    /**
     * Hexify a byte array without blanks and \n.<p>
     *
     * @param data Byte array to convert to HexString
     *
     * @return HexString
     */
    public static String hexify1(byte[] data) {
        if (data == null) {
            return "null";
        }

        StringBuffer out = new StringBuffer(2256);
        int x = data.length;
        for (int i = 0; i < x; i++) {

            out.append(hexChars[(data[i] >> 4) & 0x0f]);
            out.append(hexChars[data[i] & 0x0f]);

        }

        return out.toString();
    }

    /**
     * Hexify a short value.<p>
     *
     * @param val Short value to be displayed as a HexString.
     *
     * @return HexString
     */
}
