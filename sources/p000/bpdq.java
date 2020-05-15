package p000;

/* renamed from: bpdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpdq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpdq f136359c;

    /* renamed from: d */
    private static volatile bxxk f136360d;

    /* renamed from: a */
    public int f136361a;

    /* renamed from: b */
    public bpdr f136362b;

    static {
        bpdq bpdq = new bpdq();
        f136359c = bpdq;
        bxvk.m124024a(bpdq.class, bpdq);
    }

    private bpdq() {
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
            return bxvk.m124022a(f136359c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpdq();
        } else {
            if (i2 == 4) {
                return new bxvd(f136359c);
            }
            if (i2 == 5) {
                return f136359c;
            }
            bxxk bxxk = f136360d;
            if (bxxk == null) {
                synchronized (bpdq.class) {
                    bxxk = f136360d;
                    if (bxxk == null) {
                        bxxk = new bxve(f136359c);
                        f136360d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
