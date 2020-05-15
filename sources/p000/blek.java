package p000;

/* renamed from: blek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blek extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blek f126216e;

    /* renamed from: f */
    private static volatile bxxk f126217f;

    /* renamed from: a */
    public int f126218a;

    /* renamed from: b */
    public bleu f126219b;

    /* renamed from: c */
    public String f126220c = "";

    /* renamed from: d */
    public int f126221d;

    static {
        blek blek = new blek();
        f126216e = blek;
        bxvk.m124024a(blek.class, blek);
    }

    private blek() {
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
            return bxvk.m124022a(f126216e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", blei.f126215a});
        } else if (i2 == 3) {
            return new blek();
        } else {
            if (i2 == 4) {
                return new bxvd(f126216e);
            }
            if (i2 == 5) {
                return f126216e;
            }
            bxxk bxxk = f126217f;
            if (bxxk == null) {
                synchronized (blek.class) {
                    bxxk = f126217f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126216e);
                        f126217f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
