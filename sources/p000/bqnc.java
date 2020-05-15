package p000;

/* renamed from: bqnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqnc extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bqnc f141296e;

    /* renamed from: f */
    private static volatile bxxk f141297f;

    /* renamed from: a */
    public ByteString f141298a = ByteString.f164797b;

    /* renamed from: b */
    public ByteString f141299b = ByteString.f164797b;

    /* renamed from: c */
    public int f141300c;

    /* renamed from: d */
    public ByteString f141301d = ByteString.f164797b;

    static {
        bqnc bqnc = new bqnc();
        f141296e = bqnc;
        GeneratedMessageLite.m124024a(bqnc.class, bqnc);
    }

    private bqnc() {
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
            return GeneratedMessageLite.m124022a(f141296e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0004\u0004\n", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqnc();
        } else {
            if (i2 == 4) {
                return new bxvd(f141296e);
            }
            if (i2 == 5) {
                return f141296e;
            }
            bxxk bxxk = f141297f;
            if (bxxk == null) {
                synchronized (bqnc.class) {
                    bxxk = f141297f;
                    if (bxxk == null) {
                        bxxk = new bxve(f141296e);
                        f141297f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
