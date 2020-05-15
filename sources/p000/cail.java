package p000;

/* renamed from: cail */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cail extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cail f174729d;

    /* renamed from: f */
    private static volatile bxxk f174730f;

    /* renamed from: a */
    public int f174731a;

    /* renamed from: b */
    public caim f174732b;

    /* renamed from: c */
    public String f174733c = "";

    /* renamed from: e */
    private byte f174734e = 2;

    static {
        cail cail = new cail();
        f174729d = cail;
        bxvk.m124024a(cail.class, cail);
    }

    private cail() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f174734e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f174734e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f174729d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cail();
        } else {
            if (i2 == 4) {
                return new bxvd(f174729d);
            }
            if (i2 == 5) {
                return f174729d;
            }
            bxxk bxxk = f174730f;
            if (bxxk == null) {
                synchronized (cail.class) {
                    bxxk = f174730f;
                    if (bxxk == null) {
                        bxxk = new bxve(f174729d);
                        f174730f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
