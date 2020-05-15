package p000;

/* renamed from: bqsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsd extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqsd f141509d;

    /* renamed from: e */
    private static volatile bxxk f141510e;

    /* renamed from: a */
    public String f141511a = "";

    /* renamed from: b */
    public ByteString f141512b = ByteString.f164797b;

    /* renamed from: c */
    public int f141513c;

    static {
        bqsd bqsd = new bqsd();
        f141509d = bqsd;
        GeneratedMessageLite.m124024a(bqsd.class, bqsd);
    }

    private bqsd() {
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
            return GeneratedMessageLite.m124022a(f141509d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqsd();
        } else {
            if (i2 == 4) {
                return new bxvd(f141509d);
            }
            if (i2 == 5) {
                return f141509d;
            }
            bxxk bxxk = f141510e;
            if (bxxk == null) {
                synchronized (bqsd.class) {
                    bxxk = f141510e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141509d);
                        f141510e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
