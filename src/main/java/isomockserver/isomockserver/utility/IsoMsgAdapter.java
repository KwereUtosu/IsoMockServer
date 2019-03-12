package isomockserver.isomockserver.utility;



import isomockserver.isomockserver.model.IsoMessageFields;
import org.jpos.iso.ISOMsg;


/**
 * @author Kwerenachi Utosu
 * @date 1/22/2019
 */

public final class IsoMsgAdapter {

    private IsoMsgAdapter() {
    }

    public static ISOMsg convertIsoFieldsToMessage(IsoMessageFields isoMessageFields){
        ISOMsg isoMsg = new ISOMsg();
        isoMsg.set(0, isoMessageFields.getMtii());
        isoMsg.set(1, isoMessageFields.getField1());
        isoMsg.set(2, isoMessageFields.getField2());
        isoMsg.set(3, isoMessageFields.getField3());
        isoMsg.set(4, isoMessageFields.getField4());
        isoMsg.set(5, isoMessageFields.getField5());
        isoMsg.set(6, isoMessageFields.getField6());
        isoMsg.set(7, isoMessageFields.getField7());
        isoMsg.set(8, isoMessageFields.getField8());
        isoMsg.set(9, isoMessageFields.getField9());
        isoMsg.set(10, isoMessageFields.getField10());
        isoMsg.set(11, isoMessageFields.getField11());
        isoMsg.set(12, isoMessageFields.getField12());
        isoMsg.set(13, isoMessageFields.getField13());
        isoMsg.set(14, isoMessageFields.getField14());
        isoMsg.set(15, isoMessageFields.getField15());
        isoMsg.set(16, isoMessageFields.getField16());
        isoMsg.set(17, isoMessageFields.getField17());
        isoMsg.set(18, isoMessageFields.getField18());
        isoMsg.set(19, isoMessageFields.getField19());
        isoMsg.set(20, isoMessageFields.getField20());
        isoMsg.set(21, isoMessageFields.getField21());
        isoMsg.set(22, isoMessageFields.getField22());
        isoMsg.set(23, isoMessageFields.getField23());
        isoMsg.set(24, isoMessageFields.getField24());
        isoMsg.set(25, isoMessageFields.getField25());
        isoMsg.set(26, isoMessageFields.getField26());
        isoMsg.set(27, isoMessageFields.getField27());
        isoMsg.set(28, isoMessageFields.getField28());
        isoMsg.set(29, isoMessageFields.getField29());
        isoMsg.set(30, isoMessageFields.getField30());
        isoMsg.set(31, isoMessageFields.getField31());
        isoMsg.set(32, isoMessageFields.getField32());
//        isoMsg.set(33, isoMessageFields.getField33());
        isoMsg.set(34, isoMessageFields.getField34());
        isoMsg.set(35, isoMessageFields.getField35());
        isoMsg.set(36, isoMessageFields.getField36());
        isoMsg.set(37, isoMessageFields.getField37());
        isoMsg.set(38, isoMessageFields.getField38());
        isoMsg.set(39, isoMessageFields.getField39());
        isoMsg.set(40, isoMessageFields.getField40());
        isoMsg.set(41, isoMessageFields.getField41());
        isoMsg.set(42, isoMessageFields.getField42());
        isoMsg.set(43, isoMessageFields.getField43());
        isoMsg.set(44, isoMessageFields.getField44());
        isoMsg.set(45, isoMessageFields.getField45());
        isoMsg.set(46, isoMessageFields.getField46());
        isoMsg.set(47, isoMessageFields.getField47());
        isoMsg.set(48, isoMessageFields.getField48());
        isoMsg.set(49, isoMessageFields.getField49());
        isoMsg.set(50, isoMessageFields.getField50());
        isoMsg.set(51, isoMessageFields.getField51());
        isoMsg.set(52, isoMessageFields.getField52());
        isoMsg.set(53, isoMessageFields.getField53());
        isoMsg.set(54, isoMessageFields.getField54());
        isoMsg.set(55, isoMessageFields.getField55());
        isoMsg.set(56, isoMessageFields.getField56());
        isoMsg.set(57, isoMessageFields.getField57());
        isoMsg.set(58, isoMessageFields.getField58());
        isoMsg.set(59, isoMessageFields.getField59());
        isoMsg.set(60, isoMessageFields.getField60());
        isoMsg.set(61, isoMessageFields.getField61());
        isoMsg.set(62, isoMessageFields.getField62());
        isoMsg.set(63, isoMessageFields.getField63());
        isoMsg.set(64, isoMessageFields.getField64());
        isoMsg.set(65, isoMessageFields.getField65());
        isoMsg.set(66, isoMessageFields.getField66());
        isoMsg.set(67, isoMessageFields.getField67());
        isoMsg.set(68, isoMessageFields.getField68());
        isoMsg.set(69, isoMessageFields.getField69());
        isoMsg.set(70, isoMessageFields.getField70());
        isoMsg.set(71, isoMessageFields.getField71());
        isoMsg.set(72, isoMessageFields.getField72());
        isoMsg.set(73, isoMessageFields.getField73());
        isoMsg.set(74, isoMessageFields.getField74());
        isoMsg.set(75, isoMessageFields.getField75());
        isoMsg.set(76, isoMessageFields.getField76());
        isoMsg.set(77, isoMessageFields.getField77());
        isoMsg.set(78, isoMessageFields.getField78());
        isoMsg.set(79, isoMessageFields.getField79());
        isoMsg.set(80, isoMessageFields.getField80());
        isoMsg.set(81, isoMessageFields.getField81());
        isoMsg.set(82, isoMessageFields.getField82());
        isoMsg.set(83, isoMessageFields.getField83());
        isoMsg.set(84, isoMessageFields.getField84());
        isoMsg.set(85, isoMessageFields.getField85());
        isoMsg.set(86, isoMessageFields.getField86());
        isoMsg.set(87, isoMessageFields.getField87());
        isoMsg.set(88, isoMessageFields.getField88());
        isoMsg.set(89, isoMessageFields.getField89());
        isoMsg.set(90, isoMessageFields.getField90());
        isoMsg.set(91, isoMessageFields.getField91());
        isoMsg.set(92, isoMessageFields.getField92());
        isoMsg.set(93, isoMessageFields.getField93());
        isoMsg.set(94, isoMessageFields.getField94());
        isoMsg.set(95, isoMessageFields.getField95());
        isoMsg.set(96, isoMessageFields.getField96());
        isoMsg.set(97, isoMessageFields.getField97());
        isoMsg.set(98, isoMessageFields.getField98());
        isoMsg.set(99, isoMessageFields.getField99());
        isoMsg.set(100, isoMessageFields.getField100());
        isoMsg.set(101, isoMessageFields.getField101());
        isoMsg.set(102, isoMessageFields.getField102());
        isoMsg.set(103, isoMessageFields.getField103());
        isoMsg.set(104, isoMessageFields.getField104());
        isoMsg.set(105, isoMessageFields.getField105());
        isoMsg.set(106, isoMessageFields.getField106());
        isoMsg.set(107, isoMessageFields.getField107());
        isoMsg.set(108, isoMessageFields.getField108());
        isoMsg.set(109, isoMessageFields.getField109());
        isoMsg.set(110, isoMessageFields.getField110());
        isoMsg.set(115, isoMessageFields.getField115());
        isoMsg.set(116, isoMessageFields.getField116());
        isoMsg.set(117, isoMessageFields.getField117());
        isoMsg.set(118, isoMessageFields.getField118());
        isoMsg.set(119, isoMessageFields.getField119());
        isoMsg.set(120, isoMessageFields.getField120());
        isoMsg.set(121, isoMessageFields.getField121());
        isoMsg.set(122, isoMessageFields.getField122());
        isoMsg.set(123, isoMessageFields.getField123());
        isoMsg.set(124, isoMessageFields.getField124());
        isoMsg.set(125, isoMessageFields.getField125());
        isoMsg.set(126, isoMessageFields.getField126());
        isoMsg.set(127, isoMessageFields.getField127());

        return isoMsg;
    }

}
