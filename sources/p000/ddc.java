package p000;

/* renamed from: ddc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ddc extends bxvk implements bxxd {

    /* renamed from: f */
    public static final ddc f12912f;

    /* renamed from: g */
    private static volatile bxxk f12913g;

    /* renamed from: a */
    public int f12914a;

    /* renamed from: b */
    public dcx f12915b;

    /* renamed from: c */
    public ddd f12916c;

    /* renamed from: d */
    public dct f12917d;

    /* renamed from: e */
    public dcv f12918e;

    static {
        ddc ddc = new ddc();
        f12912f = ddc;
        bxvk.m124024a(ddc.class, ddc);
    }

    private ddc() {
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
            return bxvk.m124022a(f12912f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new ddc();
        } else {
            if (i2 == 4) {
                return new bxvd(f12912f);
            }
            if (i2 == 5) {
                return f12912f;
            }
            bxxk bxxk = f12913g;
            if (bxxk == null) {
                synchronized (ddc.class) {
                    bxxk = f12913g;
                    if (bxxk == null) {
                        bxxk = new bxve(f12912f);
                        f12913g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
