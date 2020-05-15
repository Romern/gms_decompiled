package p000;

/* renamed from: bufg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bufg extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bufg f153692c;

    /* renamed from: e */
    private static volatile bxxk f153693e;

    /* renamed from: a */
    public bueu f153694a;

    /* renamed from: b */
    public bxwc f153695b = bxxn.f165040b;

    /* renamed from: d */
    private int f153696d;

    static {
        bufg bufg = new bufg();
        f153692c = bufg;
        bxvk.m124024a(bufg.class, bufg);
    }

    private bufg() {
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
            return bxvk.m124022a(f153692c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", buff.class});
        } else if (i2 == 3) {
            return new bufg();
        } else {
            if (i2 == 4) {
                return new bxvd(f153692c);
            }
            if (i2 == 5) {
                return f153692c;
            }
            bxxk bxxk = f153693e;
            if (bxxk == null) {
                synchronized (bufg.class) {
                    bxxk = f153693e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153692c);
                        f153693e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
