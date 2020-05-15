package p000;

/* renamed from: cabg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cabg extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cabg f172429c;

    /* renamed from: e */
    private static volatile bxxk f172430e;

    /* renamed from: a */
    public String f172431a = "";

    /* renamed from: b */
    public bxwc f172432b = bxxn.f165040b;

    /* renamed from: d */
    private int f172433d;

    static {
        cabg cabg = new cabg();
        f172429c = cabg;
        GeneratedMessageLite.m124024a(cabg.class, cabg);
    }

    private cabg() {
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
            return GeneratedMessageLite.m124022a(f172429c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", cabh.class});
        } else if (i2 == 3) {
            return new cabg();
        } else {
            if (i2 == 4) {
                return new bxvd(f172429c);
            }
            if (i2 == 5) {
                return f172429c;
            }
            bxxk bxxk = f172430e;
            if (bxxk == null) {
                synchronized (cabg.class) {
                    bxxk = f172430e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172429c);
                        f172430e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
