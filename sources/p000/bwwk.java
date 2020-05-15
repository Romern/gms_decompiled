package p000;

/* renamed from: bwwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwwk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwwk f161257c;

    /* renamed from: d */
    private static volatile bxxk f161258d;

    /* renamed from: a */
    public int f161259a = 0;

    /* renamed from: b */
    public Object f161260b;

    static {
        bwwk bwwk = new bwwk();
        f161257c = bwwk;
        GeneratedMessageLite.m124024a(bwwk.class, bwwk);
    }

    private bwwk() {
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
            return GeneratedMessageLite.m124022a(f161257c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ျ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new bwwk();
        } else {
            if (i2 == 4) {
                return new bxvd(f161257c);
            }
            if (i2 == 5) {
                return f161257c;
            }
            bxxk bxxk = f161258d;
            if (bxxk == null) {
                synchronized (bwwk.class) {
                    bxxk = f161258d;
                    if (bxxk == null) {
                        bxxk = new bxve(f161257c);
                        f161258d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
