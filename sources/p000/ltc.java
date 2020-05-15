package p000;

/* renamed from: ltc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ltc extends bxvk implements bxxd {

    /* renamed from: e */
    public static final ltc f32888e;

    /* renamed from: f */
    private static volatile bxxk f32889f;

    /* renamed from: a */
    public int f32890a;

    /* renamed from: b */
    public bxwc f32891b = bxxn.f165040b;

    /* renamed from: c */
    public boolean f32892c = true;

    /* renamed from: d */
    public boolean f32893d = true;

    static {
        ltc ltc = new ltc();
        f32888e = ltc;
        bxvk.m124024a(ltc.class, ltc);
    }

    private ltc() {
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
            return bxvk.m124022a(f32888e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new ltc();
        } else {
            if (i2 == 4) {
                return new bxvd(f32888e);
            }
            if (i2 == 5) {
                return f32888e;
            }
            bxxk bxxk = f32889f;
            if (bxxk == null) {
                synchronized (ltc.class) {
                    bxxk = f32889f;
                    if (bxxk == null) {
                        bxxk = new bxve(f32888e);
                        f32889f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
