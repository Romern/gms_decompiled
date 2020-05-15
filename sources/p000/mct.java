package p000;

/* renamed from: mct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mct extends bxvk implements bxxd {

    /* renamed from: f */
    public static final mct f33445f;

    /* renamed from: g */
    private static volatile bxxk f33446g;

    /* renamed from: a */
    public int f33447a;

    /* renamed from: b */
    public int f33448b;

    /* renamed from: c */
    public int f33449c;

    /* renamed from: d */
    public bxtx f33450d = bxtx.f164797b;

    /* renamed from: e */
    public int f33451e;

    static {
        mct mct = new mct();
        f33445f = mct;
        bxvk.m124024a(mct.class, mct);
    }

    private mct() {
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
            return bxvk.m124022a(f33445f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0002\u0003ဌ\u0003\u0005ဌ\u0001", new Object[]{"a", "b", mcu.f33452a, "d", "e", mcm.f33425a, "c", mcr.f33444a});
        } else if (i2 == 3) {
            return new mct();
        } else {
            if (i2 == 4) {
                return new bxvd(f33445f);
            }
            if (i2 == 5) {
                return f33445f;
            }
            bxxk bxxk = f33446g;
            if (bxxk == null) {
                synchronized (mct.class) {
                    bxxk = f33446g;
                    if (bxxk == null) {
                        bxxk = new bxve(f33445f);
                        f33446g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
