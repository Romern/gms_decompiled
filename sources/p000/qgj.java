package p000;

/* renamed from: qgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qgj extends bxvk implements bxxd {

    /* renamed from: k */
    public static final qgj f41167k;

    /* renamed from: l */
    private static volatile bxxk f41168l;

    /* renamed from: a */
    public int f41169a;

    /* renamed from: b */
    public int f41170b;

    /* renamed from: c */
    public long f41171c;

    /* renamed from: d */
    public long f41172d;

    /* renamed from: e */
    public int f41173e;

    /* renamed from: f */
    public int f41174f;

    /* renamed from: g */
    public qgq f41175g;

    /* renamed from: h */
    public bxwc f41176h = bxxn.f165040b;

    /* renamed from: i */
    public qgp f41177i;

    /* renamed from: j */
    public boolean f41178j;

    static {
        qgj qgj = new qgj();
        f41167k = qgj;
        bxvk.m124024a(qgj.class, qgj);
    }

    private qgj() {
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
            return bxvk.m124022a(f41167k, "\u0001\t\u0000\u0001\u0002\n\t\u0000\u0001\u0000\u0002ဌ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဌ\u0003\u0006ဌ\u0004\u0007ဉ\u0005\b\u001b\tဉ\u0006\nဇ\u0007", new Object[]{"a", "b", qgi.f41166a, "c", "d", "e", qgh.f41165a, "f", qgg.f41164a, "g", "h", qge.class, "i", "j"});
        } else if (i2 == 3) {
            return new qgj();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f41167k;
            }
            bxxk bxxk = f41168l;
            if (bxxk == null) {
                synchronized (qgj.class) {
                    bxxk = f41168l;
                    if (bxxk == null) {
                        bxxk = new bxve(f41167k);
                        f41168l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
