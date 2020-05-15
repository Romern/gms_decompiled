package p000;

/* renamed from: ayuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayuc extends bxvk implements bxxd {

    /* renamed from: a */
    public static final ayuc f98498a;

    /* renamed from: d */
    private static volatile bxxk f98499d;

    /* renamed from: b */
    private int f98500b;

    /* renamed from: c */
    private int f98501c;

    static {
        ayuc ayuc = new ayuc();
        f98498a = ayuc;
        bxvk.m124024a(ayuc.class, ayuc);
    }

    private ayuc() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m84823a(ayuc ayuc) {
        ayuc.f98500b |= 1;
        ayuc.f98501c = 703;
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
            return bxvk.m124022a(f98498a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new ayuc();
        } else {
            if (i2 == 4) {
                return new bxvd(f98498a);
            }
            if (i2 == 5) {
                return f98498a;
            }
            bxxk bxxk = f98499d;
            if (bxxk == null) {
                synchronized (ayuc.class) {
                    bxxk = f98499d;
                    if (bxxk == null) {
                        bxxk = new bxve(f98498a);
                        f98499d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
