package p000;

/* renamed from: btds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btds extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btds f148446b;

    /* renamed from: c */
    private static volatile bxxk f148447c;

    /* renamed from: a */
    public bxwc f148448a = bxxn.f165040b;

    static {
        btds btds = new btds();
        f148446b = btds;
        bxvk.m124024a(btds.class, btds);
    }

    private btds() {
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
            return bxvk.m124022a(f148446b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btds();
        } else {
            if (i2 == 4) {
                return new bxvd(f148446b);
            }
            if (i2 == 5) {
                return f148446b;
            }
            bxxk bxxk = f148447c;
            if (bxxk == null) {
                synchronized (btds.class) {
                    bxxk = f148447c;
                    if (bxxk == null) {
                        bxxk = new bxve(f148446b);
                        f148447c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
