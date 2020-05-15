package p000;

import com.felicanetworks.mfc.FelicaException;

/* renamed from: cast */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1708cast {
    /* renamed from: a */
    public static int m127114a(byte b) {
        switch (b) {
            case 17:
            case 18:
            case 19:
                return 1;
            case 20:
            case 21:
            case 22:
                return 2;
            default:
                switch (b) {
                    case 33:
                    case 34:
                    case 35:
                        return 3;
                    case 36:
                    case FelicaException.TYPE_NOT_CLOSED:
                    case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                        return 4;
                    default:
                        switch (b) {
                            case 52:
                            case 53:
                            case 54:
                                return 5;
                            default:
                                return 6;
                        }
                }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ String m127115a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "CARDHOLDER_OPERATED" : "MERCHANT_UNATTENDED" : "MERCHANT_ATTENDED" : "BANK_UNATTENDED" : "BANK_ATTENDED";
    }
}
