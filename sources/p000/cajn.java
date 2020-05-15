package p000;

/* renamed from: cajn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cajn extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cajn f174839c;

    /* renamed from: d */
    private static volatile bxxk f174840d;

    /* renamed from: a */
    public int f174841a;

    /* renamed from: b */
    public int f174842b;

    static {
        cajn cajn = new cajn();
        f174839c = cajn;
        bxvk.m124024a(cajn.class, cajn);
    }

    private cajn() {
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
            return bxvk.m124022a(f174839c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", cajm.f174838a});
        } else if (i2 == 3) {
            return new cajn();
        } else {
            if (i2 == 4) {
                return new bxvd(f174839c);
            }
            if (i2 == 5) {
                return f174839c;
            }
            bxxk bxxk = f174840d;
            if (bxxk == null) {
                synchronized (cajn.class) {
                    bxxk = f174840d;
                    if (bxxk == null) {
                        bxxk = new bxve(f174839c);
                        f174840d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
