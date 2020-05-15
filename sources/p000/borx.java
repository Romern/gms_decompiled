package p000;

/* renamed from: borx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class borx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final borx f134523d;

    /* renamed from: e */
    private static volatile bxxk f134524e;

    /* renamed from: a */
    public int f134525a;

    /* renamed from: b */
    public int f134526b;

    /* renamed from: c */
    public int f134527c;

    static {
        borx borx = new borx();
        f134523d = borx;
        GeneratedMessageLite.m124024a(borx.class, borx);
    }

    private borx() {
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
            return GeneratedMessageLite.m124022a(f134523d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new borx();
        } else {
            if (i2 == 4) {
                return new bxvd(f134523d);
            }
            if (i2 == 5) {
                return f134523d;
            }
            bxxk bxxk = f134524e;
            if (bxxk == null) {
                synchronized (borx.class) {
                    bxxk = f134524e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134523d);
                        f134524e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
