package p000;

/* renamed from: bxoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxoz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxoz f164215c;

    /* renamed from: d */
    private static volatile bxxk f164216d;

    /* renamed from: a */
    public int f164217a;

    /* renamed from: b */
    public long f164218b;

    static {
        bxoz bxoz = new bxoz();
        f164215c = bxoz;
        GeneratedMessageLite.m124024a(bxoz.class, bxoz);
    }

    private bxoz() {
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
            return GeneratedMessageLite.m124022a(f164215c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxoz();
        } else {
            if (i2 == 4) {
                return new bxvd(f164215c);
            }
            if (i2 == 5) {
                return f164215c;
            }
            bxxk bxxk = f164216d;
            if (bxxk == null) {
                synchronized (bxoz.class) {
                    bxxk = f164216d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164215c);
                        f164216d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
