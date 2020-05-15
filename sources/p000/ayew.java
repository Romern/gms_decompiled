package p000;

/* renamed from: ayew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayew extends bxvk implements bxxd {

    /* renamed from: g */
    public static final ayew f97392g;

    /* renamed from: i */
    private static volatile bxxk f97393i;

    /* renamed from: a */
    public int f97394a;

    /* renamed from: b */
    public bxtx f97395b = bxtx.f164797b;

    /* renamed from: c */
    public String f97396c = "";

    /* renamed from: d */
    public int f97397d;

    /* renamed from: e */
    public int f97398e;

    /* renamed from: f */
    public int f97399f = -1;

    /* renamed from: h */
    private byte f97400h = 2;

    static {
        ayew ayew = new ayew();
        f97392g = ayew;
        bxvk.m124024a(ayew.class, ayew);
    }

    private ayew() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f97400h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f97400h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f97392g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᔊ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new ayew();
        } else {
            if (i2 == 4) {
                return new bxvd(f97392g);
            }
            if (i2 == 5) {
                return f97392g;
            }
            bxxk bxxk = f97393i;
            if (bxxk == null) {
                synchronized (ayew.class) {
                    bxxk = f97393i;
                    if (bxxk == null) {
                        bxxk = new bxve(f97392g);
                        f97393i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
