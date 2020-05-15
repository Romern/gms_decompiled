package p000;

/* renamed from: tja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tja extends bxvk implements bxxd {

    /* renamed from: d */
    public static final tja f46174d;

    /* renamed from: e */
    private static volatile bxxk f46175e;

    /* renamed from: a */
    public int f46176a;

    /* renamed from: b */
    public long f46177b;

    /* renamed from: c */
    public long f46178c;

    static {
        tja tja = new tja();
        f46174d = tja;
        bxvk.m124024a(tja.class, tja);
    }

    private tja() {
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
            return bxvk.m124022a(f46174d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new tja();
        } else {
            if (i2 == 4) {
                return new bxvd(f46174d);
            }
            if (i2 == 5) {
                return f46174d;
            }
            bxxk bxxk = f46175e;
            if (bxxk == null) {
                synchronized (tja.class) {
                    bxxk = f46175e;
                    if (bxxk == null) {
                        bxxk = new bxve(f46174d);
                        f46175e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
