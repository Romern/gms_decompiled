package android.support.p001v4.media;

import android.util.SparseIntArray;

/* renamed from: android.support.v4.media.AudioAttributesCompat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AudioAttributesCompat implements avg {

    /* renamed from: b */
    private static final SparseIntArray f1039b;

    /* renamed from: a */
    public AudioAttributesImpl f1040a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1039b = sparseIntArray;
        sparseIntArray.put(5, 1);
        f1039b.put(6, 2);
        f1039b.put(7, 2);
        f1039b.put(8, 1);
        f1039b.put(9, 1);
        f1039b.put(10, 1);
    }

    /* renamed from: a */
    static int m1189a(int i, int i2) {
        if ((i & 1) == 1) {
            return 7;
        }
        if ((i & 4) == 4) {
            return 6;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f1040a;
        if (audioAttributesImpl != null) {
            return audioAttributesImpl.equals(audioAttributesCompat.f1040a);
        }
        if (audioAttributesCompat.f1040a == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1040a.hashCode();
    }

    public final String toString() {
        return this.f1040a.toString();
    }

    /* renamed from: a */
    static String m1190a(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }
}
