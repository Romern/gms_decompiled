package p000;

/* renamed from: bveq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bveq extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxvu f155770e = new bveo();

    /* renamed from: k */
    public static final bveq f155771k;

    /* renamed from: l */
    private static volatile bxxk f155772l;

    /* renamed from: a */
    public int f155773a;

    /* renamed from: b */
    public long f155774b;

    /* renamed from: c */
    public int f155775c;

    /* renamed from: d */
    public bxvt f155776d = bxvm.f164965b;

    /* renamed from: f */
    public bxwc f155777f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f155778g = bxxn.f165040b;

    /* renamed from: h */
    public bxwc f155779h = bxxn.f165040b;

    /* renamed from: i */
    public bxwc f155780i = bxxn.f165040b;

    /* renamed from: j */
    public bxwc f155781j = bxxn.f165040b;

    static {
        bveq bveq = new bveq();
        f155771k = bveq;
        GeneratedMessageLite.m124024a(bveq.class, bveq);
    }

    private bveq() {
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
            return GeneratedMessageLite.m124022a(f155771k, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003\u001e\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\t\u001b", new Object[]{"a", "b", "c", bvia.f156126a, "d", bvik.m121146b(), "f", bvel.class, "g", bvef.class, "h", bvei.class, "i", bvem.class, "j", bveg.class});
        } else if (i2 == 3) {
            return new bveq();
        } else {
            if (i2 == 4) {
                return new bvep();
            }
            if (i2 == 5) {
                return f155771k;
            }
            bxxk bxxk = f155772l;
            if (bxxk == null) {
                synchronized (bveq.class) {
                    bxxk = f155772l;
                    if (bxxk == null) {
                        bxxk = new bxve(f155771k);
                        f155772l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
