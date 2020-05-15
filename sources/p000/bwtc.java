package p000;

/* renamed from: bwtc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwtc {
    /* renamed from: a */
    public static /* synthetic */ String m122282a(int i) {
        switch (i) {
            case 1:
                return "SAFE_URI";
            case 2:
                return "EMBEDDED_REFERENCE";
            case 3:
                return "DATA_URI";
            case 4:
                return "FIFE_URL";
            case 5:
                return "EMBEDDED_IMAGE";
            case 6:
                return "SOURCE_NOT_SET";
            default:
                return "null";
        }
    }

    /* renamed from: b */
    public static int m122283b(int i) {
        if (i == 0) {
            return 6;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i != 5) {
            return i != 6 ? 0 : 5;
        }
        return 4;
    }
}
