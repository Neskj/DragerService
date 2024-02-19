package CTD.drager.Repository;

import CTD.drager.Model.Drager;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Arrays;

/*
*
* Это временная реализация репозитория, пока не подключена JDBC
*
*/

@Repository
public class DragerClassRepository implements DragerRepository {

    Drager ARHA_0405 = new Drager("Drager x-Am 5600", "ARHA-0405", "5222789", "ЦЕХ ИКС Уколов", "31.12.2024", "В резерве");
    Drager ARHA_0412 = new Drager("Drager x-Am 5600", "ARHA-0412", "5222790", "ЦЕХ ИКС Уколов", "31.12.2024", "В резерве");
    Drager ARKJ_0075 = new Drager("Drager x-Am 5600", "ARKJ-0075", "5400262", "ЦЕХ ИКС Уколов", "23.02.2024", "В работе");
    Drager ARKJ_0078 = new Drager("Drager x-Am 5600", "ARKJ-0078", "5400261", "ЦЕХ ИКС Уколов", "31.12.2024", "В поверке");
    Drager ARKC_0062 = new Drager("Drager x-Am 5600", "ARKC-0062", "5400260", "ЦЕХ ИКС Уколов", "31.12.2024", "В работе");
    Drager ARCB_0204 = new Drager("Drager x-Am 7000", "ARCB-0204", "3060184", "ЦЕХ ИКС Уколов", "06.04.2024", "В резерве");
    Drager ARCB_0524 = new Drager("Drager x-Am 7000", "ARCB-0524", "3060183", "ЦЕХ ИКС Уколов", "14.03.2024", "В работе");
    Drager ARCB_0212 = new Drager("Drager x-Am 7000", "ARCB-0212", "3060181", "ЦЕХ ИКС Уколов", "20.07.2024", "Калибровка");
    Drager ARAC_0376 = new Drager("Drager x-Am 7000", "ARAC-0376", "11.003363", "ЦЕХ ИКС Уколов", "31.12.2024", "В резерве");
    Drager ARRA_0214 = new Drager("Drager x-Am 8000", "ARRA-0214", "xxxxxxx", "ЦЕХ ИКС Уколов", "31.12.2024", "В работе");
    Drager ARRA_0219 = new Drager("Drager x-Am 8000", "ARRA-0219", "xxxxxxx", "ЦЕХ ИКС Уколов", "31.12.2024", "В работе");
    Drager ARAC_0372 = new Drager("Drager x-Am 7000", "ARAC_0372", "11.003362", "ЦЕХ ДВС Заразонов", "31.12.2024", "Командировка");
    Drager ARBJ_0335 = new Drager("Drager x-Am 7000", "ARBJ-0335", "11.003746A", "ЦЕХ ДВС Заразонов", "31.12.2024", "В резерве");
    Drager ARBJ_0375 = new Drager("Drager x-Am 7000", "ARBJ-0375", "11.096255", "ЦЕХ ДВС Заразонов", "18.10.2023", "В резерве");
    Drager ARDA_0243 = new Drager("Drager x-Am 7000", "ARDA-0243", "3155300", "ЦЕХ ДВС Заразонов", "22.06.2024", "В резерве");
    Drager ARDA_0295 = new Drager("Drager x-Am 7000", "ARDA-0295", "3155301", "ЦЕХ ДВС Заразонов", "31.12.2024", "В резерве");
    Drager ARDA_0305 = new Drager("Drager x-Am 7000", "ARDA-0305", "3158422", "ЦЕХ ДВС Заразонов", "22.06.2024", "В резерве");
    Drager ARPC_0206 = new Drager("Drager x-Am 8000", "ARPC-0206", "xxxxxxx", "ЦЕХ ДВС Заразонов", "15.02.2024", "В работе");
    Drager ARRA_0215 = new Drager("Drager x-Am 8000", "ARRA-0215", "xxxxxxx", "ЦЕХ ДВС Заразонов", "31.12.2024", "Калибровка");
    Drager ARRA_0225 = new Drager("Drager x-Am 8000", "ARRA-0225", "xxxxxxx", "ЦЕХ ДВС Заразонов", "31.12.2024", "В работе");
    Drager ARRA_0238 = new Drager("Drager x-Am 8000", "ARRA-0238", "xxxxxxx", "ЦЕХ ДВС Заразонов", "31.12.2024", "В работе");
    Drager ARRA_0218 = new Drager("Drager x-Am 8000", "ARRA-0218", "xxxxxxx", "ЦЕХ ДВС Заразонов", "31.12.2024", "В работе");
    Drager ARRA_0240 = new Drager("Drager x-Am 8000", "ARRA-0240", "xxxxxxx", "ЦЕХ ДВС Заразонов", "31.12.2024", "В работе");
    Drager ARHA_0406 = new Drager("Drager x-Am 5600", "ARHA-0406", "xxxxxxx", "ЦЕХ ДВС Косаримов", "31.12.2024", "В работе");
    Drager ARCB_0517 = new Drager("Drager x-Am 7000", "ARCB-0517", "3060178", "ЦЕХ ДВС Косаримов", "22.06.2024", "Калибровка");
    Drager ARCB_0526 = new Drager("Drager x-Am 7000", "ARCB-0526", "3060177", "ЦЕХ ДВС Косаримов", "14.03.2024", "В работе");
    Drager ARDA_0230 = new Drager("Drager x-Am 7000", "ARDA-0230", "3155281", "ЦЕХ ДВС Косаримов", "14.05.2024", "В работе");
    Drager AREE_0281 = new Drager("Drager x-Am 7000", "AREE-0281", "4680477", "ЦЕХ ДВС Косаримов", "11.06.2024", "Командировка");
    Drager ARFB_0202 = new Drager("Drager x-Am 7000", "ARFB-0202", "4919004", "ЦЕХ ДВС Косаримов", "14.05.2024", "В работе");
    Drager ARHA_0389 = new Drager("Drager x-Am 5600", "ARHA_0389", "5223510", "ЦЕХ ДКС Сорока", "31.12.2024", "В резерве");
    Drager ARAC_0373 = new Drager("Drager x-Am 7000", "ARAC_0373", "11.003364", "ЦЕХ ДЭКТ Акчурин", "06.03.2024", "В работе");
    Drager AREE_0282 = new Drager("Drager x-Am 7000", "AREE_0282", "4680478", "ЦЕХ ДЭКТ Акчурин", "06.04.2024", "Калибровка");
    Drager ARFB_0205 = new Drager("Drager x-Am 7000", "ARFB_0205", "4919005", "ЦЕХ ДЭКТ Акчурин", "20.07.2024", "Калибровка");

    public ArrayList<Drager> returnDrager() {
        Drager[] Dragers = {
                ARHA_0405, ARHA_0412, ARKJ_0075, ARKJ_0078, ARKC_0062, ARCB_0204, ARCB_0524, ARCB_0212, ARAC_0376, ARRA_0214, ARRA_0219,
                ARAC_0372, ARBJ_0335, ARBJ_0375, ARDA_0243, ARDA_0295, ARDA_0305, ARPC_0206, ARRA_0215, ARRA_0225, ARRA_0238, ARRA_0218,
                ARRA_0240, ARHA_0406, ARCB_0517, ARCB_0526, ARDA_0230, AREE_0281, ARFB_0202, ARHA_0389, ARAC_0373, AREE_0282, ARFB_0205
        };
        ArrayList<Drager> dragerList = new ArrayList<>();
        dragerList.addAll(Arrays.asList(Dragers));
        return dragerList;
    }
}