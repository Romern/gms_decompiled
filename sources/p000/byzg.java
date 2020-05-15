package p000;

/* renamed from: byzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzg extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byzg f169074b;

    /* renamed from: d */
    private static volatile bxxk f169075d;

    /* renamed from: a */
    public String f169076a = "";

    /* renamed from: c */
    private int f169077c;

    static {
        byzg byzg = new byzg();
        f169074b = byzg;
        bxvk.m124024a(byzg.class, byzg);
    }

    private byzg() {
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
            return bxvk.m124022a(f169074b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new byzg();
        } else {
            if (i2 == 4) {
                return new bxvd(f169074b);
            }
            if (i2 == 5) {
                return f169074b;
            }
            bxxk bxxk = f169075d;
            if (bxxk == null) {
                synchronized (byzg.class) {
                    bxxk = f169075d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169074b);
                        f169075d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
