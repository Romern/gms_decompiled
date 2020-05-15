package p000;

/* renamed from: bvpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpa extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvpa f157252c;

    /* renamed from: e */
    private static volatile bxxk f157253e;

    /* renamed from: a */
    public bvow f157254a;

    /* renamed from: b */
    public bxwc f157255b = bxxn.f165040b;

    /* renamed from: d */
    private int f157256d;

    static {
        bvpa bvpa = new bvpa();
        f157252c = bvpa;
        bxvk.m124024a(bvpa.class, bvpa);
    }

    private bvpa() {
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
            return bxvk.m124022a(f157252c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bvmv.class});
        } else if (i2 == 3) {
            return new bvpa();
        } else {
            if (i2 == 4) {
                return new bxvd(f157252c);
            }
            if (i2 == 5) {
                return f157252c;
            }
            bxxk bxxk = f157253e;
            if (bxxk == null) {
                synchronized (bvpa.class) {
                    bxxk = f157253e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157252c);
                        f157253e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
