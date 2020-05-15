package p000;

/* renamed from: buzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buzo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final buzo f155407d;

    /* renamed from: f */
    private static volatile bxxk f155408f;

    /* renamed from: a */
    public int f155409a;

    /* renamed from: b */
    public String f155410b = "";

    /* renamed from: c */
    public buzp f155411c;

    /* renamed from: e */
    private byte f155412e = 2;

    static {
        buzo buzo = new buzo();
        f155407d = buzo;
        bxvk.m124024a(buzo.class, buzo);
    }

    private buzo() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f155412e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f155412e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f155407d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new buzo();
        } else {
            if (i2 == 4) {
                return new bxvd(f155407d);
            }
            if (i2 == 5) {
                return f155407d;
            }
            bxxk bxxk = f155408f;
            if (bxxk == null) {
                synchronized (buzo.class) {
                    bxxk = f155408f;
                    if (bxxk == null) {
                        bxxk = new bxve(f155407d);
                        f155408f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
