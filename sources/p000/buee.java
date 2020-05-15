package p000;

/* renamed from: buee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buee extends bxvk implements bxxd {

    /* renamed from: d */
    public static final buee f153568d;

    /* renamed from: f */
    private static volatile bxxk f153569f;

    /* renamed from: a */
    public int f153570a = 0;

    /* renamed from: b */
    public Object f153571b;

    /* renamed from: c */
    public int f153572c;

    /* renamed from: e */
    private int f153573e;

    static {
        buee buee = new buee();
        f153568d = buee;
        bxvk.m124024a(buee.class, buee);
    }

    private buee() {
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
            return bxvk.m124022a(f153568d, "\u0001\u0004\u0001\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဌ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"b", "a", "e", "c", buec.f153567a, buel.class, buel.class, buel.class});
        } else if (i2 == 3) {
            return new buee();
        } else {
            if (i2 == 4) {
                return new bxvd(f153568d);
            }
            if (i2 == 5) {
                return f153568d;
            }
            bxxk bxxk = f153569f;
            if (bxxk == null) {
                synchronized (buee.class) {
                    bxxk = f153569f;
                    if (bxxk == null) {
                        bxxk = new bxve(f153568d);
                        f153569f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
