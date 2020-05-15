package p000;

/* renamed from: mtu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mtu extends bxvk implements bxxd {

    /* renamed from: f */
    public static final mtu f34712f;

    /* renamed from: g */
    private static volatile bxxk f34713g;

    /* renamed from: a */
    public int f34714a;

    /* renamed from: b */
    public int f34715b;

    /* renamed from: c */
    public long f34716c;

    /* renamed from: d */
    public int f34717d;

    /* renamed from: e */
    public int f34718e;

    static {
        mtu mtu = new mtu();
        f34712f = mtu;
        bxvk.m124024a(mtu.class, mtu);
    }

    private mtu() {
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
            return bxvk.m124022a(f34712f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", mts.f34710a, "c", "d", mtt.f34711a, "e", mtt.f34711a});
        } else if (i2 == 3) {
            return new mtu();
        } else {
            if (i2 == 4) {
                return new bxvd(f34712f);
            }
            if (i2 == 5) {
                return f34712f;
            }
            bxxk bxxk = f34713g;
            if (bxxk == null) {
                synchronized (mtu.class) {
                    bxxk = f34713g;
                    if (bxxk == null) {
                        bxxk = new bxve(f34712f);
                        f34713g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
