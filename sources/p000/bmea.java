package p000;

/* renamed from: bmea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmea extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmea f128897c;

    /* renamed from: e */
    private static volatile bxxk f128898e;

    /* renamed from: a */
    public int f128899a = 0;

    /* renamed from: b */
    public Object f128900b;

    /* renamed from: d */
    private byte f128901d = 2;

    static {
        bmea bmea = new bmea();
        f128897c = bmea;
        GeneratedMessageLite.m124024a(bmea.class, bmea);
    }

    private bmea() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f128901d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f128901d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f128897c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ᐼ\u0000", new Object[]{"b", "a", bmee.class, bmdx.class});
        } else if (i2 == 3) {
            return new bmea();
        } else {
            if (i2 == 4) {
                return new bxvd(f128897c);
            }
            if (i2 == 5) {
                return f128897c;
            }
            bxxk bxxk = f128898e;
            if (bxxk == null) {
                synchronized (bmea.class) {
                    bxxk = f128898e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128897c);
                        f128898e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
