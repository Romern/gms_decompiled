package p000;

/* renamed from: bygu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bygu extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bygu f166382e;

    /* renamed from: f */
    private static volatile bxxk f166383f;

    /* renamed from: a */
    public int f166384a;

    /* renamed from: b */
    public int f166385b = 0;

    /* renamed from: c */
    public Object f166386c;

    /* renamed from: d */
    public int f166387d;

    static {
        bygu bygu = new bygu();
        f166382e = bygu;
        GeneratedMessageLite.m124024a(bygu.class, bygu);
    }

    private bygu() {
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
            return GeneratedMessageLite.m124022a(f166382e, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"c", "b", "a", "d", bygs.f166381a, byjt.class, byhi.class, byhv.class, byhj.class, byho.class});
        } else if (i2 == 3) {
            return new bygu();
        } else {
            if (i2 == 4) {
                return new bxvd(f166382e);
            }
            if (i2 == 5) {
                return f166382e;
            }
            bxxk bxxk = f166383f;
            if (bxxk == null) {
                synchronized (bygu.class) {
                    bxxk = f166383f;
                    if (bxxk == null) {
                        bxxk = new bxve(f166382e);
                        f166383f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
