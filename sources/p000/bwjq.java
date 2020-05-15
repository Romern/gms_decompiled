package p000;

/* renamed from: bwjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwjq f159852d;

    /* renamed from: e */
    private static volatile bxxk f159853e;

    /* renamed from: a */
    public int f159854a;

    /* renamed from: b */
    public bmaj f159855b;

    /* renamed from: c */
    public bxtx f159856c = bxtx.f164797b;

    static {
        bwjq bwjq = new bwjq();
        f159852d = bwjq;
        bxvk.m124024a(bwjq.class, bwjq);
    }

    private bwjq() {
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
            return bxvk.m124022a(f159852d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwjq();
        } else {
            if (i2 == 4) {
                return new bxvd(f159852d);
            }
            if (i2 == 5) {
                return f159852d;
            }
            bxxk bxxk = f159853e;
            if (bxxk == null) {
                synchronized (bwjq.class) {
                    bxxk = f159853e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159852d);
                        f159853e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
