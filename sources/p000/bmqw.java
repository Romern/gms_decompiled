package p000;

/* renamed from: bmqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmqw extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmqw f130442c;

    /* renamed from: e */
    private static volatile bxxk f130443e;

    /* renamed from: a */
    public long f130444a;

    /* renamed from: b */
    public bmag f130445b;

    /* renamed from: d */
    private int f130446d;

    static {
        bmqw bmqw = new bmqw();
        f130442c = bmqw;
        GeneratedMessageLite.m124024a(bmqw.class, bmqw);
    }

    private bmqw() {
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
            return GeneratedMessageLite.m124022a(f130442c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bmqw();
        } else {
            if (i2 == 4) {
                return new bxvd(f130442c);
            }
            if (i2 == 5) {
                return f130442c;
            }
            bxxk bxxk = f130443e;
            if (bxxk == null) {
                synchronized (bmqw.class) {
                    bxxk = f130443e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130442c);
                        f130443e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
