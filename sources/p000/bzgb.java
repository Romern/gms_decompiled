package p000;

/* renamed from: bzgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzgb f169902d;

    /* renamed from: e */
    private static volatile bxxk f169903e;

    /* renamed from: a */
    public int f169904a;

    /* renamed from: b */
    public String f169905b = "";

    /* renamed from: c */
    public bxwc f169906c = bxxn.f165040b;

    static {
        bzgb bzgb = new bzgb();
        f169902d = bzgb;
        bxvk.m124024a(bzgb.class, bzgb);
    }

    private bzgb() {
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
            return bxvk.m124022a(f169902d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဈ\u0000\u0003\u001b", new Object[]{"a", "b", "c", bzgl.class});
        } else if (i2 == 3) {
            return new bzgb();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f169902d;
            }
            bxxk bxxk = f169903e;
            if (bxxk == null) {
                synchronized (bzgb.class) {
                    bxxk = f169903e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169902d);
                        f169903e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
