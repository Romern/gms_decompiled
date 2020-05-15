package p000;

/* renamed from: aqaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqaz extends bxvk implements bxxd {

    /* renamed from: e */
    public static final aqaz f85515e;

    /* renamed from: f */
    private static volatile bxxk f85516f;

    /* renamed from: a */
    public int f85517a;

    /* renamed from: b */
    public int f85518b;

    /* renamed from: c */
    public int f85519c;

    /* renamed from: d */
    public bxwc f85520d = bxxn.f165040b;

    static {
        aqaz aqaz = new aqaz();
        f85515e = aqaz;
        bxvk.m124024a(aqaz.class, aqaz);
    }

    private aqaz() {
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
            return bxvk.m124022a(f85515e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003\u001b", new Object[]{"a", "b", aqay.m71274b(), "c", "d", aqbb.class});
        } else if (i2 == 3) {
            return new aqaz();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return f85515e;
            }
            bxxk bxxk = f85516f;
            if (bxxk == null) {
                synchronized (aqaz.class) {
                    bxxk = f85516f;
                    if (bxxk == null) {
                        bxxk = new bxve(f85515e);
                        f85516f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
