package p000;

/* renamed from: bora */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bora extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bora f134365e;

    /* renamed from: f */
    private static volatile bxxk f134366f;

    /* renamed from: a */
    public int f134367a;

    /* renamed from: b */
    public boolean f134368b;

    /* renamed from: c */
    public boolean f134369c;

    /* renamed from: d */
    public boolean f134370d;

    static {
        bora bora = new bora();
        f134365e = bora;
        bxvk.m124024a(bora.class, bora);
    }

    private bora() {
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
            return bxvk.m124022a(f134365e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bora();
        } else {
            if (i2 == 4) {
                return new bxvd(f134365e);
            }
            if (i2 == 5) {
                return f134365e;
            }
            bxxk bxxk = f134366f;
            if (bxxk == null) {
                synchronized (bora.class) {
                    bxxk = f134366f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134365e);
                        f134366f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
