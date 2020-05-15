package p000;

/* renamed from: caio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caio extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final caio f174748e;

    /* renamed from: g */
    private static volatile bxxk f174749g;

    /* renamed from: a */
    public int f174750a;

    /* renamed from: b */
    public long f174751b;

    /* renamed from: c */
    public cail f174752c;

    /* renamed from: d */
    public String f174753d = "";

    /* renamed from: f */
    private byte f174754f = 2;

    static {
        caio caio = new caio();
        f174748e = caio;
        GeneratedMessageLite.m124024a(caio.class, caio);
    }

    private caio() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f174754f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f174754f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f174748e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဂ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new caio();
        } else {
            if (i2 == 4) {
                return new bxvd(f174748e);
            }
            if (i2 == 5) {
                return f174748e;
            }
            bxxk bxxk = f174749g;
            if (bxxk == null) {
                synchronized (caio.class) {
                    bxxk = f174749g;
                    if (bxxk == null) {
                        bxxk = new bxve(f174748e);
                        f174749g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
