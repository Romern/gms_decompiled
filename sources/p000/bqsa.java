package p000;

/* renamed from: bqsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsa extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bqsa f141501c;

    /* renamed from: d */
    private static volatile bxxk f141502d;

    /* renamed from: a */
    public bqsb f141503a;

    /* renamed from: b */
    public int f141504b;

    static {
        bqsa bqsa = new bqsa();
        f141501c = bqsa;
        GeneratedMessageLite.m124024a(bqsa.class, bqsa);
    }

    private bqsa() {
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
            return GeneratedMessageLite.m124022a(f141501c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqsa();
        } else {
            if (i2 == 4) {
                return new bxvd(f141501c);
            }
            if (i2 == 5) {
                return f141501c;
            }
            bxxk bxxk = f141502d;
            if (bxxk == null) {
                synchronized (bqsa.class) {
                    bxxk = f141502d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141501c);
                        f141502d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
