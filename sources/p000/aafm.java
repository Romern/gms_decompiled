package p000;

/* renamed from: aafm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aafm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final aafm f28023c;

    /* renamed from: d */
    private static volatile bxxk f28024d;

    /* renamed from: a */
    public int f28025a;

    /* renamed from: b */
    public int f28026b;

    static {
        aafm aafm = new aafm();
        f28023c = aafm;
        bxvk.m124024a(aafm.class, aafm);
    }

    private aafm() {
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
            return bxvk.m124022a(f28023c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", aafl.f28022a});
        } else if (i2 == 3) {
            return new aafm();
        } else {
            if (i2 == 4) {
                return new bxvd(f28023c);
            }
            if (i2 == 5) {
                return f28023c;
            }
            bxxk bxxk = f28024d;
            if (bxxk == null) {
                synchronized (aafm.class) {
                    bxxk = f28024d;
                    if (bxxk == null) {
                        bxxk = new bxve(f28023c);
                        f28024d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
