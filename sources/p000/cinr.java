package p000;

/* renamed from: cinr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cinr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cinr f190975d;

    /* renamed from: e */
    private static volatile bxxk f190976e;

    /* renamed from: a */
    public int f190977a;

    /* renamed from: b */
    public int f190978b;

    /* renamed from: c */
    public long f190979c;

    static {
        cinr cinr = new cinr();
        f190975d = cinr;
        GeneratedMessageLite.m124024a(cinr.class, cinr);
    }

    private cinr() {
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
            return GeneratedMessageLite.m124022a(f190975d, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005င\u0000\u0006ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cinr();
        } else {
            if (i2 == 4) {
                return new bxvd(f190975d);
            }
            if (i2 == 5) {
                return f190975d;
            }
            bxxk bxxk = f190976e;
            if (bxxk == null) {
                synchronized (cinr.class) {
                    bxxk = f190976e;
                    if (bxxk == null) {
                        bxxk = new bxve(f190975d);
                        f190976e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
