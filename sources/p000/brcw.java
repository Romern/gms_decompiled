package p000;

/* renamed from: brcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brcw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final brcw f142442d;

    /* renamed from: e */
    private static volatile bxxk f142443e;

    /* renamed from: a */
    public int f142444a;

    /* renamed from: b */
    public bral f142445b;

    /* renamed from: c */
    public bree f142446c;

    static {
        brcw brcw = new brcw();
        f142442d = brcw;
        bxvk.m124024a(brcw.class, brcw);
    }

    private brcw() {
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
            return bxvk.m124022a(f142442d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new brcw();
        } else {
            if (i2 == 4) {
                return new bxvd(f142442d);
            }
            if (i2 == 5) {
                return f142442d;
            }
            bxxk bxxk = f142443e;
            if (bxxk == null) {
                synchronized (brcw.class) {
                    bxxk = f142443e;
                    if (bxxk == null) {
                        bxxk = new bxve(f142442d);
                        f142443e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
