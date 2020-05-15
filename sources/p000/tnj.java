package p000;

/* renamed from: tnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tnj extends bxvk implements bxxd {

    /* renamed from: e */
    public static final tnj f46291e;

    /* renamed from: f */
    private static volatile bxxk f46292f;

    /* renamed from: a */
    public int f46293a;

    /* renamed from: b */
    public String f46294b = "";

    /* renamed from: c */
    public String f46295c = "";

    /* renamed from: d */
    public int f46296d = 1;

    static {
        tnj tnj = new tnj();
        f46291e = tnj;
        bxvk.m124024a(tnj.class, tnj);
    }

    private tnj() {
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
            return bxvk.m124022a(f46291e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", tni.m37266b()});
        } else if (i2 == 3) {
            return new tnj();
        } else {
            if (i2 == 4) {
                return new bxvd(f46291e);
            }
            if (i2 == 5) {
                return f46291e;
            }
            bxxk bxxk = f46292f;
            if (bxxk == null) {
                synchronized (tnj.class) {
                    bxxk = f46292f;
                    if (bxxk == null) {
                        bxxk = new bxve(f46291e);
                        f46292f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
