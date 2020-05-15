package p000;

/* renamed from: blfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blfn extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blfn f126393e;

    /* renamed from: f */
    private static volatile bxxk f126394f;

    /* renamed from: a */
    public int f126395a;

    /* renamed from: b */
    public blco f126396b;

    /* renamed from: c */
    public int f126397c;

    /* renamed from: d */
    public String f126398d = "";

    static {
        blfn blfn = new blfn();
        f126393e = blfn;
        bxvk.m124024a(blfn.class, blfn);
    }

    private blfn() {
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
            return bxvk.m124022a(f126393e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0003\u0004ဌ\u0002", new Object[]{"a", "b", "d", "c", blcg.f125922a});
        } else if (i2 == 3) {
            return new blfn();
        } else {
            if (i2 == 4) {
                return new bxvd(f126393e);
            }
            if (i2 == 5) {
                return f126393e;
            }
            bxxk bxxk = f126394f;
            if (bxxk == null) {
                synchronized (blfn.class) {
                    bxxk = f126394f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126393e);
                        f126394f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
