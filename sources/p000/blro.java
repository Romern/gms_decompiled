package p000;

/* renamed from: blro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blro extends bxvk implements bxxd {

    /* renamed from: g */
    public static final blro f127492g;

    /* renamed from: i */
    private static volatile bxxk f127493i;

    /* renamed from: a */
    public int f127494a;

    /* renamed from: b */
    public blrk f127495b;

    /* renamed from: c */
    public blou f127496c;

    /* renamed from: d */
    public blrt f127497d;

    /* renamed from: e */
    public blrj f127498e;

    /* renamed from: f */
    public blrb f127499f;

    /* renamed from: h */
    private byte f127500h = 2;

    static {
        blro blro = new blro();
        f127492g = blro;
        bxvk.m124024a(blro.class, blro);
    }

    private blro() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127500h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127500h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127492g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0007ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new blro();
        } else {
            if (i2 == 4) {
                return new bxvd(f127492g);
            }
            if (i2 == 5) {
                return f127492g;
            }
            bxxk bxxk = f127493i;
            if (bxxk == null) {
                synchronized (blro.class) {
                    bxxk = f127493i;
                    if (bxxk == null) {
                        bxxk = new bxve(f127492g);
                        f127493i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
