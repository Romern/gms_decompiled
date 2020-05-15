package p000;

/* renamed from: mpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mpa extends bxvk implements bxxd {

    /* renamed from: b */
    public static final mpa f34096b;

    /* renamed from: c */
    private static volatile bxxk f34097c;

    /* renamed from: a */
    public bxwc f34098a = bxxn.f165040b;

    static {
        mpa mpa = new mpa();
        f34096b = mpa;
        bxvk.m124024a(mpa.class, mpa);
    }

    private mpa() {
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
            return bxvk.m124022a(f34096b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", moz.class});
        } else if (i2 == 3) {
            return new mpa();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f34096b;
            }
            bxxk bxxk = f34097c;
            if (bxxk == null) {
                synchronized (mpa.class) {
                    bxxk = f34097c;
                    if (bxxk == null) {
                        bxxk = new bxve(f34096b);
                        f34097c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
