package p000;

/* renamed from: bwpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwpa extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwpa f160515b;

    /* renamed from: e */
    private static volatile bxxk f160516e;

    /* renamed from: a */
    public bwze f160517a;

    /* renamed from: c */
    private int f160518c;

    /* renamed from: d */
    private byte f160519d = 2;

    static {
        bwpa bwpa = new bwpa();
        f160515b = bwpa;
        bxvk.m124024a(bwpa.class, bwpa);
    }

    private bwpa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160519d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160519d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160515b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bwpa();
        } else {
            if (i2 == 4) {
                return new bxvd(f160515b);
            }
            if (i2 == 5) {
                return f160515b;
            }
            bxxk bxxk = f160516e;
            if (bxxk == null) {
                synchronized (bwpa.class) {
                    bxxk = f160516e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160515b);
                        f160516e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
