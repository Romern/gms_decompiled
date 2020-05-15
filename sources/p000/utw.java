package p000;

/* renamed from: utw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class utw extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final utw f48643g;

    /* renamed from: i */
    private static volatile bxxk f48644i;

    /* renamed from: a */
    public int f48645a;

    /* renamed from: b */
    public int f48646b = 1;

    /* renamed from: c */
    public String f48647c = "";

    /* renamed from: d */
    public long f48648d = -1;

    /* renamed from: e */
    public long f48649e = -1;

    /* renamed from: f */
    public int f48650f = -1;

    /* renamed from: h */
    private byte f48651h = 2;

    static {
        utw utw = new utw();
        f48643g = utw;
        GeneratedMessageLite.m124024a(utw.class, utw);
    }

    private utw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f48651h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f48651h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f48643g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔈ\u0001\u0003ᔐ\u0002\u0004ᔐ\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new utw();
        } else {
            if (i2 == 4) {
                return new bxvd(f48643g);
            }
            if (i2 == 5) {
                return f48643g;
            }
            bxxk bxxk = f48644i;
            if (bxxk == null) {
                synchronized (utw.class) {
                    bxxk = f48644i;
                    if (bxxk == null) {
                        bxxk = new bxve(f48643g);
                        f48644i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
