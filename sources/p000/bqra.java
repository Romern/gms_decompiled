package p000;

/* renamed from: bqra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqra extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqra f141410d;

    /* renamed from: e */
    private static volatile bxxk f141411e;

    /* renamed from: a */
    public int f141412a;

    /* renamed from: b */
    public bqrc f141413b;

    /* renamed from: c */
    public ByteString f141414c = ByteString.f164797b;

    static {
        bqra bqra = new bqra();
        f141410d = bqra;
        GeneratedMessageLite.m124024a(bqra.class, bqra);
    }

    private bqra() {
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
            return GeneratedMessageLite.m124022a(f141410d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqra();
        } else {
            if (i2 == 4) {
                return new bxvd(f141410d);
            }
            if (i2 == 5) {
                return f141410d;
            }
            bxxk bxxk = f141411e;
            if (bxxk == null) {
                synchronized (bqra.class) {
                    bxxk = f141411e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141410d);
                        f141411e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
