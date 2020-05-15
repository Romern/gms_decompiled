package p000;

/* renamed from: bkyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkyq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bkyq f125472d;

    /* renamed from: e */
    private static volatile bxxk f125473e;

    /* renamed from: a */
    public int f125474a;

    /* renamed from: b */
    public int f125475b;

    /* renamed from: c */
    public long f125476c;

    static {
        bkyq bkyq = new bkyq();
        f125472d = bkyq;
        bxvk.m124024a(bkyq.class, bkyq);
    }

    private bkyq() {
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
            return bxvk.m124022a(f125472d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", bkyd.f125456a, "c"});
        } else if (i2 == 3) {
            return new bkyq();
        } else {
            if (i2 == 4) {
                return new bxvd(f125472d);
            }
            if (i2 == 5) {
                return f125472d;
            }
            bxxk bxxk = f125473e;
            if (bxxk == null) {
                synchronized (bkyq.class) {
                    bxxk = f125473e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125472d);
                        f125473e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
