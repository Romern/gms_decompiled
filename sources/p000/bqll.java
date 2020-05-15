package p000;

/* renamed from: bqll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqll extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bqll f141110e;

    /* renamed from: f */
    private static volatile bxxk f141111f;

    /* renamed from: a */
    public bqli f141112a;

    /* renamed from: b */
    public ByteString f141113b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f141114c = ByteString.f164797b;

    /* renamed from: d */
    public boolean f141115d;

    static {
        bqll bqll = new bqll();
        f141110e = bqll;
        GeneratedMessageLite.m124024a(bqll.class, bqll);
    }

    private bqll() {
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
            return GeneratedMessageLite.m124022a(f141110e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\t\u0003\n\u0004\n\u0005\u0007", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqll();
        } else {
            if (i2 == 4) {
                return new bxvd(f141110e);
            }
            if (i2 == 5) {
                return f141110e;
            }
            bxxk bxxk = f141111f;
            if (bxxk == null) {
                synchronized (bqll.class) {
                    bxxk = f141111f;
                    if (bxxk == null) {
                        bxxk = new bxve(f141110e);
                        f141111f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
