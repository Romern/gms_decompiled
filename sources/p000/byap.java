package p000;

/* renamed from: byap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byap {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m124608a(String str) {
        char c;
        switch (str.hashCode()) {
            case -1861566022:
                if (str.equals("AUDIO_SOURCE_UNPROCESSED")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case -1718053844:
                if (str.equals("AUDIO_SOURCE_MIC")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1537076099:
                if (str.equals("AUDIO_SOURCE_VOICE_UPLINK")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1363602691:
                if (str.equals("AUDIO_SOURCE_FM_TUNER")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case -1215785089:
                if (str.equals("AUDIO_SOURCE_CAMCORDER")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1003611314:
                if (str.equals("AUDIO_SOURCE_VOICE_COMMUNICATION")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -958573626:
                if (str.equals("AUDIO_SOURCE_VOICE_CALL")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 170741756:
                if (str.equals("AUDIO_SOURCE_REMOVE_SUBMIX")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case 207589636:
                if (str.equals("AUDIO_SOURCE_VOICE_DOWNLINK")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 946919484:
                if (str.equals("AUDIO_SOURCE_HOTWORD")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1361071407:
                if (str.equals("AUDIO_SOURCE_VOICE_RECOGNITION")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1392001446:
                if (str.equals("AUDIO_SOURCE_DEFAULT")) {
                    c = 0;
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
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                throw new IllegalArgumentException();
        }
    }
}
