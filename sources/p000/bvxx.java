package p000;

/* renamed from: bvxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvxx extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvxx f158110e;

    /* renamed from: f */
    private static volatile bxxk f158111f;

    /* renamed from: a */
    public int f158112a;

    /* renamed from: b */
    public int f158113b;

    /* renamed from: c */
    public long f158114c;

    /* renamed from: d */
    public ByteString f158115d = ByteString.f164797b;

    static {
        bvxx bvxx = new bvxx();
        f158110e = bvxx;
        GeneratedMessageLite.m124024a(bvxx.class, bvxx);
    }

    private bvxx() {
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
            return GeneratedMessageLite.m124022a(f158110e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"a", "b", bvxw.f158109a, "c", "d"});
        } else if (i2 == 3) {
            return new bvxx();
        } else {
            if (i2 == 4) {
                return new bxvd(f158110e);
            }
            if (i2 == 5) {
                return f158110e;
            }
            bxxk bxxk = f158111f;
            if (bxxk == null) {
                synchronized (bvxx.class) {
                    bxxk = f158111f;
                    if (bxxk == null) {
                        bxxk = new bxve(f158110e);
                        f158111f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
