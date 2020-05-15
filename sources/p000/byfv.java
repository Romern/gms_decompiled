package p000;

/* renamed from: byfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byfv extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byfv f166070e;

    /* renamed from: f */
    private static volatile bxxk f166071f;

    /* renamed from: a */
    public int f166072a;

    /* renamed from: b */
    public bynx f166073b;

    /* renamed from: c */
    public ByteString f166074c = ByteString.f164797b;

    /* renamed from: d */
    public long f166075d;

    static {
        byfv byfv = new byfv();
        f166070e = byfv;
        GeneratedMessageLite.m124024a(byfv.class, byfv);
    }

    private byfv() {
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
            return GeneratedMessageLite.m124022a(f166070e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new byfv();
        } else {
            if (i2 == 4) {
                return new bxvd(f166070e);
            }
            if (i2 == 5) {
                return f166070e;
            }
            bxxk bxxk = f166071f;
            if (bxxk == null) {
                synchronized (byfv.class) {
                    bxxk = f166071f;
                    if (bxxk == null) {
                        bxxk = new bxve(f166070e);
                        f166071f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
