package p000;

/* renamed from: bzww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzww extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzww f171685e;

    /* renamed from: g */
    private static volatile bxxk f171686g;

    /* renamed from: a */
    public int f171687a;

    /* renamed from: b */
    public brzy f171688b;

    /* renamed from: c */
    public String f171689c = "";

    /* renamed from: d */
    public String f171690d = "";

    /* renamed from: f */
    private byte f171691f = 2;

    static {
        bzww bzww = new bzww();
        f171685e = bzww;
        bxvk.m124024a(bzww.class, bzww);
    }

    private bzww() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f171691f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f171691f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f171685e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzww();
        } else {
            if (i2 == 4) {
                return new bxvd(f171685e);
            }
            if (i2 == 5) {
                return f171685e;
            }
            bxxk bxxk = f171686g;
            if (bxxk == null) {
                synchronized (bzww.class) {
                    bxxk = f171686g;
                    if (bxxk == null) {
                        bxxk = new bxve(f171685e);
                        f171686g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
