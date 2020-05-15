package p000;

/* renamed from: cbgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbgq f177072c;

    /* renamed from: d */
    private static volatile bxxk f177073d;

    /* renamed from: a */
    public cbmo f177074a;

    /* renamed from: b */
    public cbhu f177075b;

    static {
        cbgq cbgq = new cbgq();
        f177072c = cbgq;
        bxvk.m124024a(cbgq.class, cbgq);
    }

    private cbgq() {
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
            return bxvk.m124022a(f177072c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbgq();
        } else {
            if (i2 == 4) {
                return new bxvd(f177072c);
            }
            if (i2 == 5) {
                return f177072c;
            }
            bxxk bxxk = f177073d;
            if (bxxk == null) {
                synchronized (cbgq.class) {
                    bxxk = f177073d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177072c);
                        f177073d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
