package p000;

/* renamed from: anby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anby {
    /* renamed from: a */
    public static int m63960a(String str) {
        return m63961a(str, null);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m63962a(String str, String str2, int i) {
        char c;
        if (str == null) {
            return 1;
        }
        char c2 = 0;
        switch (str.hashCode()) {
            case -120126428:
                if (str.equals("com.google.android.dialer")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 189301402:
                if (str.equals("com.google.android.contacts")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 204163035:
                if (str.equals("com.google.android.syncadapters.contacts")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 325967270:
                if (str.equals("com.google.android.gms")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 3;
        }
        if (c == 1) {
            return 5;
        }
        if (c == 2) {
            return 4;
        }
        if (c != 3) {
            return 1;
        }
        if (str2 == null) {
            return i;
        }
        if (str2.hashCode() != 1122431255 || !str2.equals("romanesco")) {
            c2 = 65535;
        }
        return c2 != 0 ? 1 : 8;
    }

    /* renamed from: a */
    public static int m63961a(String str, String str2) {
        return m63962a(str, str2, 6);
    }
}
