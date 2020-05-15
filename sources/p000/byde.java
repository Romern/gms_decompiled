package p000;

/* renamed from: byde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byde extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final byde f165759i;

    /* renamed from: j */
    private static volatile bxxk f165760j;

    /* renamed from: a */
    public int f165761a;

    /* renamed from: b */
    public ByteString f165762b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f165763c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f165764d = ByteString.f164797b;

    /* renamed from: e */
    public ByteString f165765e = ByteString.f164797b;

    /* renamed from: f */
    public ByteString f165766f = ByteString.f164797b;

    /* renamed from: g */
    public ByteString f165767g = ByteString.f164797b;

    /* renamed from: h */
    public ByteString f165768h = ByteString.f164797b;

    static {
        byde byde = new byde();
        f165759i = byde;
        GeneratedMessageLite.m124024a(byde.class, byde);
    }

    private byde() {
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
            return GeneratedMessageLite.m124022a(f165759i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0006ည\u0005\u0007ည\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new byde();
        } else {
            if (i2 == 4) {
                return new bxvd(f165759i);
            }
            if (i2 == 5) {
                return f165759i;
            }
            bxxk bxxk = f165760j;
            if (bxxk == null) {
                synchronized (byde.class) {
                    bxxk = f165760j;
                    if (bxxk == null) {
                        bxxk = new bxve(f165759i);
                        f165760j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
