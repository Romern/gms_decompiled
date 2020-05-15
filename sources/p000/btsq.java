package p000;

/* renamed from: btsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btsq f150253c;

    /* renamed from: d */
    private static volatile bxxk f150254d;

    /* renamed from: a */
    public int f150255a;

    /* renamed from: b */
    public btsz f150256b;

    static {
        btsq btsq = new btsq();
        f150253c = btsq;
        bxvk.m124024a(btsq.class, btsq);
    }

    private btsq() {
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
            return bxvk.m124022a(f150253c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btsq();
        } else {
            if (i2 == 4) {
                return new bxvd(f150253c);
            }
            if (i2 == 5) {
                return f150253c;
            }
            bxxk bxxk = f150254d;
            if (bxxk == null) {
                synchronized (btsq.class) {
                    bxxk = f150254d;
                    if (bxxk == null) {
                        bxxk = new bxve(f150253c);
                        f150254d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
