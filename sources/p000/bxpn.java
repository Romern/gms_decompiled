package p000;

/* renamed from: bxpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpn extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxpn f164287c;

    /* renamed from: d */
    private static volatile bxxk f164288d;

    /* renamed from: a */
    public int f164289a = 0;

    /* renamed from: b */
    public Object f164290b;

    static {
        bxpn bxpn = new bxpn();
        f164287c = bxpn;
        GeneratedMessageLite.m124024a(bxpn.class, bxpn);
    }

    private bxpn() {
        bxvm bxvm = bxvm.f164965b;
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f164287c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ဿ\u0000", new Object[]{"b", "a", bsnc.class, bxpl.f164286a});
        } else if (i2 == 3) {
            return new bxpn();
        } else {
            if (i2 == 4) {
                return new bxvd(f164287c);
            }
            if (i2 == 5) {
                return f164287c;
            }
            bxxk bxxk = f164288d;
            if (bxxk == null) {
                synchronized (bxpn.class) {
                    bxxk = f164288d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164287c);
                        f164288d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
