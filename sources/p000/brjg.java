package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: brjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brjg {
    /* renamed from: a */
    public static brhm m114101a(Status status, String str) {
        sdo.m34959a(status);
        String str2 = status.f30116j;
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        int i = status.f30115i;
        if (i == 17510) {
            return new brho(str);
        }
        if (i == 17511) {
            return new brhv(str);
        }
        if (i == 17602) {
            return new brht(str);
        }
        switch (i) {
            case 17513:
                return new brhn(str);
            case 17514:
                return new brhl(str);
            case 17515:
                return new brhu(str);
            case 17516:
                return new brhs(str);
            case 17517:
                return new brhr(str);
            case 17518:
                return new brhp(str);
            case 17519:
                return new brhq(str);
            default:
                return new brhm(str);
        }
    }

    /* renamed from: a */
    public static String m114102a(String str) {
        int i = 20000;
        if (str.length() <= 20000) {
            return str;
        }
        if (Character.isHighSurrogate(str.charAt(19999)) && Character.isLowSurrogate(str.charAt(20000))) {
            i = 19999;
        }
        return str.substring(0, i);
    }
}
