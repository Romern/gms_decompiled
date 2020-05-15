package p000;

/* renamed from: cior */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cior extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cior f191109c;

    /* renamed from: d */
    private static volatile bxxk f191110d;

    /* renamed from: a */
    public int f191111a;

    /* renamed from: b */
    public int f191112b;

    static {
        cior cior = new cior();
        f191109c = cior;
        bxvk.m124024a(cior.class, cior);
    }

    private cior() {
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
            return bxvk.m124022a(f191109c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", cioq.f191108a});
        } else if (i2 == 3) {
            return new cior();
        } else {
            if (i2 == 4) {
                return new bxvd(f191109c);
            }
            if (i2 == 5) {
                return f191109c;
            }
            bxxk bxxk = f191110d;
            if (bxxk == null) {
                synchronized (cior.class) {
                    bxxk = f191110d;
                    if (bxxk == null) {
                        bxxk = new bxve(f191109c);
                        f191110d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
