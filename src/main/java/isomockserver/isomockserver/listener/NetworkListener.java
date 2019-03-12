package isomockserver.isomockserver.listener;

/**
 * @author Kwerenachi Utosu
 * @date 2/7/2019
 */

public interface NetworkListener {

    void notifyConnect();

    void notifyDisconnect();
}
