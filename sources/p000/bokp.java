package p000;

/* renamed from: bokp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bokp extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bokp f133435g;

    /* renamed from: h */
    private static volatile bxxk f133436h;

    /* renamed from: a */
    public int f133437a;

    /* renamed from: b */
    public int f133438b;

    /* renamed from: c */
    public long f133439c;

    /* renamed from: d */
    public long f133440d;

    /* renamed from: e */
    public int f133441e;

    /* renamed from: f */
    public int f133442f = 1;

    static {
        bokp bokp = new bokp();
        f133435g = bokp;
        GeneratedMessageLite.m124024a(bokp.class, bokp);
    }

    private bokp() {
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
            return GeneratedMessageLite.m124022a(f133435g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဌ\u0004", new Object[]{"a", "b", bokn.f133433a, "c", "d", "e", "f", boko.f133434a});
        } else if (i2 == 3) {
            return new bokp();
        } else {
            if (i2 == 4) {
                return new bxvd(f133435g);
            }
            if (i2 == 5) {
                return f133435g;
            }
            bxxk bxxk = f133436h;
            if (bxxk == null) {
                synchronized (bokp.class) {
                    bxxk = f133436h;
                    if (bxxk == null) {
                        bxxk = new bxve(f133435g);
                        f133436h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
