package p000;

/* renamed from: cafc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafc extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cafc f172885b;

    /* renamed from: c */
    private static volatile bxxk f172886c;

    /* renamed from: a */
    public bxwc f172887a = bxxn.f165040b;

    static {
        cafc cafc = new cafc();
        f172885b = cafc;
        bxvk.m124024a(cafc.class, cafc);
    }

    private cafc() {
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
            return bxvk.m124022a(f172885b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", caet.class});
        } else if (i2 == 3) {
            return new cafc();
        } else {
            if (i2 == 4) {
                return new bxvd(f172885b);
            }
            if (i2 == 5) {
                return f172885b;
            }
            bxxk bxxk = f172886c;
            if (bxxk == null) {
                synchronized (cafc.class) {
                    bxxk = f172886c;
                    if (bxxk == null) {
                        bxxk = new bxve(f172885b);
                        f172886c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
