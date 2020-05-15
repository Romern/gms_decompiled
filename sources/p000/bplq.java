package p000;

/* renamed from: bplq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bplq extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bplq f138128i;

    /* renamed from: j */
    private static volatile bxxk f138129j;

    /* renamed from: a */
    public int f138130a;

    /* renamed from: b */
    public int f138131b;

    /* renamed from: c */
    public int f138132c;

    /* renamed from: d */
    public long f138133d;

    /* renamed from: e */
    public int f138134e;

    /* renamed from: f */
    public boolean f138135f;

    /* renamed from: g */
    public long f138136g;

    /* renamed from: h */
    public bxwc f138137h = bxxn.f165040b;

    static {
        bplq bplq = new bplq();
        f138128i = bplq;
        bxvk.m124024a(bplq.class, bplq);
    }

    private bplq() {
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
            return bxvk.m124022a(f138128i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဂ\u0005\b\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", bpkf.class});
        } else if (i2 == 3) {
            return new bplq();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f138128i;
            }
            bxxk bxxk = f138129j;
            if (bxxk == null) {
                synchronized (bplq.class) {
                    bxxk = f138129j;
                    if (bxxk == null) {
                        bxxk = new bxve(f138128i);
                        f138129j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
