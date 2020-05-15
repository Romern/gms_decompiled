package p000;

/* renamed from: bqrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqrz extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqrz f141496d;

    /* renamed from: e */
    private static volatile bxxk f141497e;

    /* renamed from: a */
    public int f141498a;

    /* renamed from: b */
    public bqsb f141499b;

    /* renamed from: c */
    public ByteString f141500c = ByteString.f164797b;

    static {
        bqrz bqrz = new bqrz();
        f141496d = bqrz;
        GeneratedMessageLite.m124024a(bqrz.class, bqrz);
    }

    private bqrz() {
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
            return GeneratedMessageLite.m124022a(f141496d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqrz();
        } else {
            if (i2 == 4) {
                return new bxvd(f141496d);
            }
            if (i2 == 5) {
                return f141496d;
            }
            bxxk bxxk = f141497e;
            if (bxxk == null) {
                synchronized (bqrz.class) {
                    bxxk = f141497e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141496d);
                        f141497e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
