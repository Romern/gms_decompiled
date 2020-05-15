package p000;

import com.felicanetworks.mfc.KeyInformation;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bufp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bufp {
    /* renamed from: a */
    public static int m119413a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 16) {
            return 17;
        }
        if (i == 17) {
            return 18;
        }
        if (i == 32) {
            return 33;
        }
        if (i == 33) {
            return 34;
        }
        if (i == 48) {
            return 49;
        }
        if (i == 49) {
            return 50;
        }
        if (i == 80) {
            return 81;
        }
        if (i == 96) {
            return 97;
        }
        if (i == 97) {
            return 98;
        }
        if (i == 128) {
            return 129;
        }
        if (i == 129) {
            return 130;
        }
        switch (i) {
            case 64:
                return 65;
            case KeyInformation.AES128_DES56:
                return 66;
            case 66:
                return 67;
            default:
                switch (i) {
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS:
                        return 113;
                    case 113:
                        return 114;
                    case 114:
                        return 115;
                    default:
                        switch (i) {
                            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD:
                                return 145;
                            case 145:
                                return 146;
                            case 146:
                                return 147;
                            default:
                                return 0;
                        }
                }
        }
    }
}
