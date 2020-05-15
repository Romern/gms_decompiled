package p000;

/* renamed from: bytr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bytr extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bytr f167707e;

    /* renamed from: f */
    private static volatile bxxk f167708f;

    /* renamed from: a */
    public int f167709a;

    /* renamed from: b */
    public String f167710b = "";

    /* renamed from: c */
    public String f167711c = "";

    /* renamed from: d */
    public String f167712d = "";

    static {
        bytr bytr = new bytr();
        f167707e = bytr;
        bxvk.m124024a(bytr.class, bytr);
    }

    private bytr() {
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
            return bxvk.m124022a(f167707e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bytr();
        } else {
            if (i2 == 4) {
                return new bxvd(f167707e);
            }
            if (i2 == 5) {
                return f167707e;
            }
            bxxk bxxk = f167708f;
            if (bxxk == null) {
                synchronized (bytr.class) {
                    bxxk = f167708f;
                    if (bxxk == null) {
                        bxxk = new bxve(f167707e);
                        f167708f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
