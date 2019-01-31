package isomockserver.isomockserver.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;

/**
 * @author Kwerenachi Utosu
 * @date 1/11/2019
 */

@Component
public class ISOMockConfig {

    Logger logger = LoggerFactory.getLogger(ISOMockConfig.class);

    @Autowired
    private ISOMockDetails isoMockDetails;

    @PostConstruct
    public void init(){
        createFolder();
        boolean response = createMockFiles();
        createFileContent(response);
    }

    /**
     * This method is used to create a Folder called "isomock"
     * in the C drive of the computer
     */
    public void createFolder(){
        File isoMock = new File("C:\\isomock");

        if (!isoMock.exists()){
            isoMock.mkdir();
            logger.info("IsoMock Folder Created Successfully");
        }else {
            logger.info("IsoMock Folder already exists");
        }

    }

    public boolean createMockFiles(){
        boolean response = true;
        try {

            for (int i = 1; i <= 8; i++) {
                File fileName = new File("C:\\isomock\\mtii0" + i + "00Mock.json");

                if (!fileName.exists()) {
                    fileName.createNewFile();
                    response = true;
                    logger.info("Mock Files Created Successfully");
                }else {
                    logger.info("Mock Files Already exists");
                }
            }
            return response;
        }catch (IOException e){
            response = false;
            logger.error("Error Creating File, Cause => ", e);
        }
        return response;
    }

    /**
     * This method writes into these file Created
     * @param response
     */
    public void createFileContent(boolean response){
        logger.info("Response {} ", response);
        if (response){
            isoMockDetails.writeToFile();
            logger.info("Written To Files");
        }else {
            logger.info("Couldn't write to File");
        }
    }

}
