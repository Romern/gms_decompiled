package p000;

/* renamed from: bpnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpnj extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpnj f138406e;

    /* renamed from: f */
    private static volatile bxxk f138407f;

    /* renamed from: a */
    public int f138408a;

    /* renamed from: b */
    public int f138409b;

    /* renamed from: c */
    public int f138410c;

    /* renamed from: d */
    public int f138411d;

    static {
        bpnj bpnj = new bpnj();
        f138406e = bpnj;
        GeneratedMessageLite.m124024a(bpnj.class, bpnj);
    }

    private bpnj() {
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
            return GeneratedMessageLite.m124022a(f138406e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", bpng.f138403a, "c", bpni.f138405a, "d", bpnh.f138404a});
        } else if (i2 == 3) {
            return new bpnj();
        } else {
            if (i2 == 4) {
                return new bxvd(f138406e);
            }
            if (i2 == 5) {
                return f138406e;
            }
            bxxk bxxk = f138407f;
            if (bxxk == null) {
                synchronized (bpnj.class) {
                    bxxk = f138407f;
                    if (bxxk == null) {
                        bxxk = new bxve(f138406e);
                        f138407f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
