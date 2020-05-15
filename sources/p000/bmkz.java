package p000;

/* renamed from: bmkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmkz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmkz f129905c;

    /* renamed from: e */
    private static volatile bxxk f129906e;

    /* renamed from: a */
    public String f129907a = "";

    /* renamed from: b */
    public int f129908b;

    /* renamed from: d */
    private int f129909d;

    static {
        bmkz bmkz = new bmkz();
        f129905c = bmkz;
        bxvk.m124024a(bmkz.class, bmkz);
    }

    private bmkz() {
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
            return bxvk.m124022a(f129905c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", bmkx.f129904a});
        } else if (i2 == 3) {
            return new bmkz();
        } else {
            if (i2 == 4) {
                return new bxvd(f129905c);
            }
            if (i2 == 5) {
                return f129905c;
            }
            bxxk bxxk = f129906e;
            if (bxxk == null) {
                synchronized (bmkz.class) {
                    bxxk = f129906e;
                    if (bxxk == null) {
                        bxxk = new bxve(f129905c);
                        f129906e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
