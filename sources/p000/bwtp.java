package p000;

/* renamed from: bwtp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwtp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwtp f160981c;

    /* renamed from: d */
    public static final bxvj f160982d;

    /* renamed from: e */
    private static volatile bxxk f160983e;

    /* renamed from: a */
    public int f160984a;

    /* renamed from: b */
    public int f160985b = 1;

    static {
        bwtp bwtp = new bwtp();
        f160981c = bwtp;
        GeneratedMessageLite.m124024a(bwtp.class, bwtp);
        bwog bwog = bwog.f160437f;
        bwtp bwtp2 = f160981c;
        f160982d = GeneratedMessageLite.m124006a(bwog, bwtp2, bwtp2, 265521645, bxzf.MESSAGE);
    }

    private bwtp() {
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
            return GeneratedMessageLite.m124022a(f160981c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bwtx.f161006a});
        } else if (i2 == 3) {
            return new bwtp();
        } else {
            if (i2 == 4) {
                return new bxvd(f160981c);
            }
            if (i2 == 5) {
                return f160981c;
            }
            bxxk bxxk = f160983e;
            if (bxxk == null) {
                synchronized (bwtp.class) {
                    bxxk = f160983e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160981c);
                        f160983e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
