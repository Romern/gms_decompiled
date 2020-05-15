package p000;

/* renamed from: btru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btru extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btru f150150d;

    /* renamed from: f */
    private static volatile bxxk f150151f;

    /* renamed from: a */
    public btrw f150152a;

    /* renamed from: b */
    public btrv f150153b;

    /* renamed from: c */
    public btrz f150154c;

    /* renamed from: e */
    private int f150155e;

    static {
        btru btru = new btru();
        f150150d = btru;
        bxvk.m124024a(btru.class, btru);
    }

    private btru() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f150150d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new btru();
        } else {
            if (i2 == 4) {
                return new bxvd(f150150d);
            }
            if (i2 == 5) {
                return f150150d;
            }
            bxxk bxxk = f150151f;
            if (bxxk == null) {
                synchronized (btru.class) {
                    bxxk = f150151f;
                    if (bxxk == null) {
                        bxxk = new bxve(f150150d);
                        f150151f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
