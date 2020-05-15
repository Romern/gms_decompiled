package p000;

/* renamed from: btdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btdd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btdd f148380c;

    /* renamed from: d */
    private static volatile bxxk f148381d;

    /* renamed from: a */
    public int f148382a;

    /* renamed from: b */
    public ByteString f148383b = ByteString.f164797b;

    static {
        btdd btdd = new btdd();
        f148380c = btdd;
        GeneratedMessageLite.m124024a(btdd.class, btdd);
    }

    private btdd() {
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
            return GeneratedMessageLite.m124022a(f148380c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\f\u0003\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btdd();
        } else {
            if (i2 == 4) {
                return new bxvd(f148380c);
            }
            if (i2 == 5) {
                return f148380c;
            }
            bxxk bxxk = f148381d;
            if (bxxk == null) {
                synchronized (btdd.class) {
                    bxxk = f148381d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148380c);
                        f148381d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
