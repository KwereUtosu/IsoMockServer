package isomockserver.isomockserver.service;

import isomockserver.isomockserver.model.IsoMessageFields;
import org.jpos.iso.ISOMsg;

import java.io.File;

/**
 * @author Kwerenachi Utosu
 * @date 1/22/2019
 */


public interface FileService {

    /**
     * This method is used to write a string to a file
     * @param document
     * @return the File written
     */
    void writeToFile(String document);

    /**
     * This method is used to read from a file
     * @param file
     * @return file content in iso fields formats
     */
    IsoMessageFields readFromFile(File file);

    /**
     * This method is used to convert Iso Fields to Iso Messages
     * @param isoMessageFields
     * @return the Iso Message
     */
    ISOMsg conervtIsoFieldsToIsoMsg(IsoMessageFields isoMessageFields);

}
