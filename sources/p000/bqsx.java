package p000;

/* renamed from: bqsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqsx f141592d;

    /* renamed from: e */
    private static volatile bxxk f141593e;

    /* renamed from: a */
    public int f141594a;

    /* renamed from: b */
    public int f141595b;

    /* renamed from: c */
    public int f141596c;

    static {
        bqsx bqsx = new bqsx();
        f141592d = bqsx;
        GeneratedMessageLite.m124024a(bqsx.class, bqsx);
    }

    private bqsx() {
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
            return GeneratedMessageLite.m124022a(f141592d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqsx();
        } else {
            if (i2 == 4) {
                return new bxvd(f141592d);
            }
            if (i2 == 5) {
                return f141592d;
            }
            bxxk bxxk = f141593e;
            if (bxxk == null) {
                synchronized (bqsx.class) {
                    bxxk = f141593e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141592d);
                        f141593e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
