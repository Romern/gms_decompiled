package p000;

/* renamed from: bvqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqm extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvqm f157394a;

    /* renamed from: b */
    private static volatile bxxk f157395b;

    static {
        bvqm bvqm = new bvqm();
        f157394a = bvqm;
        bxvk.m124024a(bvqm.class, bvqm);
    }

    private bvqm() {
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
            return bxvk.m124022a(f157394a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqm();
        }
        if (i2 == 4) {
            return new bxvd(f157394a);
        }
        if (i2 == 5) {
            return f157394a;
        }
        bxxk bxxk = f157395b;
        if (bxxk == null) {
            synchronized (bvqm.class) {
                bxxk = f157395b;
                if (bxxk == null) {
                    bxxk = new bxve(f157394a);
                    f157395b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
