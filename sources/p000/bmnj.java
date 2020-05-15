package p000;

/* renamed from: bmnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmnj extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmnj f130108c;

    /* renamed from: e */
    private static volatile bxxk f130109e;

    /* renamed from: a */
    public String f130110a = "";

    /* renamed from: b */
    public bxwc f130111b = bxxn.f165040b;

    /* renamed from: d */
    private int f130112d;

    static {
        bmnj bmnj = new bmnj();
        f130108c = bmnj;
        bxvk.m124024a(bmnj.class, bmnj);
    }

    private bmnj() {
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
            return bxvk.m124022a(f130108c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bmni.class});
        } else if (i2 == 3) {
            return new bmnj();
        } else {
            if (i2 == 4) {
                return new bxvd(f130108c);
            }
            if (i2 == 5) {
                return f130108c;
            }
            bxxk bxxk = f130109e;
            if (bxxk == null) {
                synchronized (bmnj.class) {
                    bxxk = f130109e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130108c);
                        f130109e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
