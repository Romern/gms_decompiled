package p000;

/* renamed from: bprb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bprb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bprb f138816d;

    /* renamed from: e */
    private static volatile bxxk f138817e;

    /* renamed from: a */
    public int f138818a;

    /* renamed from: b */
    public int f138819b;

    /* renamed from: c */
    public int f138820c;

    static {
        bprb bprb = new bprb();
        f138816d = bprb;
        GeneratedMessageLite.m124024a(bprb.class, bprb);
    }

    private bprb() {
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
            return GeneratedMessageLite.m124022a(f138816d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", bpra.f138815a, "c"});
        } else if (i2 == 3) {
            return new bprb();
        } else {
            if (i2 == 4) {
                return new bxvd(f138816d);
            }
            if (i2 == 5) {
                return f138816d;
            }
            bxxk bxxk = f138817e;
            if (bxxk == null) {
                synchronized (bprb.class) {
                    bxxk = f138817e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138816d);
                        f138817e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
