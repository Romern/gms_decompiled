package p000;

/* renamed from: apzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apzz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final apzz f85340c;

    /* renamed from: d */
    private static volatile bxxk f85341d;

    /* renamed from: a */
    public bxwc f85342a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f85343b = bxxn.f165040b;

    static {
        apzz apzz = new apzz();
        f85340c = apzz;
        bxvk.m124024a(apzz.class, apzz);
    }

    private apzz() {
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
            return bxvk.m124022a(f85340c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", aqaf.class, "b", apzf.class});
        } else if (i2 == 3) {
            return new apzz();
        } else {
            if (i2 == 4) {
                return new apzy();
            }
            if (i2 == 5) {
                return f85340c;
            }
            bxxk bxxk = f85341d;
            if (bxxk == null) {
                synchronized (apzz.class) {
                    bxxk = f85341d;
                    if (bxxk == null) {
                        bxxk = new bxve(f85340c);
                        f85341d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
