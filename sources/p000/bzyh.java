package p000;

/* renamed from: bzyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyh extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzyh f171870d;

    /* renamed from: e */
    private static volatile bxxk f171871e;

    /* renamed from: a */
    public long f171872a;

    /* renamed from: b */
    public bxwc f171873b = bxxn.f165040b;

    /* renamed from: c */
    public bzyr f171874c;

    static {
        bzyh bzyh = new bzyh();
        f171870d = bzyh;
        bxvk.m124024a(bzyh.class, bzyh);
    }

    private bzyh() {
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
            return bxvk.m124022a(f171870d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0002\u001b\u0003\t", new Object[]{"a", "b", bzyq.class, "c"});
        } else if (i2 == 3) {
            return new bzyh();
        } else {
            if (i2 == 4) {
                return new bxvd(f171870d);
            }
            if (i2 == 5) {
                return f171870d;
            }
            bxxk bxxk = f171871e;
            if (bxxk == null) {
                synchronized (bzyh.class) {
                    bxxk = f171871e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171870d);
                        f171871e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
