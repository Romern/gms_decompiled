package p000;

/* renamed from: bvel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvel extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bvel f155746f;

    /* renamed from: g */
    private static volatile bxxk f155747g;

    /* renamed from: a */
    public int f155748a;

    /* renamed from: b */
    public long f155749b;

    /* renamed from: c */
    public bxvt f155750c = bxvm.f164965b;

    /* renamed from: d */
    public bxwc f155751d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f155752e = bxxn.f165040b;

    static {
        bvel bvel = new bvel();
        f155746f = bvel;
        GeneratedMessageLite.m124024a(bvel.class, bvel);
    }

    private bvel() {
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
            return GeneratedMessageLite.m124022a(f155746f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဂ\u0000\u0002\u001e\u0003\u001b\u0004\u001b", new Object[]{"a", "b", "c", bvif.m121137b(), "d", bvek.class, "e", bvej.class});
        } else if (i2 == 3) {
            return new bvel();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f155746f;
            }
            bxxk bxxk = f155747g;
            if (bxxk == null) {
                synchronized (bvel.class) {
                    bxxk = f155747g;
                    if (bxxk == null) {
                        bxxk = new bxve(f155746f);
                        f155747g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
