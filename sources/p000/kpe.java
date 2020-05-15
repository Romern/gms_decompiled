package p000;

/* renamed from: kpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kpe extends bxvk implements bxxd {

    /* renamed from: i */
    public static final kpe f24727i;

    /* renamed from: j */
    private static volatile bxxk f24728j;

    /* renamed from: a */
    public int f24729a;

    /* renamed from: b */
    public bxwc f24730b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f24731c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f24732d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f24733e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f24734f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f24735g = bxxn.f165040b;

    /* renamed from: h */
    public bxwc f24736h = bxxn.f165040b;

    static {
        kpe kpe = new kpe();
        f24727i = kpe;
        bxvk.m124024a(kpe.class, kpe);
    }

    private kpe() {
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
            return bxvk.m124022a(f24727i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0007\u0000\u0001\f\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b", new Object[]{"a", "b", koy.class, "c", koz.class, "d", kpa.class, "e", kpf.class, "f", kpg.class, "g", kox.class, "h", kpc.class});
        } else if (i2 == 3) {
            return new kpe();
        } else {
            if (i2 == 4) {
                return new bxvd(f24727i);
            }
            if (i2 == 5) {
                return f24727i;
            }
            bxxk bxxk = f24728j;
            if (bxxk == null) {
                synchronized (kpe.class) {
                    bxxk = f24728j;
                    if (bxxk == null) {
                        bxxk = new bxve(f24727i);
                        f24728j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
