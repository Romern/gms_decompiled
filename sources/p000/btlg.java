package p000;

/* renamed from: btlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btlg extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btlg f149363b;

    /* renamed from: c */
    private static volatile bxxk f149364c;

    /* renamed from: a */
    public int f149365a;

    static {
        btlg btlg = new btlg();
        f149363b = btlg;
        bxvk.m124024a(btlg.class, btlg);
    }

    private btlg() {
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
            return bxvk.m124022a(f149363b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btlg();
        } else {
            if (i2 == 4) {
                return new bxvd(f149363b);
            }
            if (i2 == 5) {
                return f149363b;
            }
            bxxk bxxk = f149364c;
            if (bxxk == null) {
                synchronized (btlg.class) {
                    bxxk = f149364c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149363b);
                        f149364c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
