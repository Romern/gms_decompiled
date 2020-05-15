package p000;

/* renamed from: bvfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvfq f155902c;

    /* renamed from: d */
    private static volatile bxxk f155903d;

    /* renamed from: a */
    public int f155904a;

    /* renamed from: b */
    public int f155905b;

    static {
        bvfq bvfq = new bvfq();
        f155902c = bvfq;
        bxvk.m124024a(bvfq.class, bvfq);
    }

    private bvfq() {
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
            return bxvk.m124022a(f155902c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bvjn.f156348a});
        } else if (i2 == 3) {
            return new bvfq();
        } else {
            if (i2 == 4) {
                return new bxvd(f155902c);
            }
            if (i2 == 5) {
                return f155902c;
            }
            bxxk bxxk = f155903d;
            if (bxxk == null) {
                synchronized (bvfq.class) {
                    bxxk = f155903d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155902c);
                        f155903d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
