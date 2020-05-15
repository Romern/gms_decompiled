package p000;

/* renamed from: bqta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqta extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqta f141613c;

    /* renamed from: d */
    private static volatile bxxk f141614d;

    /* renamed from: a */
    public int f141615a;

    /* renamed from: b */
    public bxtx f141616b = bxtx.f164797b;

    static {
        bqta bqta = new bqta();
        f141613c = bqta;
        bxvk.m124024a(bqta.class, bqta);
    }

    private bqta() {
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
            return bxvk.m124022a(f141613c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqta();
        } else {
            if (i2 == 4) {
                return new bxvd(f141613c);
            }
            if (i2 == 5) {
                return f141613c;
            }
            bxxk bxxk = f141614d;
            if (bxxk == null) {
                synchronized (bqta.class) {
                    bxxk = f141614d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141613c);
                        f141614d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
