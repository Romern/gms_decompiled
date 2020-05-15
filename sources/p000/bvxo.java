package p000;

/* renamed from: bvxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvxo extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvxo f158075e;

    /* renamed from: f */
    private static volatile bxxk f158076f;

    /* renamed from: a */
    public int f158077a;

    /* renamed from: b */
    public String f158078b = "";

    /* renamed from: c */
    public String f158079c = "";

    /* renamed from: d */
    public String f158080d = "";

    static {
        bvxo bvxo = new bvxo();
        f158075e = bvxo;
        bxvk.m124024a(bvxo.class, bvxo);
    }

    private bvxo() {
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
            return bxvk.m124022a(f158075e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bvxo();
        } else {
            if (i2 == 4) {
                return new bxvd(f158075e);
            }
            if (i2 == 5) {
                return f158075e;
            }
            bxxk bxxk = f158076f;
            if (bxxk == null) {
                synchronized (bvxo.class) {
                    bxxk = f158076f;
                    if (bxxk == null) {
                        bxxk = new bxve(f158075e);
                        f158076f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
