package p000;

/* renamed from: bppb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bppb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bppb f138595d;

    /* renamed from: e */
    private static volatile bxxk f138596e;

    /* renamed from: a */
    public int f138597a;

    /* renamed from: b */
    public bxvt f138598b = bxvm.f164965b;

    /* renamed from: c */
    public int f138599c;

    static {
        bppb bppb = new bppb();
        f138595d = bppb;
        bxvk.m124024a(bppb.class, bppb);
    }

    private bppb() {
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
            return bxvk.m124022a(f138595d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001e\u0002င\u0000", new Object[]{"a", "b", bpoz.m112139b(), "c"});
        } else if (i2 == 3) {
            return new bppb();
        } else {
            if (i2 == 4) {
                return new bppa();
            }
            if (i2 == 5) {
                return f138595d;
            }
            bxxk bxxk = f138596e;
            if (bxxk == null) {
                synchronized (bppb.class) {
                    bxxk = f138596e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138595d);
                        f138596e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
