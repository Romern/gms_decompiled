package p000;

/* renamed from: bwei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwei extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwei f158986c;

    /* renamed from: f */
    private static volatile bxxk f158987f;

    /* renamed from: a */
    public int f158988a = 0;

    /* renamed from: b */
    public Object f158989b;

    /* renamed from: d */
    private int f158990d;

    /* renamed from: e */
    private int f158991e;

    static {
        bwei bwei = new bwei();
        f158986c = bwei;
        GeneratedMessageLite.m124024a(bwei.class, bwei);
    }

    private bwei() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m121879a(bwei bwei) {
        bwei.f158990d |= 2;
        bwei.f158991e = 70214;
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
            return GeneratedMessageLite.m124022a(f158986c, "\u0001\u0002\u0001\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0004င\u0001", new Object[]{"b", "a", "d", bwdq.class, "e"});
        } else if (i2 == 3) {
            return new bwei();
        } else {
            if (i2 == 4) {
                return new bxvd(f158986c);
            }
            if (i2 == 5) {
                return f158986c;
            }
            bxxk bxxk = f158987f;
            if (bxxk == null) {
                synchronized (bwei.class) {
                    bxxk = f158987f;
                    if (bxxk == null) {
                        bxxk = new bxve(f158986c);
                        f158987f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
