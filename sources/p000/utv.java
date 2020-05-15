package p000;

/* renamed from: utv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class utv extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final utv f48635f;

    /* renamed from: h */
    private static volatile bxxk f48636h;

    /* renamed from: a */
    public int f48637a;

    /* renamed from: b */
    public int f48638b = 1;

    /* renamed from: c */
    public long f48639c = -1;

    /* renamed from: d */
    public long f48640d = -1;

    /* renamed from: e */
    public long f48641e = -1;

    /* renamed from: g */
    private byte f48642g = 2;

    static {
        utv utv = new utv();
        f48635f = utv;
        GeneratedMessageLite.m124024a(utv.class, utv);
    }

    private utv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f48642g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f48642g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f48635f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔐ\u0001\u0003ᔐ\u0002\u0004ᔐ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new utv();
        } else {
            if (i2 == 4) {
                return new bxvd(f48635f);
            }
            if (i2 == 5) {
                return f48635f;
            }
            bxxk bxxk = f48636h;
            if (bxxk == null) {
                synchronized (utv.class) {
                    bxxk = f48636h;
                    if (bxxk == null) {
                        bxxk = new bxve(f48635f);
                        f48636h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
