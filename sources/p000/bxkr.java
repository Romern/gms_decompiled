package p000;

/* renamed from: bxkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxkr extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxkr f163786e;

    /* renamed from: f */
    public static final bxvj f163787f;

    /* renamed from: g */
    private static volatile bxxk f163788g;

    /* renamed from: a */
    public int f163789a;

    /* renamed from: b */
    public int f163790b;

    /* renamed from: c */
    public int f163791c;

    /* renamed from: d */
    public String f163792d = "";

    static {
        bxkr bxkr = new bxkr();
        f163786e = bxkr;
        GeneratedMessageLite.m124024a(bxkr.class, bxkr);
        bxcf bxcf = bxcf.f162779a;
        bxkr bxkr2 = f163786e;
        f163787f = GeneratedMessageLite.m124006a(bxcf, bxkr2, bxkr2, 166262701, bxzf.MESSAGE);
    }

    private bxkr() {
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
            return GeneratedMessageLite.m124022a(f163786e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", bxks.f163793a, "d"});
        } else if (i2 == 3) {
            return new bxkr();
        } else {
            if (i2 == 4) {
                return new bxvd(f163786e);
            }
            if (i2 == 5) {
                return f163786e;
            }
            bxxk bxxk = f163788g;
            if (bxxk == null) {
                synchronized (bxkr.class) {
                    bxxk = f163788g;
                    if (bxxk == null) {
                        bxxk = new bxve(f163786e);
                        f163788g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
