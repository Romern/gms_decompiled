package p000;

/* renamed from: bvzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvzq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvzq f158541c;

    /* renamed from: d */
    private static volatile bxxk f158542d;

    /* renamed from: a */
    public int f158543a;

    /* renamed from: b */
    public int f158544b;

    static {
        bvzq bvzq = new bvzq();
        f158541c = bvzq;
        bxvk.m124024a(bvzq.class, bvzq);
    }

    private bvzq() {
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
            return bxvk.m124022a(f158541c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0000", new Object[]{"a", "b", bzkh.m125875b()});
        } else if (i2 == 3) {
            return new bvzq();
        } else {
            if (i2 == 4) {
                return new bxvd(f158541c);
            }
            if (i2 == 5) {
                return f158541c;
            }
            bxxk bxxk = f158542d;
            if (bxxk == null) {
                synchronized (bvzq.class) {
                    bxxk = f158542d;
                    if (bxxk == null) {
                        bxxk = new bxve(f158541c);
                        f158542d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
