package p000;

import com.felicanetworks.mfc.FelicaException;

/* renamed from: bmnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmnq {
    /* renamed from: a */
    public static int m108208a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 18) {
            return 19;
        }
        if (i == 27) {
            return 28;
        }
        if (i == 45) {
            return 46;
        }
        if (i == 48) {
            return 49;
        }
        if (i == 49) {
            return 50;
        }
        switch (i) {
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
            default:
                switch (i) {
                    case 12:
                        return 13;
                    case 13:
                        return 14;
                    case 14:
                        return 15;
                    case 15:
                        return 16;
                    case 16:
                        return 17;
                    default:
                        switch (i) {
                            case 33:
                                return 34;
                            case 34:
                                return 35;
                            case 35:
                                return 36;
                            case 36:
                                return 37;
                            case FelicaException.TYPE_NOT_CLOSED:
                                return 38;
                            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                                return 39;
                            default:
                                switch (i) {
                                    case FelicaException.TYPE_PUSH_FAILED:
                                        return 41;
                                    case 41:
                                        return 42;
                                    case FelicaException.TYPE_ALREADY_ACTIVATED:
                                        return 43;
                                    case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                                        return 44;
                                    default:
                                        return 0;
                                }
                        }
                }
        }
    }
}
