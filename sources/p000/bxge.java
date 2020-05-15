package p000;

/* renamed from: bxge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxge extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxge f163238b;

    /* renamed from: c */
    private static volatile bxxk f163239c;

    /* renamed from: a */
    public bxvt f163240a = bxvm.f164965b;

    static {
        bxge bxge = new bxge();
        f163238b = bxge;
        bxvk.m124024a(bxge.class, bxge);
    }

    private bxge() {
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
            return bxvk.m124022a(f163238b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", bxco.m122578b()});
        } else if (i2 == 3) {
            return new bxge();
        } else {
            if (i2 == 4) {
                return new bxgd();
            }
            if (i2 == 5) {
                return f163238b;
            }
            bxxk bxxk = f163239c;
            if (bxxk == null) {
                synchronized (bxge.class) {
                    bxxk = f163239c;
                    if (bxxk == null) {
                        bxxk = new bxve(f163238b);
                        f163239c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
