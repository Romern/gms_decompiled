package p000;

/* renamed from: agnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agnf extends bxvk implements bxxd {

    /* renamed from: c */
    public static final agnf f66047c;

    /* renamed from: e */
    private static volatile bxxk f66048e;

    /* renamed from: a */
    public String f66049a = "";

    /* renamed from: b */
    public String f66050b = "";

    /* renamed from: d */
    private int f66051d;

    static {
        agnf agnf = new agnf();
        f66047c = agnf;
        bxvk.m124024a(agnf.class, agnf);
    }

    private agnf() {
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
            return bxvk.m124022a(f66047c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new agnf();
        } else {
            if (i2 == 4) {
                return new bxvd(f66047c);
            }
            if (i2 == 5) {
                return f66047c;
            }
            bxxk bxxk = f66048e;
            if (bxxk == null) {
                synchronized (agnf.class) {
                    bxxk = f66048e;
                    if (bxxk == null) {
                        bxxk = new bxve(f66047c);
                        f66048e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
