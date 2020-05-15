package p000;

/* renamed from: jhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jhu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final jhu f22516c;

    /* renamed from: d */
    private static volatile bxxk f22517d;

    /* renamed from: a */
    public int f22518a;

    /* renamed from: b */
    public jia f22519b;

    static {
        jhu jhu = new jhu();
        f22516c = jhu;
        bxvk.m124024a(jhu.class, jhu);
    }

    private jhu() {
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
            return bxvk.m124022a(f22516c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new jhu();
        } else {
            if (i2 == 4) {
                return new bxvd(f22516c);
            }
            if (i2 == 5) {
                return f22516c;
            }
            bxxk bxxk = f22517d;
            if (bxxk == null) {
                synchronized (jhu.class) {
                    bxxk = f22517d;
                    if (bxxk == null) {
                        bxxk = new bxve(f22516c);
                        f22517d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
