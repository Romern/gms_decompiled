package p000;

/* renamed from: bmeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmeh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmeh f128936c;

    /* renamed from: e */
    private static volatile bxxk f128937e;

    /* renamed from: a */
    public String f128938a = "";

    /* renamed from: b */
    public String f128939b = "";

    /* renamed from: d */
    private int f128940d;

    static {
        bmeh bmeh = new bmeh();
        f128936c = bmeh;
        bxvk.m124024a(bmeh.class, bmeh);
    }

    private bmeh() {
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
            return bxvk.m124022a(f128936c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bmeh();
        } else {
            if (i2 == 4) {
                return new bxvd(f128936c);
            }
            if (i2 == 5) {
                return f128936c;
            }
            bxxk bxxk = f128937e;
            if (bxxk == null) {
                synchronized (bmeh.class) {
                    bxxk = f128937e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128936c);
                        f128937e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
