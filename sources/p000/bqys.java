package p000;

/* renamed from: bqys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqys extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bqys f141973g;

    /* renamed from: h */
    private static volatile bxxk f141974h;

    /* renamed from: a */
    public int f141975a;

    /* renamed from: b */
    public bqzn f141976b;

    /* renamed from: c */
    public ByteString f141977c = ByteString.f164797b;

    /* renamed from: d */
    public bxwc f141978d = bxxn.f165040b;

    /* renamed from: e */
    public ByteString f141979e = ByteString.f164797b;

    /* renamed from: f */
    public boolean f141980f;

    static {
        bqys bqys = new bqys();
        f141973g = bqys;
        GeneratedMessageLite.m124024a(bqys.class, bqys);
    }

    private bqys() {
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
            return GeneratedMessageLite.m124022a(f141973g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003\u001b\u0004ည\u0002\u0005ဇ\u0003", new Object[]{"a", "b", "c", "d", bqzm.class, "e", "f"});
        } else if (i2 == 3) {
            return new bqys();
        } else {
            if (i2 == 4) {
                return new bqyr();
            }
            if (i2 == 5) {
                return f141973g;
            }
            bxxk bxxk = f141974h;
            if (bxxk == null) {
                synchronized (bqys.class) {
                    bxxk = f141974h;
                    if (bxxk == null) {
                        bxxk = new bxve(f141973g);
                        f141974h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
