package p000;

/* renamed from: abes */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abes extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final abes f57287d;

    /* renamed from: e */
    private static volatile bxxk f57288e;

    /* renamed from: a */
    public int f57289a;

    /* renamed from: b */
    public String f57290b = "";

    /* renamed from: c */
    public String f57291c = "";

    static {
        abes abes = new abes();
        f57287d = abes;
        GeneratedMessageLite.m124024a(abes.class, abes);
    }

    private abes() {
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
            return GeneratedMessageLite.m124022a(f57287d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new abes();
        } else {
            if (i2 == 4) {
                return new bxvd(f57287d);
            }
            if (i2 == 5) {
                return f57287d;
            }
            bxxk bxxk = f57288e;
            if (bxxk == null) {
                synchronized (abes.class) {
                    bxxk = f57288e;
                    if (bxxk == null) {
                        bxxk = new bxve(f57287d);
                        f57288e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
