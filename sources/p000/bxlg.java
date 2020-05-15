package p000;

/* renamed from: bxlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxlg extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxvu f163842c = new bxld();

    /* renamed from: d */
    public static final bxlg f163843d;

    /* renamed from: f */
    private static volatile bxxk f163844f;

    /* renamed from: a */
    public bxla f163845a;

    /* renamed from: b */
    public bxvt f163846b = bxvm.f164965b;

    /* renamed from: e */
    private int f163847e;

    static {
        bxlg bxlg = new bxlg();
        f163843d = bxlg;
        bxvk.m124024a(bxlg.class, bxlg);
    }

    private bxlg() {
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
            return bxvk.m124022a(f163843d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001e", new Object[]{"e", "a", "b", bxlf.m122830b()});
        } else if (i2 == 3) {
            return new bxlg();
        } else {
            if (i2 == 4) {
                return new bxvd(f163843d);
            }
            if (i2 == 5) {
                return f163843d;
            }
            bxxk bxxk = f163844f;
            if (bxxk == null) {
                synchronized (bxlg.class) {
                    bxxk = f163844f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163843d);
                        f163844f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
