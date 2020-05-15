package p000;

/* renamed from: bvmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvmp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvmp f156770c;

    /* renamed from: e */
    private static volatile bxxk f156771e;

    /* renamed from: a */
    public String f156772a = "";

    /* renamed from: b */
    public double f156773b;

    /* renamed from: d */
    private int f156774d;

    static {
        bvmp bvmp = new bvmp();
        f156770c = bvmp;
        bxvk.m124024a(bvmp.class, bvmp);
    }

    private bvmp() {
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
            return bxvk.m124022a(f156770c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bvmp();
        } else {
            if (i2 == 4) {
                return new bxvd(f156770c);
            }
            if (i2 == 5) {
                return f156770c;
            }
            bxxk bxxk = f156771e;
            if (bxxk == null) {
                synchronized (bvmp.class) {
                    bxxk = f156771e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156770c);
                        f156771e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
