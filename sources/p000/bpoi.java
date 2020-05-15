package p000;

/* renamed from: bpoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpoi extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpoi f138528c;

    /* renamed from: d */
    private static volatile bxxk f138529d;

    /* renamed from: a */
    public int f138530a;

    /* renamed from: b */
    public int f138531b;

    static {
        bpoi bpoi = new bpoi();
        f138528c = bpoi;
        GeneratedMessageLite.m124024a(bpoi.class, bpoi);
    }

    private bpoi() {
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
            return GeneratedMessageLite.m124022a(f138528c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpoi();
        } else {
            if (i2 == 4) {
                return new bxvd(f138528c);
            }
            if (i2 == 5) {
                return f138528c;
            }
            bxxk bxxk = f138529d;
            if (bxxk == null) {
                synchronized (bpoi.class) {
                    bxxk = f138529d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138528c);
                        f138529d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
