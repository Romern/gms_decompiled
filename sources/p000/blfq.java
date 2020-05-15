package p000;

/* renamed from: blfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blfq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blfq f126402c;

    /* renamed from: e */
    private static volatile bxxk f126403e;

    /* renamed from: a */
    public bxwc f126404a = bxxn.f165040b;

    /* renamed from: b */
    public long f126405b;

    /* renamed from: d */
    private int f126406d;

    static {
        blfq blfq = new blfq();
        f126402c = blfq;
        bxvk.m124024a(blfq.class, blfq);
    }

    private blfq() {
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
            return bxvk.m124022a(f126402c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003ဃ\u0000", new Object[]{"d", "a", blcs.class, "b"});
        } else if (i2 == 3) {
            return new blfq();
        } else {
            if (i2 == 4) {
                return new bxvd(f126402c);
            }
            if (i2 == 5) {
                return f126402c;
            }
            bxxk bxxk = f126403e;
            if (bxxk == null) {
                synchronized (blfq.class) {
                    bxxk = f126403e;
                    if (bxxk == null) {
                        bxxk = new bxve(f126402c);
                        f126403e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
