package p000;

/* renamed from: caea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caea extends bxvk implements bxxd {

    /* renamed from: f */
    public static final caea f172784f;

    /* renamed from: g */
    private static volatile bxxk f172785g;

    /* renamed from: a */
    public int f172786a;

    /* renamed from: b */
    public long f172787b;

    /* renamed from: c */
    public bxwc f172788c = bxxn.f165040b;

    /* renamed from: d */
    public String f172789d = "";

    /* renamed from: e */
    public bxwc f172790e = bxxn.f165040b;

    static {
        caea caea = new caea();
        f172784f = caea;
        bxvk.m124024a(caea.class, caea);
    }

    private caea() {
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
            return bxvk.m124022a(f172784f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0002\u0000\u0002ဂ\u0001\u0003\u001b\u0004ဈ\u0002\u0005\u001c", new Object[]{"a", "b", "c", caaa.class, "d", "e"});
        } else if (i2 == 3) {
            return new caea();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (float[]) null);
            }
            if (i2 == 5) {
                return f172784f;
            }
            bxxk bxxk = f172785g;
            if (bxxk == null) {
                synchronized (caea.class) {
                    bxxk = f172785g;
                    if (bxxk == null) {
                        bxxk = new bxve(f172784f);
                        f172785g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
