package p000;

/* renamed from: bzzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzzh {

    /* renamed from: a */
    private static final String[] f171972a;

    static {
        String[] strArr = new String[123];
        f171972a = strArr;
        strArr[9] = "aerobics";
        strArr[119] = "archery";
        strArr[10] = "badminton";
        strArr[11] = "baseball";
        strArr[12] = "basketball";
        strArr[13] = "biathlon";
        strArr[1] = "biking";
        strArr[14] = "biking.hand";
        strArr[15] = "biking.mountain";
        strArr[16] = "biking.road";
        strArr[17] = "biking.spinning";
        strArr[18] = "biking.stationary";
        strArr[19] = "biking.utility";
        strArr[20] = "boxing";
        strArr[21] = "calisthenics";
        strArr[22] = "circuit_training";
        strArr[23] = "cricket";
        strArr[113] = "crossfit";
        strArr[106] = "curling";
        strArr[24] = "dancing";
        strArr[102] = "diving";
        strArr[117] = "elevator";
        strArr[25] = "elliptical";
        strArr[103] = "ergometer";
        strArr[118] = "escalator";
        strArr[6] = "exiting_vehicle";
        strArr[26] = "fencing";
        strArr[121] = "flossing";
        strArr[27] = "football.american";
        strArr[28] = "football.australian";
        strArr[29] = "football.soccer";
        strArr[30] = "frisbee_disc";
        strArr[31] = "gardening";
        strArr[32] = "golf";
        strArr[122] = "guided_breathing";
        strArr[33] = "gymnastics";
        strArr[34] = "handball";
        strArr[114] = "interval_training.high_intensity";
        strArr[35] = "hiking";
        strArr[36] = "hockey";
        strArr[37] = "horseback_riding";
        strArr[38] = "housework";
        strArr[104] = "ice_skating";
        strArr[0] = "in_vehicle";
        strArr[115] = "interval_training";
        strArr[39] = "jump_rope";
        strArr[40] = "kayaking";
        strArr[41] = "kettlebell_training";
        strArr[107] = "kick_scooter";
        strArr[42] = "kickboxing";
        strArr[43] = "kitesurfing";
        strArr[44] = "martial_arts";
        strArr[45] = "meditation";
        strArr[46] = "martial_arts.mixed";
        strArr[2] = "on_foot";
        strArr[108] = "other";
        strArr[47] = "p90x";
        strArr[48] = "paragliding";
        strArr[49] = "pilates";
        strArr[50] = "polo";
        strArr[51] = "racquetball";
        strArr[52] = "rock_climbing";
        strArr[53] = "rowing";
        strArr[54] = "rowing.machine";
        strArr[55] = "rugby";
        strArr[8] = "running";
        strArr[56] = "running.jogging";
        strArr[57] = "running.sand";
        strArr[58] = "running.treadmill";
        strArr[59] = "sailing";
        strArr[60] = "scuba_diving";
        strArr[61] = "skateboarding";
        strArr[62] = "skating";
        strArr[63] = "skating.cross";
        strArr[105] = "skating.indoor";
        strArr[64] = "skating.inline";
        strArr[65] = "skiing";
        strArr[66] = "skiing.back_country";
        strArr[67] = "skiing.cross_country";
        strArr[68] = "skiing.downhill";
        strArr[69] = "skiing.kite";
        strArr[70] = "skiing.roller";
        strArr[71] = "sledding";
        strArr[72] = "sleep";
        strArr[109] = "sleep.light";
        strArr[110] = "sleep.deep";
        strArr[111] = "sleep.rem";
        strArr[112] = "sleep.awake";
        strArr[73] = "snowboarding";
        strArr[74] = "snowmobile";
        strArr[75] = "snowshoeing";
        strArr[120] = "softball";
        strArr[76] = "squash";
        strArr[77] = "stair_climbing";
        strArr[78] = "stair_climbing.machine";
        strArr[79] = "standup_paddleboarding";
        strArr[3] = "still";
        strArr[80] = "strength_training";
        strArr[81] = "surfing";
        strArr[82] = "swimming";
        strArr[83] = "swimming.pool";
        strArr[84] = "swimming.open_water";
        strArr[85] = "table_tennis";
        strArr[86] = "team_sports";
        strArr[87] = "tennis";
        strArr[5] = "tilting";
        strArr[88] = "treadmill";
        strArr[4] = "unknown";
        strArr[89] = "volleyball";
        strArr[90] = "volleyball.beach";
        strArr[91] = "volleyball.indoor";
        strArr[92] = "wakeboarding";
        strArr[7] = "walking";
        strArr[93] = "walking.fitness";
        strArr[94] = "walking.nordic";
        strArr[95] = "walking.treadmill";
        strArr[116] = "walking.stroller";
        strArr[96] = "water_polo";
        strArr[97] = "weightlifting";
        strArr[98] = "wheelchair";
        strArr[99] = "windsurfing";
        strArr[100] = "yoga";
        strArr[101] = "zumba";
    }

    /* renamed from: a */
    public static int m126347a(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f171972a;
            if (i >= strArr.length) {
                return 4;
            }
            if (strArr[i].equals(str)) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: b */
    public static String m126349b(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("vnd.google.fitness.activity/") : "vnd.google.fitness.activity/".concat(valueOf);
    }

    /* renamed from: a */
    public static String m126348a(int i) {
        String str;
        if (i >= 0) {
            String[] strArr = f171972a;
            if (i >= strArr.length || (str = strArr[i]) == null) {
                return "unknown";
            }
            return str;
        }
        return "unknown";
    }
}
