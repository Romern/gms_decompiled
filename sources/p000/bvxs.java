package p000;

/* renamed from: bvxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvxs extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvxs f158094c;

    /* renamed from: e */
    private static volatile bxxk f158095e;

    /* renamed from: a */
    public bvxn f158096a;

    /* renamed from: b */
    public bxwc f158097b = bxxn.f165040b;

    /* renamed from: d */
    private int f158098d;

    static {
        bvxs bvxs = new bvxs();
        f158094c = bvxs;
        bxvk.m124024a(bvxs.class, bvxs);
    }

    private bvxs() {
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
            return bxvk.m124022a(f158094c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bvyg.class});
        } else if (i2 == 3) {
            return new bvxs();
        } else {
            if (i2 == 4) {
                return new bxvd(f158094c);
            }
            if (i2 == 5) {
                return f158094c;
            }
            bxxk bxxk = f158095e;
            if (bxxk == null) {
                synchronized (bvxs.class) {
                    bxxk = f158095e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158094c);
                        f158095e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
