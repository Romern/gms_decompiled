package p000;

/* renamed from: bwlb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwlb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwlb f160081d;

    /* renamed from: e */
    private static volatile bxxk f160082e;

    /* renamed from: a */
    public int f160083a;

    /* renamed from: b */
    public bwei f160084b;

    /* renamed from: c */
    public String f160085c = "";

    static {
        bwlb bwlb = new bwlb();
        f160081d = bwlb;
        bxvk.m124024a(bwlb.class, bwlb);
    }

    private bwlb() {
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
            return bxvk.m124022a(f160081d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwlb();
        } else {
            if (i2 == 4) {
                return new bxvd(f160081d);
            }
            if (i2 == 5) {
                return f160081d;
            }
            bxxk bxxk = f160082e;
            if (bxxk == null) {
                synchronized (bwlb.class) {
                    bxxk = f160082e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160081d);
                        f160082e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
