package p000;

/* renamed from: blni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blni extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blni f126975d;

    /* renamed from: f */
    private static volatile bxxk f126976f;

    /* renamed from: a */
    public int f126977a;

    /* renamed from: b */
    public String f126978b = "";

    /* renamed from: c */
    public String f126979c = "";

    /* renamed from: e */
    private byte f126980e = 2;

    static {
        blni blni = new blni();
        f126975d = blni;
        bxvk.m124024a(blni.class, blni);
    }

    private blni() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126980e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f126980e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f126975d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blni();
        } else {
            if (i2 == 4) {
                return new bxvd(f126975d);
            }
            if (i2 == 5) {
                return f126975d;
            }
            bxxk bxxk = f126976f;
            if (bxxk == null) {
                synchronized (blni.class) {
                    bxxk = f126976f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126975d);
                        f126976f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
