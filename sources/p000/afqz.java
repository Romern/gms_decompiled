package p000;

/* renamed from: afqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afqz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxvu f64588e = new afqy();

    /* renamed from: f */
    public static final afqz f64589f;

    /* renamed from: g */
    private static volatile bxxk f64590g;

    /* renamed from: a */
    public int f64591a;

    /* renamed from: b */
    public long f64592b;

    /* renamed from: c */
    public long f64593c;

    /* renamed from: d */
    public bxvt f64594d = bxvm.f164965b;

    static {
        afqz afqz = new afqz();
        f64589f = afqz;
        GeneratedMessageLite.m124024a(afqz.class, afqz);
    }

    private afqz() {
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
            return GeneratedMessageLite.m124022a(f64589f, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001e", new Object[]{"a", "b", "c", "d", afrg.m53476b()});
        } else if (i2 == 3) {
            return new afqz();
        } else {
            if (i2 == 4) {
                return new bxvd(f64589f);
            }
            if (i2 == 5) {
                return f64589f;
            }
            bxxk bxxk = f64590g;
            if (bxxk == null) {
                synchronized (afqz.class) {
                    bxxk = f64590g;
                    if (bxxk == null) {
                        bxxk = new bxve(f64589f);
                        f64590g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
