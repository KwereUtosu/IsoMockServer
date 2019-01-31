package isomockserver.isomockserver.configuration;

import isomockserver.isomockserver.service.FileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Kwerenachi Utosu
 * @date 1/13/2019
 */

@Service
public class ISOMockDetails {

    Logger logger = LoggerFactory.getLogger(FileService.class);

    private String fileContent(int mtii){
        String fileContent = "{\n" +
                "  \"request\" : {\n" +
                "    \"method\" : \"POST\",\n" +
                "\t\"mtii\" : \"0"+mtii+"00\",\n" +
                "\t\"packager\" : \"IsoPackager\"\n" +
                "  },\n" +
                "  \"response\" : {\n" +
                "\t\"responseFormat\" : \"String\",\n" +
                "    \"fields\" : {\n" +
                "\t  \"field-0\" : \"0"+mtii+"10\"\n" +
                "\t  \"field-1\" : \"0\"\n" +
                "\t  \"field-2\" : \"\"\n" +
                "\t  \"field-3\" : \"\"\n" +
                "\t  \"field-4\" : \"\"\n" +
                "\t  \"field-5\" : \"\"\n" +
                "\t  \"field-6\" : \"\"\n" +
                "\t  \"field-7\" : \"\"\n" +
                "\t  \"field-8\" : \"\"\n" +
                "\t  \"field-9\" : \"\"\n" +
                "\t  \"field-10\" : \"\"\n" +
                "\t  \"field-11\" : \"\"\n" +
                "\t  \"field-12\" : \"\"\n" +
                "\t  \"field-13\" : \"\"\n" +
                "\t  \"field-14\" : \"\"\n" +
                "\t  \"field-15\" : \"\"\n" +
                "\t  \"field-16\" : \"\"\n" +
                "\t  \"field-17\" : \"\"\n" +
                "\t  \"field-18\" : \"\"\n" +
                "\t  \"field-19\" : \"\"\n" +
                "\t  \"field-20\" : \"\"\n" +
                "\t  \"field-21\" : \"\"\n" +
                "\t  \"field-22\" : \"\"\n" +
                "\t  \"field-23\" : \"\"\n" +
                "\t  \"field-24\" : \"\"\n" +
                "\t  \"field-25\" : \"\"\n" +
                "\t  \"field-26\" : \"\"\n" +
                "\t  \"field-27\" : \"\"\n" +
                "\t  \"field-28\" : \"\"\n" +
                "\t  \"field-29\" : \"\"\n" +
                "\t  \"field-30\" : \"\"\n" +
                "\t  \"field-31\" : \"\"\n" +
                "\t  \"field-32\" : \"\"\n" +
                "\t  \"field-33\" : \"\"\n" +
                "\t  \"field-34\" : \"\"\n" +
                "\t  \"field-35\" : \"\"\n" +
                "\t  \"field-36\" : \"\"\n" +
                "\t  \"field-37\" : \"\"\n" +
                "\t  \"field-38\" : \"\"\n" +
                "\t  \"field-39\" : \"\"\n" +
                "\t  \"field-40\" : \"\"\n" +
                "\t  \"field-41\" : \"\"\n" +
                "\t  \"field-42\" : \"\"\n" +
                "\t  \"field-43\" : \"\"\n" +
                "\t  \"field-44\" : \"\"\n" +
                "\t  \"field-45\" : \"\"\n" +
                "\t  \"field-46\" : \"\"\n" +
                "\t  \"field-47\" : \"\"\n" +
                "\t  \"field-48\" : \"\"\n" +
                "\t  \"field-49\" : \"\"\n" +
                "\t  \"field-50\" : \"\"\n" +
                "\t  \"field-51\" : \"\"\n" +
                "\t  \"field-52\" : \"\"\n" +
                "\t  \"field-53\" : \"\"\n" +
                "\t  \"field-54\" : \"\"\n" +
                "\t  \"field-59\" : \"\"\n" +
                "\t  \"field-62\" : \"\"\n" +
                "\t  \"field-63\" : \"\"\n" +
                "\t  \"field-64\" : \"\"\n" +
                "\t  \"field-65\" : \"\"\n" +
                "\t  \"field-66\" : \"\"\n" +
                "\t  \"field-67\" : \"\"\n" +
                "\t  \"field-68\" : \"\"\n" +
                "\t  \"field-69\" : \"\"\n" +
                "\t  \"field-70\" : \"\"\n" +
                "\t  \"field-71\" : \"\"\n" +
                "\t  \"field-72\" : \"\"\n" +
                "\t  \"field-73\" : \"\"\n" +
                "\t  \"field-74\" : \"\"\n" +
                "\t  \"field-75\" : \"\"\n" +
                "\t  \"field-76\" : \"\"\n" +
                "\t  \"field-77\" : \"\"\n" +
                "\t  \"field-78\" : \"\"\n" +
                "\t  \"field-79\" : \"\"\n" +
                "\t  \"field-80\" : \"\"\n" +
                "\t  \"field-81\" : \"\"\n" +
                "\t  \"field-82\" : \"\"\n" +
                "\t  \"field-83\" : \"\"\n" +
                "\t  \"field-84\" : \"\"\n" +
                "\t  \"field-85\" : \"\"\n" +
                "\t  \"field-86\" : \"\"\n" +
                "\t  \"field-87\" : \"\"\n" +
                "\t  \"field-88\" : \"\"\n" +
                "\t  \"field-89\" : \"\"\n" +
                "\t  \"field-90\" : \"\"\n" +
                "\t  \"field-91\" : \"\"\n" +
                "\t  \"field-92\" : \"\"\n" +
                "\t  \"field-93\" : \"\"\n" +
                "\t  \"field-94\" : \"\"\n" +
                "\t  \"field-95\" : \"\"\n" +
                "\t  \"field-96\" : \"\"\n" +
                "\t  \"field-97\" : \"\"\n" +
                "\t  \"field-98\" : \"\"\n" +
                "\t  \"field-99\" : \"\"\n" +
                "\t  \"field-100\" : \"\"\n" +
                "\t  \"field-101\" : \"\"\n" +
                "\t  \"field-102\" : \"\"\n" +
                "\t  \"field-103\" : \"\"\n" +
                "\t  \"field-104\" : \"\"\n" +
                "\t  \"field-118\" : \"\"\n" +
                "\t  \"field-121\" : \"\"\n" +
                "\t  \"field-122\" : \"\"\n" +
                "\t  \"field-123\" : \"\"\n" +
                "\t  \"field-124\" : \"\"\n" +
                "\t  \"field-125\" : \"\"\n" +
                "\t  \"field-126\" : \"\"\n" +
                "\t  \"field-126.1\" : \"\"\n" +
                "\t  \"field-126.2\" : \"\"\n" +
                "\t  \"field-126.3\" : \"\"\n" +
                "\t  \"field-126.4\" : \"\"\n" +
                "\t  \"field-126.5\" : \"\"\n" +
                "\t  \"field-126.6\" : \"\"\n" +
                "\t  \"field-126.7\" : \"\"\n" +
                "\t  \"field-126.8\" : \"\"\n" +
                "\t  \"field-126.9\" : \"\"\n" +
                "\t  \"field-126.10\" : \"\"\n" +
                "\t  \"field-127\" : \"\"\n" +
                "\t  \"field-127.1\" : \"\"\n" +
                "\t  \"field-127.2\" : \"\"\n" +
                "\t  \"field-127.3\" : \"\"\n" +
                "\t  \"field-127.4\" : \"\"\n" +
                "\t  \"field-127.5\" : \"\"\n" +
                "\t  \"field-127.6\" : \"\"\n" +
                "\t  \"field-127.7\" : \"\"\n" +
                "\t  \"field-127.8\" : \"\"\n" +
                "\t  \"field-127.9\" : \"\"\n" +
                "\t  \"field-127.10\" : \"\"\n" +
                "\t  \"field-127.11\" : \"\"\n" +
                "\t  \"field-127.12\" : \"\"\n" +
                "\t  \"field-127.13\" : \"\"\n" +
                "\t  \"field-127.14\" : \"\"\n" +
                "\t  \"field-127.15\" : \"\"\n" +
                "\t  \"field-127.16\" : \"\"\n" +
                "\t  \"field-127.17\" : \"\"\n" +
                "\t  \"field-127.18\" : \"\"\n" +
                "\t  \"field-127.19\" : \"\"\n" +
                "\t  \"field-127.20\" : \"\"\n" +
                "\t  \"field-127.21\" : \"\"\n" +
                "\t  \"field-127.22\" : \"\"\n" +
                "\t  \"field-127.23\" : \"\"\n" +
                "\t  \"field-127.24\" : \"\"\n" +
                "\t  \"field-127.25\" : \"\"\n" +
                "\t  \"field-127.26\" : \"\"\n" +
                "\t  \"field-127.27\" : \"\"\n" +
                "\t  \"field-127.28\" : \"\"\n" +
                "\t  \"field-127.29\" : \"\"\n" +
                "    },\n" +
                "  },\n" +
                "\n" +
                "}\n";
        return fileContent;
    }

    public void writeToFile() {
        int mtii = 9;
        try {
            for (int i = 1; i < mtii; i++) {
//                File file = "C:\\isomock\\mtii0" + i + "00Mock.json";
                String fileContent = fileContent(i);
                String filePath = "C:\\isomock\\mtii0" + i + "00Mock.json";
                logger.info("File Path {} ", filePath);
                BufferedWriter writer = new BufferedWriter(
                        new FileWriter(filePath));
                if (!filePath.contains(fileContent)) {
                    writer.write(fileContent);
                    writer.close();
                }
            }
        }catch (IOException ex){
            logger.error("An Error Occurred Adding To The File(s) ", ex);
        }
    }

}
