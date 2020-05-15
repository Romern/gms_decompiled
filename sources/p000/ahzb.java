package p000;

/* renamed from: ahzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahzb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final ahzb f68447c;

    /* renamed from: d */
    public static final bxvj f68448d;

    /* renamed from: e */
    private static volatile bxxk f68449e;

    /* renamed from: a */
    public int f68450a = 0;

    /* renamed from: b */
    public Object f68451b;

    static {
        ahzb ahzb = new ahzb();
        f68447c = ahzb;
        GeneratedMessageLite.m124024a(ahzb.class, ahzb);
        bygn bygn = bygn.f166357a;
        ahzb ahzb2 = f68447c;
        f68448d = GeneratedMessageLite.m124006a(bygn, ahzb2, ahzb2, 190536965, bxzf.MESSAGE);
    }

    private ahzb() {
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
            return GeneratedMessageLite.m124022a(f68447c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ြ\u0000", new Object[]{"b", "a", ahzc.f68452a, ahza.class});
        } else if (i2 == 3) {
            return new ahzb();
        } else {
            if (i2 == 4) {
                return new bxvd(f68447c);
            }
            if (i2 == 5) {
                return f68447c;
            }
            bxxk bxxk = f68449e;
            if (bxxk == null) {
                synchronized (ahzb.class) {
                    bxxk = f68449e;
                    if (bxxk == null) {
                        bxxk = new bxve(f68447c);
                        f68449e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
