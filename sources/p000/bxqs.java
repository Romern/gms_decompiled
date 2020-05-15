package p000;

/* renamed from: bxqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxqs extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxqs f164423c;

    /* renamed from: e */
    private static volatile bxxk f164424e;

    /* renamed from: a */
    public bxqt f164425a;

    /* renamed from: b */
    public String f164426b = "";

    /* renamed from: d */
    private int f164427d;

    static {
        bxqs bxqs = new bxqs();
        f164423c = bxqs;
        GeneratedMessageLite.m124024a(bxqs.class, bxqs);
    }

    private bxqs() {
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
            return GeneratedMessageLite.m124022a(f164423c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0002", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bxqs();
        } else {
            if (i2 == 4) {
                return new bxvd(f164423c);
            }
            if (i2 == 5) {
                return f164423c;
            }
            bxxk bxxk = f164424e;
            if (bxxk == null) {
                synchronized (bxqs.class) {
                    bxxk = f164424e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164423c);
                        f164424e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
