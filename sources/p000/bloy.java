package p000;

/* renamed from: bloy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bloy extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bloy f127165c;

    /* renamed from: d */
    private static volatile bxxk f127166d;

    /* renamed from: a */
    public int f127167a;

    /* renamed from: b */
    public String f127168b = "";

    static {
        bloy bloy = new bloy();
        f127165c = bloy;
        GeneratedMessageLite.m124024a(bloy.class, bloy);
    }

    private bloy() {
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
            return GeneratedMessageLite.m124022a(f127165c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bloy();
        } else {
            if (i2 == 4) {
                return new bxvd(f127165c);
            }
            if (i2 == 5) {
                return f127165c;
            }
            bxxk bxxk = f127166d;
            if (bxxk == null) {
                synchronized (bloy.class) {
                    bxxk = f127166d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127165c);
                        f127166d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
