package p000;

/* renamed from: bycv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bycv extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bycv f165717e;

    /* renamed from: f */
    private static volatile bxxk f165718f;

    /* renamed from: a */
    public int f165719a;

    /* renamed from: b */
    public ByteString f165720b = ByteString.f164797b;

    /* renamed from: c */
    public int f165721c;

    /* renamed from: d */
    public ByteString f165722d = ByteString.f164797b;

    static {
        bycv bycv = new bycv();
        f165717e = bycv;
        GeneratedMessageLite.m124024a(bycv.class, bycv);
    }

    private bycv() {
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
            return GeneratedMessageLite.m124022a(f165717e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bycv();
        } else {
            if (i2 == 4) {
                return new bxvd(f165717e);
            }
            if (i2 == 5) {
                return f165717e;
            }
            bxxk bxxk = f165718f;
            if (bxxk == null) {
                synchronized (bycv.class) {
                    bxxk = f165718f;
                    if (bxxk == null) {
                        bxxk = new bxve(f165717e);
                        f165718f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
