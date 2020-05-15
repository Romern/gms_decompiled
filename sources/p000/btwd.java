package p000;

/* renamed from: btwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btwd f152690c;

    /* renamed from: d */
    private static volatile bxxk f152691d;

    /* renamed from: a */
    public int f152692a;

    /* renamed from: b */
    public boolean f152693b;

    static {
        btwd btwd = new btwd();
        f152690c = btwd;
        GeneratedMessageLite.m124024a(btwd.class, btwd);
    }

    private btwd() {
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
            return GeneratedMessageLite.m124022a(f152690c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u0004\u0003\u0007", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btwd();
        } else {
            if (i2 == 4) {
                return new bxvd(f152690c);
            }
            if (i2 == 5) {
                return f152690c;
            }
            bxxk bxxk = f152691d;
            if (bxxk == null) {
                synchronized (btwd.class) {
                    bxxk = f152691d;
                    if (bxxk == null) {
                        bxxk = new bxve(f152690c);
                        f152691d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
