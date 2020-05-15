package p000;

/* renamed from: bqld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqld extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bqld f141081f;

    /* renamed from: g */
    private static volatile bxxk f141082g;

    /* renamed from: a */
    public String f141083a = "";

    /* renamed from: b */
    public ByteString f141084b = ByteString.f164797b;

    /* renamed from: c */
    public boolean f141085c;

    /* renamed from: d */
    public ByteString f141086d = ByteString.f164797b;

    /* renamed from: e */
    public String f141087e = "";

    static {
        bqld bqld = new bqld();
        f141081f = bqld;
        GeneratedMessageLite.m124024a(bqld.class, bqld);
    }

    private bqld() {
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
            return GeneratedMessageLite.m124022a(f141081f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\u0007\u0004\n\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bqld();
        } else {
            if (i2 == 4) {
                return new bxvd(f141081f);
            }
            if (i2 == 5) {
                return f141081f;
            }
            bxxk bxxk = f141082g;
            if (bxxk == null) {
                synchronized (bqld.class) {
                    bxxk = f141082g;
                    if (bxxk == null) {
                        bxxk = new bxve(f141081f);
                        f141082g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
