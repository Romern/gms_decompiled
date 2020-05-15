package p000;

/* renamed from: bmsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsf extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmsf f130661f;

    /* renamed from: h */
    private static volatile bxxk f130662h;

    /* renamed from: a */
    public int f130663a;

    /* renamed from: b */
    public bmrw f130664b;

    /* renamed from: c */
    public bmrv f130665c;

    /* renamed from: d */
    public int f130666d;

    /* renamed from: e */
    public bxtx f130667e = bxtx.f164797b;

    /* renamed from: g */
    private byte f130668g = 2;

    static {
        bmsf bmsf = new bmsf();
        f130661f = bmsf;
        bxvk.m124024a(bmsf.class, bmsf);
    }

    private bmsf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f130668g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f130668g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f130661f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", "d", bmsd.f130660a, "e"});
        } else if (i2 == 3) {
            return new bmsf();
        } else {
            if (i2 == 4) {
                return new bxvd(f130661f);
            }
            if (i2 == 5) {
                return f130661f;
            }
            bxxk bxxk = f130662h;
            if (bxxk == null) {
                synchronized (bmsf.class) {
                    bxxk = f130662h;
                    if (bxxk == null) {
                        bxxk = new bxve(f130661f);
                        f130662h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
