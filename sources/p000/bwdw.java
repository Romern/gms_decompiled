package p000;

/* renamed from: bwdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwdw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwdw f158948c;

    /* renamed from: d */
    private static volatile bxxk f158949d;

    /* renamed from: a */
    public int f158950a;

    /* renamed from: b */
    public String f158951b = "";

    static {
        bwdw bwdw = new bwdw();
        f158948c = bwdw;
        bxvk.m124024a(bwdw.class, bwdw);
    }

    private bwdw() {
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
            return bxvk.m124022a(f158948c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwdw();
        } else {
            if (i2 == 4) {
                return new bxvd(f158948c);
            }
            if (i2 == 5) {
                return f158948c;
            }
            bxxk bxxk = f158949d;
            if (bxxk == null) {
                synchronized (bwdw.class) {
                    bxxk = f158949d;
                    if (bxxk == null) {
                        bxxk = new bxve(f158948c);
                        f158949d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
