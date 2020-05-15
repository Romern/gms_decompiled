package p000;

/* renamed from: bpsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpsq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpsq f138998c;

    /* renamed from: d */
    private static volatile bxxk f138999d;

    /* renamed from: a */
    public int f139000a;

    /* renamed from: b */
    public long f139001b;

    static {
        bpsq bpsq = new bpsq();
        f138998c = bpsq;
        bxvk.m124024a(bpsq.class, bpsq);
    }

    private bpsq() {
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
            return bxvk.m124022a(f138998c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpsq();
        } else {
            if (i2 == 4) {
                return new bxvd(f138998c);
            }
            if (i2 == 5) {
                return f138998c;
            }
            bxxk bxxk = f138999d;
            if (bxxk == null) {
                synchronized (bpsq.class) {
                    bxxk = f138999d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138998c);
                        f138999d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
