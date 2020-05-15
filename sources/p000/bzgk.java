package p000;

/* renamed from: bzgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzgk f169939c;

    /* renamed from: d */
    private static volatile bxxk f169940d;

    /* renamed from: a */
    public int f169941a;

    /* renamed from: b */
    public int f169942b;

    static {
        bzgk bzgk = new bzgk();
        f169939c = bzgk;
        GeneratedMessageLite.m124024a(bzgk.class, bzgk);
    }

    private bzgk() {
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
            return GeneratedMessageLite.m124022a(f169939c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzgi.f169938a});
        } else if (i2 == 3) {
            return new bzgk();
        } else {
            if (i2 == 4) {
                return new bxvd(f169939c);
            }
            if (i2 == 5) {
                return f169939c;
            }
            bxxk bxxk = f169940d;
            if (bxxk == null) {
                synchronized (bzgk.class) {
                    bxxk = f169940d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169939c);
                        f169940d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
