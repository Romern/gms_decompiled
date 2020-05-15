package p000;

/* renamed from: bzdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzdu extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzdu f169578c;

    /* renamed from: d */
    private static volatile bxxk f169579d;

    /* renamed from: a */
    public int f169580a;

    /* renamed from: b */
    public int f169581b;

    static {
        bzdu bzdu = new bzdu();
        f169578c = bzdu;
        GeneratedMessageLite.m124024a(bzdu.class, bzdu);
    }

    private bzdu() {
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
            return GeneratedMessageLite.m124022a(f169578c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzdu();
        } else {
            if (i2 == 4) {
                return new bxvd(f169578c);
            }
            if (i2 == 5) {
                return f169578c;
            }
            bxxk bxxk = f169579d;
            if (bxxk == null) {
                synchronized (bzdu.class) {
                    bxxk = f169579d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169578c);
                        f169579d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
