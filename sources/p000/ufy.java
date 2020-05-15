package p000;

/* renamed from: ufy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ufy {

    /* renamed from: a */
    private static final sbw f47487a = new sbw("DownloadListenerUtils", "");

    /* renamed from: a */
    public static boolean m38299a(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static boolean m38300b(int i) {
        return i == 2 || i == 3;
    }

    /* renamed from: c */
    public static boolean m38301c(int i) {
        return i == 3 || i == 6;
    }

    /* renamed from: d */
    public static int m38302d(int i) {
        switch (i) {
            case 4:
            case 5:
                return 8;
            case 6:
            case 8:
                return 7;
            case 7:
                return 1502;
            default:
                f47487a.mo25374b("DownloadListenerUtils", "Not a valid state here: %s", Integer.valueOf(i));
                return 13;
        }
    }
}
