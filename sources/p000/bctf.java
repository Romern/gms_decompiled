package p000;

/* renamed from: bctf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bctf {
    /* renamed from: a */
    public static /* synthetic */ String m89915a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CHIPS_ONLY" : "RICH_TEXT" : "CUSTOM" : "TEXT" : "UNSUPPORTED";
    }

    /* renamed from: b */
    public static int m89916b(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 1 : 5;
        }
        return 4;
    }
}
