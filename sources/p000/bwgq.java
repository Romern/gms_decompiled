package p000;

/* renamed from: bwgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwgq f159244d;

    /* renamed from: e */
    private static volatile bxxk f159245e;

    /* renamed from: a */
    public int f159246a;

    /* renamed from: b */
    public bmaj f159247b;

    /* renamed from: c */
    public bwgp f159248c;

    static {
        bwgq bwgq = new bwgq();
        f159244d = bwgq;
        bxvk.m124024a(bwgq.class, bwgq);
    }

    private bwgq() {
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
            return bxvk.m124022a(f159244d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwgq();
        } else {
            if (i2 == 4) {
                return new bxvd(f159244d);
            }
            if (i2 == 5) {
                return f159244d;
            }
            bxxk bxxk = f159245e;
            if (bxxk == null) {
                synchronized (bwgq.class) {
                    bxxk = f159245e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159244d);
                        f159245e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
