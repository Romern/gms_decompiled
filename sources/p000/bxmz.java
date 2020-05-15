package p000;

/* renamed from: bxmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxmz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxmz f163999c;

    /* renamed from: d */
    public static final bxvj f164000d;

    /* renamed from: e */
    private static volatile bxxk f164001e;

    /* renamed from: a */
    public int f164002a;

    /* renamed from: b */
    public int f164003b;

    static {
        bxmz bxmz = new bxmz();
        f163999c = bxmz;
        GeneratedMessageLite.m124024a(bxmz.class, bxmz);
        bxcf bxcf = bxcf.f162779a;
        bxmz bxmz2 = f163999c;
        f164000d = GeneratedMessageLite.m124006a(bxcf, bxmz2, bxmz2, 79284926, bxzf.MESSAGE);
    }

    private bxmz() {
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
            return GeneratedMessageLite.m124022a(f163999c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bxmx.f163998a});
        } else if (i2 == 3) {
            return new bxmz();
        } else {
            if (i2 == 4) {
                return new bxvd(f163999c);
            }
            if (i2 == 5) {
                return f163999c;
            }
            bxxk bxxk = f164001e;
            if (bxxk == null) {
                synchronized (bxmz.class) {
                    bxxk = f164001e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163999c);
                        f164001e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
