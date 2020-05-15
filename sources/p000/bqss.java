package p000;

/* renamed from: bqss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqss extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqss f141563d;

    /* renamed from: e */
    private static volatile bxxk f141564e;

    /* renamed from: a */
    public bqst f141565a;

    /* renamed from: b */
    public int f141566b;

    /* renamed from: c */
    public ByteString f141567c = ByteString.f164797b;

    static {
        bqss bqss = new bqss();
        f141563d = bqss;
        GeneratedMessageLite.m124024a(bqss.class, bqss);
    }

    private bqss() {
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
            return GeneratedMessageLite.m124022a(f141563d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqss();
        } else {
            if (i2 == 4) {
                return new bxvd(f141563d);
            }
            if (i2 == 5) {
                return f141563d;
            }
            bxxk bxxk = f141564e;
            if (bxxk == null) {
                synchronized (bqss.class) {
                    bxxk = f141564e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141563d);
                        f141564e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
