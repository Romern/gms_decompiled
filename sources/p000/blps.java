package p000;

/* renamed from: blps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blps extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blps f127286e;

    /* renamed from: f */
    private static volatile bxxk f127287f;

    /* renamed from: a */
    public int f127288a;

    /* renamed from: b */
    public blrk f127289b;

    /* renamed from: c */
    public blou f127290c;

    /* renamed from: d */
    public blrb f127291d;

    static {
        blps blps = new blps();
        f127286e = blps;
        bxvk.m124024a(blps.class, blps);
    }

    private blps() {
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
            return bxvk.m124022a(f127286e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new blps();
        } else {
            if (i2 == 4) {
                return new bxvd(f127286e);
            }
            if (i2 == 5) {
                return f127286e;
            }
            bxxk bxxk = f127287f;
            if (bxxk == null) {
                synchronized (blps.class) {
                    bxxk = f127287f;
                    if (bxxk == null) {
                        bxxk = new bxve(f127286e);
                        f127287f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
