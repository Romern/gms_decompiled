package p000;

/* renamed from: bqzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqzf extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bqzf f142036b;

    /* renamed from: d */
    private static volatile bxxk f142037d;

    /* renamed from: a */
    public ByteString f142038a = ByteString.f164797b;

    /* renamed from: c */
    private int f142039c;

    static {
        bqzf bqzf = new bqzf();
        f142036b = bqzf;
        GeneratedMessageLite.m124024a(bqzf.class, bqzf);
    }

    private bqzf() {
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
            return GeneratedMessageLite.m124022a(f142036b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bqzf();
        } else {
            if (i2 == 4) {
                return new bxvd(f142036b);
            }
            if (i2 == 5) {
                return f142036b;
            }
            bxxk bxxk = f142037d;
            if (bxxk == null) {
                synchronized (bqzf.class) {
                    bxxk = f142037d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142036b);
                        f142037d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
