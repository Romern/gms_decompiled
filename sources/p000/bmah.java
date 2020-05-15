package p000;

/* renamed from: bmah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmah extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmah f128446d;

    /* renamed from: e */
    private static volatile bxxk f128447e;

    /* renamed from: a */
    public int f128448a;

    /* renamed from: b */
    public bxwc f128449b = bxxn.f165040b;

    /* renamed from: c */
    public boolean f128450c;

    static {
        bmah bmah = new bmah();
        f128446d = bmah;
        GeneratedMessageLite.m124024a(bmah.class, bmah);
    }

    private bmah() {
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
            return GeneratedMessageLite.m124022a(f128446d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဇ\u0000", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmah();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f128446d;
            }
            bxxk bxxk = f128447e;
            if (bxxk == null) {
                synchronized (bmah.class) {
                    bxxk = f128447e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128446d);
                        f128447e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
