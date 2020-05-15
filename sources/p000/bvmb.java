package p000;

/* renamed from: bvmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvmb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvmb f156630c;

    /* renamed from: e */
    private static volatile bxxk f156631e;

    /* renamed from: a */
    public bvow f156632a;

    /* renamed from: b */
    public bxwc f156633b = bxxn.f165040b;

    /* renamed from: d */
    private int f156634d;

    static {
        bvmb bvmb = new bvmb();
        f156630c = bvmb;
        GeneratedMessageLite.m124024a(bvmb.class, bvmb);
    }

    private bvmb() {
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
            return GeneratedMessageLite.m124022a(f156630c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bvkx.class});
        } else if (i2 == 3) {
            return new bvmb();
        } else {
            if (i2 == 4) {
                return new bxvd(f156630c);
            }
            if (i2 == 5) {
                return f156630c;
            }
            bxxk bxxk = f156631e;
            if (bxxk == null) {
                synchronized (bvmb.class) {
                    bxxk = f156631e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156630c);
                        f156631e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
