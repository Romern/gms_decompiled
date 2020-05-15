package p000;

/* renamed from: bray */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bray extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bray f142207d;

    /* renamed from: f */
    private static volatile bxxk f142208f;

    /* renamed from: a */
    public boolean f142209a;

    /* renamed from: b */
    public bree f142210b;

    /* renamed from: c */
    public bree f142211c;

    /* renamed from: e */
    private int f142212e;

    static {
        bray bray = new bray();
        f142207d = bray;
        bxvk.m124024a(bray.class, bray);
    }

    private bray() {
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
            return bxvk.m124022a(f142207d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bray();
        } else {
            if (i2 == 4) {
                return new bxvd(f142207d);
            }
            if (i2 == 5) {
                return f142207d;
            }
            bxxk bxxk = f142208f;
            if (bxxk == null) {
                synchronized (bray.class) {
                    bxxk = f142208f;
                    if (bxxk == null) {
                        bxxk = new bxve(f142207d);
                        f142208f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
