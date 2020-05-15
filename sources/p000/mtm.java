package p000;

import com.felicanetworks.mfc.FelicaException;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: mtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mtm {
    /* renamed from: a */
    public static int m25610a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 10:
                return 11;
            case 15:
                return 16;
            case 20:
                return 21;
            case 23:
                return 24;
            case 26:
                return 27;
            case 30:
                return 31;
            case FelicaException.TYPE_PUSH_FAILED:
                return 41;
            case 50:
                return 51;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                return 61;
            case 70:
                return 71;
            case 75:
                return 76;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                return 81;
            case 82:
                return 83;
            case 85:
                return 86;
            case 90:
                return 91;
            case 100:
                return 101;
            case 110:
                return 111;
            default:
                return 0;
        }
    }
}
