package p000;

/* renamed from: bxil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxil extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxil f163533c;

    /* renamed from: d */
    private static volatile bxxk f163534d;

    /* renamed from: a */
    public int f163535a;

    /* renamed from: b */
    public String f163536b = "";

    static {
        bxil bxil = new bxil();
        f163533c = bxil;
        bxvk.m124024a(bxil.class, bxil);
    }

    private bxil() {
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
            return bxvk.m124022a(f163533c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxil();
        } else {
            if (i2 == 4) {
                return new bxvd(f163533c);
            }
            if (i2 == 5) {
                return f163533c;
            }
            bxxk bxxk = f163534d;
            if (bxxk == null) {
                synchronized (bxil.class) {
                    bxxk = f163534d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163533c);
                        f163534d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
