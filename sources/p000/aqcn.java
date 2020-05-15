package p000;

/* renamed from: aqcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqcn extends bxvk implements bxxd {

    /* renamed from: g */
    public static final aqcn f85673g;

    /* renamed from: i */
    private static volatile bxxk f85674i;

    /* renamed from: a */
    public int f85675a;

    /* renamed from: b */
    public int f85676b;

    /* renamed from: c */
    public bxwc f85677c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f85678d = bxxn.f165040b;

    /* renamed from: e */
    public bxtx f85679e = bxtx.f164797b;

    /* renamed from: f */
    public aqcc f85680f;

    /* renamed from: h */
    private int f85681h;

    static {
        aqcn aqcn = new aqcn();
        f85673g = aqcn;
        bxvk.m124024a(aqcn.class, aqcn);
    }

    private aqcn() {
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
            return bxvk.m124022a(f85673g, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0002\u0000\u0001င\u0000\u0004ဌ\u0003\u0005\u001b\u0006\u001b\u0007ည\u0004\bဉ\u0005", new Object[]{"h", "a", "b", aqcl.f85672a, "c", aqcy.class, "d", aqcy.class, "e", "f"});
        } else if (i2 == 3) {
            return new aqcn();
        } else {
            if (i2 == 4) {
                return new bxvd(f85673g);
            }
            if (i2 == 5) {
                return f85673g;
            }
            bxxk bxxk = f85674i;
            if (bxxk == null) {
                synchronized (aqcn.class) {
                    bxxk = f85674i;
                    if (bxxk == null) {
                        bxxk = new bxve(f85673g);
                        f85674i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
