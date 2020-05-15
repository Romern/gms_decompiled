package p000;

/* renamed from: blnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blnk extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blnk f126992a;

    /* renamed from: b */
    private static volatile bxxk f126993b;

    static {
        blnk blnk = new blnk();
        f126992a = blnk;
        GeneratedMessageLite.m124024a(blnk.class, blnk);
    }

    private blnk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f126992a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new blnk();
        }
        if (i2 == 4) {
            return new bxvd(f126992a);
        }
        if (i2 == 5) {
            return f126992a;
        }
        bxxk bxxk = f126993b;
        if (bxxk == null) {
            synchronized (blnk.class) {
                bxxk = f126993b;
                if (bxxk == null) {
                    bxxk = new bxve(f126992a);
                    f126993b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
