package p000;

/* renamed from: byaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byaf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byaf f165243d;

    /* renamed from: e */
    private static volatile bxxk f165244e;

    /* renamed from: a */
    public int f165245a;

    /* renamed from: b */
    public boolean f165246b;

    /* renamed from: c */
    public ByteString f165247c = ByteString.f164797b;

    static {
        byaf byaf = new byaf();
        f165243d = byaf;
        GeneratedMessageLite.m124024a(byaf.class, byaf);
    }

    private byaf() {
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
            return GeneratedMessageLite.m124022a(f165243d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byaf();
        } else {
            if (i2 == 4) {
                return new bxvd(f165243d);
            }
            if (i2 == 5) {
                return f165243d;
            }
            bxxk bxxk = f165244e;
            if (bxxk == null) {
                synchronized (byaf.class) {
                    bxxk = f165244e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165243d);
                        f165244e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
