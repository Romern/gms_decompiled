package p000;

/* renamed from: bxla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxla extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxla f163823c;

    /* renamed from: e */
    private static volatile bxxk f163824e;

    /* renamed from: a */
    public long f163825a;

    /* renamed from: b */
    public long f163826b;

    /* renamed from: d */
    private int f163827d;

    static {
        bxla bxla = new bxla();
        f163823c = bxla;
        bxvk.m124024a(bxla.class, bxla);
    }

    private bxla() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f163823c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bxla();
        } else {
            if (i2 == 4) {
                return new bxvd(f163823c);
            }
            if (i2 == 5) {
                return f163823c;
            }
            bxxk bxxk = f163824e;
            if (bxxk == null) {
                synchronized (bxla.class) {
                    bxxk = f163824e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163823c);
                        f163824e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
