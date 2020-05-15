package p000;

/* renamed from: aqcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqcg extends bxvk implements bxxd {

    /* renamed from: b */
    public static final aqcg f85649b;

    /* renamed from: d */
    private static volatile bxxk f85650d;

    /* renamed from: a */
    public long f85651a;

    /* renamed from: c */
    private int f85652c;

    static {
        aqcg aqcg = new aqcg();
        f85649b = aqcg;
        bxvk.m124024a(aqcg.class, aqcg);
    }

    private aqcg() {
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
            return bxvk.m124022a(f85649b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new aqcg();
        } else {
            if (i2 == 4) {
                return new bxvd(f85649b);
            }
            if (i2 == 5) {
                return f85649b;
            }
            bxxk bxxk = f85650d;
            if (bxxk == null) {
                synchronized (aqcg.class) {
                    bxxk = f85650d;
                    if (bxxk == null) {
                        bxxk = new bxve(f85649b);
                        f85650d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
