package p000;

/* renamed from: bvur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvur extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvur f157730d;

    /* renamed from: e */
    private static volatile bxxk f157731e;

    /* renamed from: a */
    public int f157732a;

    /* renamed from: b */
    public bvuq f157733b;

    /* renamed from: c */
    public bxwc f157734c = bxxn.f165040b;

    static {
        bvur bvur = new bvur();
        f157730d = bvur;
        bxvk.m124024a(bvur.class, bvur);
    }

    private bvur() {
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
            return bxvk.m124022a(f157730d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", bvus.class});
        } else if (i2 == 3) {
            return new bvur();
        } else {
            if (i2 == 4) {
                return new bxvd(f157730d);
            }
            if (i2 == 5) {
                return f157730d;
            }
            bxxk bxxk = f157731e;
            if (bxxk == null) {
                synchronized (bvur.class) {
                    bxxk = f157731e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157730d);
                        f157731e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
