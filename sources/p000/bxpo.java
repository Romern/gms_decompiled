package p000;

/* renamed from: bxpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpo extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxpo f164291c;

    /* renamed from: f */
    private static volatile bxxk f164292f;

    /* renamed from: a */
    public int f164293a;

    /* renamed from: b */
    public String f164294b = "";

    /* renamed from: d */
    private btuf f164295d;

    /* renamed from: e */
    private byte f164296e = 2;

    static {
        bxpo bxpo = new bxpo();
        f164291c = bxpo;
        bxvk.m124024a(bxpo.class, bxpo);
    }

    private bxpo() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f164296e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f164296e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f164291c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"a", "d", "b"});
        } else if (i2 == 3) {
            return new bxpo();
        } else {
            if (i2 == 4) {
                return new bxvd(f164291c);
            }
            if (i2 == 5) {
                return f164291c;
            }
            bxxk bxxk = f164292f;
            if (bxxk == null) {
                synchronized (bxpo.class) {
                    bxxk = f164292f;
                    if (bxxk == null) {
                        bxxk = new bxve(f164291c);
                        f164292f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
