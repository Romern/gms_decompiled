package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: birw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class birw {
    /* renamed from: a */
    public static /* synthetic */ String m102771a(int i) {
        if (i == 1) {
            return "MEDIA_MESSAGE_DATA";
        }
        if (i == 2) {
            return "MEDIA_MESSAGE_CODEC_CONFIG";
        }
        switch (i) {
            case 32769:
                return "MEDIA_MESSAGE_SETUP";
            case 32770:
                return "MEDIA_MESSAGE_START";
            case 32771:
                return "MEDIA_MESSAGE_STOP";
            case 32772:
                return "MEDIA_MESSAGE_CONFIG";
            case 32773:
                return "MEDIA_MESSAGE_ACK";
            case 32774:
                return "MEDIA_MESSAGE_MICROPHONE_REQUEST";
            case 32775:
                return "MEDIA_MESSAGE_MICROPHONE_RESPONSE";
            case 32776:
                return "MEDIA_MESSAGE_VIDEO_FOCUS_REQUEST";
            case 32777:
                return "MEDIA_MESSAGE_VIDEO_FOCUS_NOTIFICATION";
            case 32778:
                return "MEDIA_MESSAGE_UPDATE_UI_CONFIG_REQUEST";
            case 32779:
                return "MEDIA_MESSAGE_UPDATE_UI_CONFIG_REPLY";
            case 32780:
                return "MEDIA_MESSAGE_AUDIO_UNDERFLOW_NOTIFICATION";
            default:
                return "null";
        }
    }

    /* renamed from: b */
    public static int m102772b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        switch (i) {
            case AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT /*32768*/:
                return 32769;
            case 32769:
                return 32770;
            case 32770:
                return 32771;
            case 32771:
                return 32772;
            case 32772:
                return 32773;
            case 32773:
                return 32774;
            case 32774:
                return 32775;
            case 32775:
                return 32776;
            case 32776:
                return 32777;
            case 32777:
                return 32778;
            case 32778:
                return 32779;
            case 32779:
                return 32780;
            default:
                return 0;
        }
    }
}
