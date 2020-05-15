package p000;

/* renamed from: bwfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwfq extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bwfq f159103i;

    /* renamed from: j */
    private static volatile bxxk f159104j;

    /* renamed from: a */
    public int f159105a;

    /* renamed from: b */
    public int f159106b;

    /* renamed from: c */
    public int f159107c;

    /* renamed from: d */
    public int f159108d;

    /* renamed from: e */
    public int f159109e;

    /* renamed from: f */
    public int f159110f;

    /* renamed from: g */
    public int f159111g;

    /* renamed from: h */
    public int f159112h;

    static {
        bwfq bwfq = new bwfq();
        f159103i = bwfq;
        bxvk.m124024a(bwfq.class, bwfq);
    }

    private bwfq() {
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
            return bxvk.m124022a(f159103i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0005\u0004ဌ\u0006\u0005င\u0002\u0006င\u0003\u0007င\u0004", new Object[]{"a", "b", "c", "g", bwfj.f159087a, "h", bwfi.f159086a, "d", "e", "f"});
        } else if (i2 == 3) {
            return new bwfq();
        } else {
            if (i2 == 4) {
                return new bxvd(f159103i);
            }
            if (i2 == 5) {
                return f159103i;
            }
            bxxk bxxk = f159104j;
            if (bxxk == null) {
                synchronized (bwfq.class) {
                    bxxk = f159104j;
                    if (bxxk == null) {
                        bxxk = new bxve(f159103i);
                        f159104j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
