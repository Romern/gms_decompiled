package p000;

/* renamed from: bpll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpll extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpll f138105c;

    /* renamed from: d */
    private static volatile bxxk f138106d;

    /* renamed from: a */
    public int f138107a;

    /* renamed from: b */
    public int f138108b;

    static {
        bpll bpll = new bpll();
        f138105c = bpll;
        GeneratedMessageLite.m124024a(bpll.class, bpll);
    }

    private bpll() {
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
            return GeneratedMessageLite.m124022a(f138105c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bplk.f138104a});
        } else if (i2 == 3) {
            return new bpll();
        } else {
            if (i2 == 4) {
                return new bxvd(f138105c);
            }
            if (i2 == 5) {
                return f138105c;
            }
            bxxk bxxk = f138106d;
            if (bxxk == null) {
                synchronized (bpll.class) {
                    bxxk = f138106d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138105c);
                        f138106d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
