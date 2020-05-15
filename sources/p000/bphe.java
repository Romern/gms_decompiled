package p000;

/* renamed from: bphe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bphe extends bxvk implements bxxd {

    /* renamed from: n */
    public static final bphe f137630n;

    /* renamed from: o */
    private static volatile bxxk f137631o;

    /* renamed from: a */
    public int f137632a;

    /* renamed from: b */
    public int f137633b;

    /* renamed from: c */
    public int f137634c = -1;

    /* renamed from: d */
    public bxwc f137635d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f137636e = bxxn.f165040b;

    /* renamed from: f */
    public bphq f137637f;

    /* renamed from: g */
    public int f137638g;

    /* renamed from: h */
    public int f137639h;

    /* renamed from: i */
    public boolean f137640i;

    /* renamed from: j */
    public int f137641j;

    /* renamed from: k */
    public bxwc f137642k = bxxn.f165040b;

    /* renamed from: l */
    public bxwc f137643l = bxxn.f165040b;

    /* renamed from: m */
    public bxwc f137644m = bxxn.f165040b;

    static {
        bphe bphe = new bphe();
        f137630n = bphe;
        bxvk.m124024a(bphe.class, bphe);
    }

    private bphe() {
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
            return bxvk.m124022a(f137630n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0005\u0000\u0001ဌ\u0000\u0002င\u0001\u0003\u001b\u0004\u001b\u0005ဉ\u0002\u0006ဌ\u0003\u0007ဌ\u0004\bဇ\u0005\tဌ\u0006\n\u001b\f\u001b\r\u001b", new Object[]{"a", "b", bphy.f137713a, "c", "d", bphh.class, "e", bpjz.class, "f", "g", bpis.m111966b(), "h", bphc.f137629a, "i", "j", bphw.f137712a, "k", bpiz.class, "l", bpjc.class, "m", bpio.class});
        } else if (i2 == 3) {
            return new bphe();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f137630n;
            }
            bxxk bxxk = f137631o;
            if (bxxk == null) {
                synchronized (bphe.class) {
                    bxxk = f137631o;
                    if (bxxk == null) {
                        bxxk = new bxve(f137630n);
                        f137631o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
