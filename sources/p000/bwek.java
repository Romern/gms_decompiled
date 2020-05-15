package p000;

/* renamed from: bwek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwek extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwek f158995d;

    /* renamed from: e */
    private static volatile bxxk f158996e;

    /* renamed from: a */
    public int f158997a;

    /* renamed from: b */
    public int f158998b;

    /* renamed from: c */
    public String f158999c = "";

    static {
        bwek bwek = new bwek();
        f158995d = bwek;
        bxvk.m124024a(bwek.class, bwek);
    }

    private bwek() {
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
            return bxvk.m124022a(f158995d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwek();
        } else {
            if (i2 == 4) {
                return new bxvd(f158995d);
            }
            if (i2 == 5) {
                return f158995d;
            }
            bxxk bxxk = f158996e;
            if (bxxk == null) {
                synchronized (bwek.class) {
                    bxxk = f158996e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158995d);
                        f158996e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
