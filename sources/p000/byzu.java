package p000;

/* renamed from: byzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzu extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byzu f169175b;

    /* renamed from: d */
    private static volatile bxxk f169176d;

    /* renamed from: a */
    public double f169177a;

    /* renamed from: c */
    private int f169178c;

    static {
        byzu byzu = new byzu();
        f169175b = byzu;
        bxvk.m124024a(byzu.class, byzu);
    }

    private byzu() {
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
            return bxvk.m124022a(f169175b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001က\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new byzu();
        } else {
            if (i2 == 4) {
                return new bxvd(f169175b);
            }
            if (i2 == 5) {
                return f169175b;
            }
            bxxk bxxk = f169176d;
            if (bxxk == null) {
                synchronized (byzu.class) {
                    bxxk = f169176d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169175b);
                        f169176d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
