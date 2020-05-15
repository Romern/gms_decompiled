package p000;

/* renamed from: brdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brdm extends bxvk implements bxxd {

    /* renamed from: d */
    public static final brdm f142533d;

    /* renamed from: e */
    private static volatile bxxk f142534e;

    /* renamed from: a */
    public int f142535a;

    /* renamed from: b */
    public String f142536b = "";

    /* renamed from: c */
    public String f142537c = "";

    static {
        brdm brdm = new brdm();
        f142533d = brdm;
        bxvk.m124024a(brdm.class, brdm);
    }

    private brdm() {
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
            return bxvk.m124022a(f142533d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new brdm();
        } else {
            if (i2 == 4) {
                return new bxvd(f142533d);
            }
            if (i2 == 5) {
                return f142533d;
            }
            bxxk bxxk = f142534e;
            if (bxxk == null) {
                synchronized (brdm.class) {
                    bxxk = f142534e;
                    if (bxxk == null) {
                        bxxk = new bxve(f142533d);
                        f142534e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
