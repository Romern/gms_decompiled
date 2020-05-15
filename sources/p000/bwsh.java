package p000;

/* renamed from: bwsh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwsh extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwsh f160858d;

    /* renamed from: e */
    private static volatile bxxk f160859e;

    /* renamed from: a */
    public int f160860a;

    /* renamed from: b */
    public String f160861b = "";

    /* renamed from: c */
    public String f160862c = "";

    static {
        bwsh bwsh = new bwsh();
        f160858d = bwsh;
        bxvk.m124024a(bwsh.class, bwsh);
    }

    private bwsh() {
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
            return bxvk.m124022a(f160858d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwsh();
        } else {
            if (i2 == 4) {
                return new bxvd(f160858d);
            }
            if (i2 == 5) {
                return f160858d;
            }
            bxxk bxxk = f160859e;
            if (bxxk == null) {
                synchronized (bwsh.class) {
                    bxxk = f160859e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160858d);
                        f160859e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
