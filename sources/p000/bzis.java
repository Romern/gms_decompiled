package p000;

/* renamed from: bzis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzis extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzis f170229b;

    /* renamed from: d */
    private static volatile bxxk f170230d;

    /* renamed from: a */
    public ByteString f170231a = ByteString.f164797b;

    /* renamed from: c */
    private int f170232c;

    static {
        bzis bzis = new bzis();
        f170229b = bzis;
        GeneratedMessageLite.m124024a(bzis.class, bzis);
    }

    private bzis() {
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
            return GeneratedMessageLite.m124022a(f170229b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bzis();
        } else {
            if (i2 == 4) {
                return new bxvd(f170229b);
            }
            if (i2 == 5) {
                return f170229b;
            }
            bxxk bxxk = f170230d;
            if (bxxk == null) {
                synchronized (bzis.class) {
                    bxxk = f170230d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170229b);
                        f170230d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
