package p000;

/* renamed from: bwrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwrp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwrp f160785c;

    /* renamed from: d */
    public static final bxvj f160786d;

    /* renamed from: e */
    private static volatile bxxk f160787e;

    /* renamed from: a */
    public int f160788a = 0;

    /* renamed from: b */
    public Object f160789b;

    static {
        bwrp bwrp = new bwrp();
        f160785c = bwrp;
        bxvk.m124024a(bwrp.class, bwrp);
        bwny bwny = bwny.f160414k;
        bwrp bwrp2 = f160785c;
        f160786d = bxvk.m124006a(bwny, bwrp2, bwrp2, 268123868, bxzf.MESSAGE);
    }

    private bwrp() {
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
            return bxvk.m124022a(f160785c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ွ\u0000\u0002ွ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new bwrp();
        } else {
            if (i2 == 4) {
                return new bxvd(f160785c);
            }
            if (i2 == 5) {
                return f160785c;
            }
            bxxk bxxk = f160787e;
            if (bxxk == null) {
                synchronized (bwrp.class) {
                    bxxk = f160787e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160785c);
                        f160787e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
