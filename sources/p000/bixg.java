package p000;

/* renamed from: bixg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bixg extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bixg f122185d;

    /* renamed from: f */
    private static volatile bxxk f122186f;

    /* renamed from: a */
    public int f122187a;

    /* renamed from: b */
    public int f122188b;

    /* renamed from: c */
    public bxvt f122189c = bxvm.f164965b;

    /* renamed from: e */
    private int f122190e;

    static {
        bixg bixg = new bixg();
        f122185d = bixg;
        GeneratedMessageLite.m124024a(bixg.class, bixg);
    }

    private bixg() {
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
            return GeneratedMessageLite.m124022a(f122185d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0004\u0016", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bixg();
        } else {
            if (i2 == 4) {
                return new bxvd(f122185d);
            }
            if (i2 == 5) {
                return f122185d;
            }
            bxxk bxxk = f122186f;
            if (bxxk == null) {
                synchronized (bixg.class) {
                    bxxk = f122186f;
                    if (bxxk == null) {
                        bxxk = new bxve(f122185d);
                        f122186f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
