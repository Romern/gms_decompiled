package p000;

import android.util.Log;

/* renamed from: bwam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwam {

    /* renamed from: a */
    private static final int f158668a;

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    static {
        char c;
        String upperCase = bwar.f158672a.mo73413a("debug.mapview.logs", "NOTHING").toUpperCase();
        int i = 2;
        switch (upperCase.hashCode()) {
            case -1938386595:
                if (upperCase.equals("PERTAG")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1447660627:
                if (upperCase.equals("NOTHING")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 64897:
                if (upperCase.equals("ALL")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2251950:
                if (upperCase.equals("INFO")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2656902:
                if (upperCase.equals("WARN")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 64921139:
                if (upperCase.equals("DEBUG")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 66247144:
                if (upperCase.equals("ERROR")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1069090146:
                if (upperCase.equals("VERBOSE")) {
                    c = 2;
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
                i = 1;
                break;
            case 1:
            default:
                i = 0;
                break;
            case 2:
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
        }
        f158668a = i;
    }

    /* renamed from: a */
    public static final boolean m121655a(String str, int i) {
        switch (f158668a) {
            case 0:
                return false;
            case 1:
            case 2:
            case 3:
                return true;
            case 4:
                return i >= 4;
            case 5:
                return i >= 5;
            case 6:
                return i >= 6;
            default:
                return Log.isLoggable(str, i);
        }
    }
}
