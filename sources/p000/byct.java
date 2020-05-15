package p000;

/* renamed from: byct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byct extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byct f165701c;

    /* renamed from: d */
    private static volatile bxxk f165702d;

    /* renamed from: a */
    public ByteString f165703a = ByteString.f164797b;

    /* renamed from: b */
    public ByteString f165704b = ByteString.f164797b;

    static {
        byct byct = new byct();
        f165701c = byct;
        GeneratedMessageLite.m124024a(byct.class, byct);
    }

    private byct() {
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
            return GeneratedMessageLite.m124022a(f165701c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byct();
        } else {
            if (i2 == 4) {
                return new bxvd(f165701c);
            }
            if (i2 == 5) {
                return f165701c;
            }
            bxxk bxxk = f165702d;
            if (bxxk == null) {
                synchronized (byct.class) {
                    bxxk = f165702d;
                    if (bxxk == null) {
                        bxxk = new bxve(f165701c);
                        f165702d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
