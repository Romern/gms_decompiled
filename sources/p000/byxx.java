package p000;

/* renamed from: byxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxx extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final byxx f168830k;

    /* renamed from: l */
    private static volatile bxxk f168831l;

    /* renamed from: a */
    public int f168832a;

    /* renamed from: b */
    public boolean f168833b = true;

    /* renamed from: c */
    public boolean f168834c;

    /* renamed from: d */
    public double f168835d = 44100.0d;

    /* renamed from: e */
    public int f168836e = 16;

    /* renamed from: f */
    public int f168837f = 2;

    /* renamed from: g */
    public int f168838g = 125;

    /* renamed from: h */
    public byxt f168839h;

    /* renamed from: i */
    public double f168840i = 1.0d;

    /* renamed from: j */
    public byxu f168841j;

    static {
        byxx byxx = new byxx();
        f168830k = byxx;
        GeneratedMessageLite.m124024a(byxx.class, byxx);
    }

    private byxx() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m125470a(byxx byxx) {
        byxx.f168832a |= 1;
        byxx.f168833b = true;
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
            return GeneratedMessageLite.m124022a(f168830k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003က\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဉ\u0006\bက\u0007\tဉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new byxx();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f168830k;
            }
            bxxk bxxk = f168831l;
            if (bxxk == null) {
                synchronized (byxx.class) {
                    bxxk = f168831l;
                    if (bxxk == null) {
                        bxxk = new bxve(f168830k);
                        f168831l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
