package p000;

/* renamed from: blpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpy extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blpy f127303d;

    /* renamed from: e */
    private static volatile bxxk f127304e;

    /* renamed from: a */
    public int f127305a;

    /* renamed from: b */
    public int f127306b = 1;

    /* renamed from: c */
    public String f127307c = "";

    static {
        blpy blpy = new blpy();
        f127303d = blpy;
        GeneratedMessageLite.m124024a(blpy.class, blpy);
    }

    private blpy() {
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
            return GeneratedMessageLite.m124022a(f127303d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", blpw.f127302a, "c"});
        } else if (i2 == 3) {
            return new blpy();
        } else {
            if (i2 == 4) {
                return new bxvd(f127303d);
            }
            if (i2 == 5) {
                return f127303d;
            }
            bxxk bxxk = f127304e;
            if (bxxk == null) {
                synchronized (blpy.class) {
                    bxxk = f127304e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127303d);
                        f127304e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
