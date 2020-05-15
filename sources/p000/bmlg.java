package p000;

/* renamed from: bmlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmlg extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmlg f129929d;

    /* renamed from: f */
    private static volatile bxxk f129930f;

    /* renamed from: a */
    public int f129931a;

    /* renamed from: b */
    public boolean f129932b;

    /* renamed from: c */
    public long f129933c;

    /* renamed from: e */
    private int f129934e;

    static {
        bmlg bmlg = new bmlg();
        f129929d = bmlg;
        GeneratedMessageLite.m124024a(bmlg.class, bmlg);
    }

    private bmlg() {
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
            return GeneratedMessageLite.m124022a(f129929d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဂ\u0002", new Object[]{"e", "a", bmle.f129928a, "b", "c"});
        } else if (i2 == 3) {
            return new bmlg();
        } else {
            if (i2 == 4) {
                return new bxvd(f129929d);
            }
            if (i2 == 5) {
                return f129929d;
            }
            bxxk bxxk = f129930f;
            if (bxxk == null) {
                synchronized (bmlg.class) {
                    bxxk = f129930f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129929d);
                        f129930f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
