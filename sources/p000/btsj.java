package p000;

/* renamed from: btsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsj extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btsj f150218c;

    /* renamed from: d */
    private static volatile bxxk f150219d;

    /* renamed from: a */
    public btsk f150220a;

    /* renamed from: b */
    public bxwc f150221b = bxxn.f165040b;

    static {
        btsj btsj = new btsj();
        f150218c = btsj;
        bxvk.m124024a(btsj.class, btsj);
    }

    private btsj() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f150218c, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0001\u0000\u0003\t\u0004Ț", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btsj();
        } else {
            if (i2 == 4) {
                return new bxvd(f150218c);
            }
            if (i2 == 5) {
                return f150218c;
            }
            bxxk bxxk = f150219d;
            if (bxxk == null) {
                synchronized (btsj.class) {
                    bxxk = f150219d;
                    if (bxxk == null) {
                        bxxk = new bxve(f150218c);
                        f150219d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
