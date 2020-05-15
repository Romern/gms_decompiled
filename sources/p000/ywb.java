package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Field;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: ywb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ywb {
    /* renamed from: a */
    public static bngx m44928a(List list) {
        bngs b = bngx.m109371b(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b.mo67668c(m44930a((DataType) it.next()));
        }
        return b.mo67664a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.Collection, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    public static bnic m44929a(Collection collection) {
        return bnic.m109488a(bnjd.m109575a((Iterable) collection, yvz.f54700a));
    }

    /* renamed from: a */
    public static caah m44930a(DataType dataType) {
        if (dataType == null) {
            return null;
        }
        if (bzzn.m126366b(dataType.f32064a)) {
            return bzzn.m126359a(dataType.f32064a);
        }
        return bzzn.m126364b(dataType.f32064a, bnkn.m109668a(dataType.f32065b, yvy.f54699a));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static DataType m44931a(caah caah) {
        Boolean bool;
        char c;
        Field field;
        DataType a = ywt.m44952a(caah.f172336b);
        if (a != null) {
            return a;
        }
        Field[] fieldArr = new Field[caah.f172337c.size()];
        int i = 0;
        while (true) {
            Boolean bool2 = null;
            if (i >= caah.f172337c.size()) {
                return new DataType(caah.f172336b, Arrays.asList(fieldArr), (String) null, (String) null);
            }
            caal caal = (caal) caah.f172337c.get(i);
            String str = caal.f172342b;
            if ((caal.f172341a & 4) != 0) {
                bool = Boolean.valueOf(caal.f172344d);
            } else {
                bool = null;
            }
            int i2 = 1;
            switch (str.hashCode()) {
                case -2131707655:
                    if (str.equals("accuracy")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -2006370880:
                    if (str.equals("body_temperature_measurement_location")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -1992012396:
                    if (str.equals("duration")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case -1859447186:
                    if (str.equals("blood_glucose_level")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1655966961:
                    if (str.equals("activity")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1595712862:
                    if (str.equals("cervical_dilation")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -1569430471:
                    if (str.equals("num_segments")) {
                        c = '3';
                        break;
                    }
                    c = 65535;
                    break;
                case -1440707631:
                    if (str.equals("oxygen_saturation")) {
                        c = '7';
                        break;
                    }
                    c = 65535;
                    break;
                case -1439978388:
                    if (str.equals("latitude")) {
                        c = '+';
                        break;
                    }
                    c = 65535;
                    break;
                case -1421917296:
                    if (str.equals("google.android.fitness.SportsModel")) {
                        c = '%';
                        break;
                    }
                    c = 65535;
                    break;
                case -1290561483:
                    if (str.equals("probability")) {
                        c = '?';
                        break;
                    }
                    c = 65535;
                    break;
                case -1279658572:
                    if (str.equals("google.android.fitness.SleepSchedule")) {
                        c = '$';
                        break;
                    }
                    c = 65535;
                    break;
                case -1248595573:
                    if (str.equals("supplemental_oxygen_flow_rate_average")) {
                        c = 'L';
                        break;
                    }
                    c = 65535;
                    break;
                case -1221029593:
                    if (str.equals("height")) {
                        c = '\'';
                        break;
                    }
                    c = 65535;
                    break;
                case -1220952307:
                    if (str.equals("blood_pressure_measurement_location")) {
                        c = 13;
                        break;
                    }
                    c = 65535;
                    break;
                case -1110756780:
                    if (str.equals("food_item")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case -921832806:
                    if (str.equals("percentage")) {
                        c = '>';
                        break;
                    }
                    c = 65535;
                    break;
                case -918978307:
                    if (str.equals("cervical_position")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case -810883302:
                    if (str.equals("volume")) {
                        c = 'R';
                        break;
                    }
                    c = 65535;
                    break;
                case -803244749:
                    if (str.equals("blood_pressure_systolic")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -791592328:
                    if (str.equals("weight")) {
                        c = 'T';
                        break;
                    }
                    c = 65535;
                    break;
                case -631448035:
                    if (str.equals("average")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -626344110:
                    if (str.equals("high_longitude")) {
                        c = ')';
                        break;
                    }
                    c = 65535;
                    break;
                case -619868540:
                    if (str.equals("low_longitude")) {
                        c = '.';
                        break;
                    }
                    c = 65535;
                    break;
                case -511934137:
                    if (str.equals("sensor_values")) {
                        c = 'F';
                        break;
                    }
                    c = 65535;
                    break;
                case -494782871:
                    if (str.equals("high_latitude")) {
                        c = '(';
                        break;
                    }
                    c = 65535;
                    break;
                case -452643911:
                    if (str.equals("step_length")) {
                        c = 'I';
                        break;
                    }
                    c = 65535;
                    break;
                case -437053898:
                    if (str.equals("meal_type")) {
                        c = '0';
                        break;
                    }
                    c = 65535;
                    break;
                case -298534604:
                    if (str.equals("google.android.fitness.SleepAttributes")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case -266093204:
                    if (str.equals("nutrients")) {
                        c = '4';
                        break;
                    }
                    c = 65535;
                    break;
                case -228366862:
                    if (str.equals("oxygen_saturation_measurement_method")) {
                        c = ':';
                        break;
                    }
                    c = 65535;
                    break;
                case -168965370:
                    if (str.equals("calories")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case -126538880:
                    if (str.equals("resistance_type")) {
                        c = 'B';
                        break;
                    }
                    c = 65535;
                    break;
                case -28590302:
                    if (str.equals("ovulation_test_result")) {
                        c = '6';
                        break;
                    }
                    c = 65535;
                    break;
                case 97759:
                    if (str.equals("bpm")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 107876:
                    if (str.equals("max")) {
                        c = '/';
                        break;
                    }
                    c = 65535;
                    break;
                case 108114:
                    if (str.equals("min")) {
                        c = '2';
                        break;
                    }
                    c = 65535;
                    break;
                case 113135:
                    if (str.equals("rpm")) {
                        c = 'D';
                        break;
                    }
                    c = 65535;
                    break;
                case 66639641:
                    if (str.equals("temporal_relation_to_sleep")) {
                        c = 'P';
                        break;
                    }
                    c = 65535;
                    break;
                case 109641799:
                    if (str.equals("speed")) {
                        c = 'H';
                        break;
                    }
                    c = 65535;
                    break;
                case 109761319:
                    if (str.equals("steps")) {
                        c = 'J';
                        break;
                    }
                    c = 65535;
                    break;
                case 112903913:
                    if (str.equals("watts")) {
                        c = 'S';
                        break;
                    }
                    c = 65535;
                    break;
                case 137365935:
                    if (str.equals("longitude")) {
                        c = ',';
                        break;
                    }
                    c = 65535;
                    break;
                case 198162679:
                    if (str.equals("low_latitude")) {
                        c = '-';
                        break;
                    }
                    c = 65535;
                    break;
                case 220648413:
                    if (str.equals("blood_pressure_diastolic_average")) {
                        c = 10;
                        break;
                    }
                    c = 65535;
                    break;
                case 248891292:
                    if (str.equals("blood_glucose_specimen_source")) {
                        c = 8;
                        break;
                    }
                    c = 65535;
                    break;
                case 286612066:
                    if (str.equals("activity_duration.descending")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 288459765:
                    if (str.equals("distance")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case 320627489:
                    if (str.equals("cervical_mucus_texture")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 419669488:
                    if (str.equals("google.android.fitness.Device")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 455965230:
                    if (str.equals("activity_duration.ascending")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 475560024:
                    if (str.equals("blood_pressure_systolic_max")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 475560262:
                    if (str.equals("blood_pressure_systolic_min")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 499324979:
                    if (str.equals("intensity")) {
                        c = '*';
                        break;
                    }
                    c = 65535;
                    break;
                case 514168969:
                    if (str.equals("google.android.fitness.GoalV2")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case 581888402:
                    if (str.equals("cervical_mucus_amount")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 623947695:
                    if (str.equals("oxygen_saturation_average")) {
                        c = '8';
                        break;
                    }
                    c = 65535;
                    break;
                case 738210934:
                    if (str.equals("google.android.fitness.StrideModel")) {
                        c = '&';
                        break;
                    }
                    c = 65535;
                    break;
                case 784486594:
                    if (str.equals("occurrences")) {
                        c = '5';
                        break;
                    }
                    c = 65535;
                    break;
                case 811264586:
                    if (str.equals("revolutions")) {
                        c = 'C';
                        break;
                    }
                    c = 65535;
                    break;
                case 815736413:
                    if (str.equals("oxygen_saturation_system")) {
                        c = '<';
                        break;
                    }
                    c = 65535;
                    break;
                case 829251210:
                    if (str.equals("confidence")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case 833248065:
                    if (str.equals("temporal_relation_to_meal")) {
                        c = 'O';
                        break;
                    }
                    c = 65535;
                    break;
                case 883161687:
                    if (str.equals("body_temperature")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 984367650:
                    if (str.equals("repetitions")) {
                        c = '@';
                        break;
                    }
                    c = 65535;
                    break;
                case 987136302:
                    if (str.equals("sleep_segment_type")) {
                        c = 'G';
                        break;
                    }
                    c = 65535;
                    break;
                case 998412730:
                    if (str.equals("activity_confidence")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1276952063:
                    if (str.equals("blood_pressure_diastolic")) {
                        c = 9;
                        break;
                    }
                    c = 65535;
                    break;
                case 1284575222:
                    if (str.equals("oxygen_saturation_max")) {
                        c = '9';
                        break;
                    }
                    c = 65535;
                    break;
                case 1284575460:
                    if (str.equals("oxygen_saturation_min")) {
                        c = ';';
                        break;
                    }
                    c = 65535;
                    break;
                case 1403812644:
                    if (str.equals("blood_pressure_diastolic_max")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1403812882:
                    if (str.equals("blood_pressure_diastolic_min")) {
                        c = 12;
                        break;
                    }
                    c = 65535;
                    break;
                case 1527920799:
                    if (str.equals("sensor_type")) {
                        c = 'E';
                        break;
                    }
                    c = 65535;
                    break;
                case 1708915229:
                    if (str.equals("timestamps")) {
                        c = 'Q';
                        break;
                    }
                    c = 65535;
                    break;
                case 1863800889:
                    if (str.equals("resistance")) {
                        c = 'A';
                        break;
                    }
                    c = 65535;
                    break;
                case 1880897007:
                    if (str.equals("oxygen_therapy_administration_mode")) {
                        c = '=';
                        break;
                    }
                    c = 65535;
                    break;
                case 1892583496:
                    if (str.equals("menstrual_flow")) {
                        c = '1';
                        break;
                    }
                    c = 65535;
                    break;
                case 1958191058:
                    if (str.equals("supplemental_oxygen_flow_rate_max")) {
                        c = 'M';
                        break;
                    }
                    c = 65535;
                    break;
                case 1958191296:
                    if (str.equals("supplemental_oxygen_flow_rate_min")) {
                        c = 'N';
                        break;
                    }
                    c = 65535;
                    break;
                case 1983072038:
                    if (str.equals("body_position")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 2020153105:
                    if (str.equals("blood_pressure_systolic_average")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 2036550306:
                    if (str.equals("altitude")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 2056323544:
                    if (str.equals("exercise")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 2072582505:
                    if (str.equals("cervical_firmness")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 2078370221:
                    if (str.equals("supplemental_oxygen_flow_rate")) {
                        c = 'K';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    field = Field.f32119p;
                    break;
                case 1:
                    field = Field.f32107d;
                    break;
                case 2:
                    field = Field.f32102Y;
                    break;
                case 3:
                    field = Field.f32114k;
                    break;
                case 4:
                    field = Field.f32115l;
                    break;
                case 5:
                    field = Field.f32120q;
                    break;
                case 6:
                    field = Field.f32090M;
                    break;
                case 7:
                    field = yxe.f54759k;
                    break;
                case 8:
                    field = yxe.f54762n;
                    break;
                case 9:
                    field = yxe.f54753e;
                    break;
                case 10:
                    field = yxe.f54754f;
                    break;
                case 11:
                    field = yxe.f54756h;
                    break;
                case 12:
                    field = yxe.f54755g;
                    break;
                case 13:
                    field = yxe.f54758j;
                    break;
                case 14:
                    field = yxe.f54749a;
                    break;
                case 15:
                    field = yxe.f54750b;
                    break;
                case 16:
                    field = yxe.f54752d;
                    break;
                case 17:
                    field = yxe.f54751c;
                    break;
                case 18:
                    field = yxe.f54757i;
                    break;
                case 19:
                    field = yxe.f54774z;
                    break;
                case 20:
                    field = yxe.f54741A;
                    break;
                case 21:
                    field = Field.f32116m;
                    break;
                case 22:
                    field = Field.f32079B;
                    break;
                case 23:
                    field = yxe.f54745E;
                    break;
                case 24:
                    field = yxe.f54746F;
                    break;
                case 25:
                    field = yxe.f54743C;
                    break;
                case 26:
                    field = yxe.f54742B;
                    break;
                case 27:
                    field = yxe.f54744D;
                    break;
                case 28:
                    field = Field.f32109f;
                    break;
                case 29:
                    field = Field.f32121r;
                    break;
                case 30:
                    if (bool == null || !bool.booleanValue()) {
                        field = Field.f32112i;
                        break;
                    } else {
                        field = Field.f32113j;
                        break;
                    }
                    break;
                case 31:
                    field = Field.f32085H;
                    break;
                case ' ':
                    field = Field.f32083F;
                    break;
                case '!':
                    field = Field.f32129z;
                    break;
                case '\"':
                    field = Field.f32127x;
                    break;
                case '#':
                    field = Field.f32105ab;
                    break;
                case '$':
                    field = Field.f32106ac;
                    break;
                case FelicaException.TYPE_NOT_CLOSED:
                    field = Field.f32104aa;
                    break;
                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                    field = Field.f32128y;
                    break;
                case FelicaException.TYPE_USED_BY_OTHER_APP:
                    field = Field.f32122s;
                    break;
                case FelicaException.TYPE_PUSH_FAILED:
                    field = Field.f32095R;
                    break;
                case ')':
                    field = Field.f32096S;
                    break;
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                    field = Field.f32101X;
                    break;
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    field = Field.f32117n;
                    break;
                case FelicaException.TYPE_RESET_FAILED:
                    field = Field.f32118o;
                    break;
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    field = Field.f32093P;
                    break;
                case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                    field = Field.f32094Q;
                    break;
                case '/':
                    field = Field.f32091N;
                    break;
                case '0':
                    field = Field.f32082E;
                    break;
                case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                    field = yxe.f54747G;
                    break;
                case '2':
                    field = Field.f32092O;
                    break;
                case '3':
                    field = Field.f32089L;
                    break;
                case '4':
                    field = Field.f32084G;
                    break;
                case '5':
                    field = Field.f32097T;
                    break;
                case '6':
                    field = yxe.f54748H;
                    break;
                case '7':
                    field = yxe.f54763o;
                    break;
                case FelicaException.TYPE_ACTIVATE_FAILED:
                    field = yxe.f54764p;
                    break;
                case '9':
                    field = yxe.f54766r;
                    break;
                case FelicaException.TYPE_OFFLINE_CANCELED:
                    field = yxe.f54773y;
                    break;
                case FelicaException.TYPE_NOW_EXECUTING_FALP:
                    field = yxe.f54765q;
                    break;
                case FelicaException.TYPE_MFC_NOT_FOUND:
                    field = yxe.f54772x;
                    break;
                case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                    field = yxe.f54771w;
                    break;
                case '>':
                    field = Field.f32124u;
                    break;
                case '?':
                    field = Field.f32103Z;
                    break;
                case '@':
                    field = Field.f32086I;
                    break;
                case KeyInformation.AES128_DES56:
                    field = Field.f32087J;
                    break;
                case 'B':
                    field = Field.f32088K;
                    break;
                case KeyInformation.AES128_DES112:
                    field = Field.f32078A;
                    break;
                case 'D':
                    field = Field.f32126w;
                    break;
                case 'E':
                    field = Field.f32098U;
                    break;
                case 'F':
                    field = Field.f32100W;
                    break;
                case 'G':
                    field = Field.f32108e;
                    break;
                case 'H':
                    field = Field.f32125v;
                    break;
                case 'I':
                    field = Field.f32111h;
                    break;
                case 'J':
                    field = Field.f32110g;
                    break;
                case 'K':
                    field = yxe.f54767s;
                    break;
                case 'L':
                    field = yxe.f54768t;
                    break;
                case 'M':
                    field = yxe.f54770v;
                    break;
                case 'N':
                    field = yxe.f54769u;
                    break;
                case KeyInformation.AES128:
                    field = yxe.f54760l;
                    break;
                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                    field = yxe.f54761m;
                    break;
                case 'Q':
                    field = Field.f32099V;
                    break;
                case 'R':
                    field = Field.f32081D;
                    break;
                case 'S':
                    field = Field.f32080C;
                    break;
                case 'T':
                    field = Field.f32123t;
                    break;
                default:
                    field = null;
                    break;
            }
            if (field != null) {
                int a2 = caak.m126415a(caal.f172343c);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (a2 == field.f32131b) {
                    fieldArr[i] = field;
                    i++;
                }
            }
            String str2 = caal.f172342b;
            int a3 = caak.m126415a(caal.f172343c);
            if (a3 != 0) {
                i2 = a3;
            }
            if ((4 & caal.f172341a) != 0) {
                bool2 = Boolean.valueOf(caal.f172344d);
            }
            field = new Field(str2, i2, bool2);
            fieldArr[i] = field;
            i++;
        }
    }
}
