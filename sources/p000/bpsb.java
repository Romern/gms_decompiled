package p000;

/* renamed from: bpsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpsb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpsb f138929d;

    /* renamed from: e */
    private static volatile bxxk f138930e;

    /* renamed from: a */
    public int f138931a;

    /* renamed from: b */
    public boolean f138932b;

    /* renamed from: c */
    public boolean f138933c;

    static {
        bpsb bpsb = new bpsb();
        f138929d = bpsb;
        GeneratedMessageLite.m124024a(bpsb.class, bpsb);
    }

    private bpsb() {
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
            return GeneratedMessageLite.m124022a(f138929d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpsb();
        } else {
            if (i2 == 4) {
                return new bxvd(f138929d);
            }
            if (i2 == 5) {
                return f138929d;
            }
            bxxk bxxk = f138930e;
            if (bxxk == null) {
                synchronized (bpsb.class) {
                    bxxk = f138930e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138929d);
                        f138930e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
