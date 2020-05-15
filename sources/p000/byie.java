package p000;

/* renamed from: byie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byie extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byie f166554c;

    /* renamed from: d */
    private static volatile bxxk f166555d;

    /* renamed from: a */
    public int f166556a = 0;

    /* renamed from: b */
    public Object f166557b;

    static {
        byie byie = new byie();
        f166554c = byie;
        bxvk.m124024a(byie.class, byie);
    }

    private byie() {
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
            return bxvk.m124022a(f166554c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new byie();
        } else {
            if (i2 == 4) {
                return new bxvd(f166554c);
            }
            if (i2 == 5) {
                return f166554c;
            }
            bxxk bxxk = f166555d;
            if (bxxk == null) {
                synchronized (byie.class) {
                    bxxk = f166555d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166554c);
                        f166555d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
