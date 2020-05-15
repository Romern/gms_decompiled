package p000;

/* renamed from: bosz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bosz extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bosz f134750j;

    /* renamed from: k */
    private static volatile bxxk f134751k;

    /* renamed from: a */
    public int f134752a;

    /* renamed from: b */
    public int f134753b;

    /* renamed from: c */
    public botp f134754c;

    /* renamed from: d */
    public int f134755d;

    /* renamed from: e */
    public boolean f134756e;

    /* renamed from: f */
    public float f134757f;

    /* renamed from: g */
    public boolean f134758g;

    /* renamed from: h */
    public boolean f134759h;

    /* renamed from: i */
    public long f134760i;

    static {
        bosz bosz = new bosz();
        f134750j = bosz;
        GeneratedMessageLite.m124024a(bosz.class, bosz);
    }

    private bosz() {
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
            return GeneratedMessageLite.m124022a(f134750j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ခ\u0004\u0004ဇ\u0005\u0005ဇ\u0006\u0006ဂ\u0007\u0007င\u0002\bဇ\u0003", new Object[]{"a", "b", bosy.f134749a, "c", "f", "g", "h", "i", "d", "e"});
        } else if (i2 == 3) {
            return new bosz();
        } else {
            if (i2 == 4) {
                return new bxvd(f134750j);
            }
            if (i2 == 5) {
                return f134750j;
            }
            bxxk bxxk = f134751k;
            if (bxxk == null) {
                synchronized (bosz.class) {
                    bxxk = f134751k;
                    if (bxxk == null) {
                        bxxk = new bxve(f134750j);
                        f134751k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
