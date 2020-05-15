package p000;

/* renamed from: bmve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmve extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmve f131025f;

    /* renamed from: g */
    private static volatile bxxk f131026g;

    /* renamed from: a */
    public int f131027a;

    /* renamed from: b */
    public bmvt f131028b;

    /* renamed from: c */
    public String f131029c = "";

    /* renamed from: d */
    public String f131030d = "";

    /* renamed from: e */
    public bmvf f131031e;

    static {
        bmve bmve = new bmve();
        f131025f = bmve;
        bxvk.m124024a(bmve.class, bmve);
    }

    private bmve() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f131025f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bmve();
        } else {
            if (i2 == 4) {
                return new bxvd(f131025f);
            }
            if (i2 == 5) {
                return f131025f;
            }
            bxxk bxxk = f131026g;
            if (bxxk == null) {
                synchronized (bmve.class) {
                    bxxk = f131026g;
                    if (bxxk == null) {
                        bxxk = new bxve(f131025f);
                        f131026g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
