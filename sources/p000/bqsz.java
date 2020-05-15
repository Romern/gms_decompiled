package p000;

/* renamed from: bqsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bqsz f141607e;

    /* renamed from: f */
    private static volatile bxxk f141608f;

    /* renamed from: a */
    public int f141609a;

    /* renamed from: b */
    public bqsx f141610b;

    /* renamed from: c */
    public ByteString f141611c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f141612d = ByteString.f164797b;

    static {
        bqsz bqsz = new bqsz();
        f141607e = bqsz;
        GeneratedMessageLite.m124024a(bqsz.class, bqsz);
    }

    private bqsz() {
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
            return GeneratedMessageLite.m124022a(f141607e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqsz();
        } else {
            if (i2 == 4) {
                return new bxvd(f141607e);
            }
            if (i2 == 5) {
                return f141607e;
            }
            bxxk bxxk = f141608f;
            if (bxxk == null) {
                synchronized (bqsz.class) {
                    bxxk = f141608f;
                    if (bxxk == null) {
                        bxxk = new bxve(f141607e);
                        f141608f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
