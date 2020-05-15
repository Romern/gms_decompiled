package p000;

/* renamed from: brco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brco extends bxvk implements bxxd {

    /* renamed from: e */
    public static final brco f142400e;

    /* renamed from: f */
    private static volatile bxxk f142401f;

    /* renamed from: a */
    public int f142402a;

    /* renamed from: b */
    public brak f142403b;

    /* renamed from: c */
    public int f142404c;

    /* renamed from: d */
    public boolean f142405d;

    static {
        brco brco = new brco();
        f142400e = brco;
        bxvk.m124024a(brco.class, brco);
    }

    private brco() {
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
            return bxvk.m124022a(f142400e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", brcm.m113876b(), "d"});
        } else if (i2 == 3) {
            return new brco();
        } else {
            if (i2 == 4) {
                return new bxvd(f142400e);
            }
            if (i2 == 5) {
                return f142400e;
            }
            bxxk bxxk = f142401f;
            if (bxxk == null) {
                synchronized (brco.class) {
                    bxxk = f142401f;
                    if (bxxk == null) {
                        bxxk = new bxve(f142400e);
                        f142401f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
