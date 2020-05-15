package p000;

/* renamed from: bpys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpys extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bpys f139925f;

    /* renamed from: g */
    private static volatile bxxk f139926g;

    /* renamed from: a */
    public int f139927a;

    /* renamed from: b */
    public bxvt f139928b = bxvm.f164965b;

    /* renamed from: c */
    public int f139929c;

    /* renamed from: d */
    public int f139930d;

    /* renamed from: e */
    public long f139931e;

    static {
        bpys bpys = new bpys();
        f139925f = bpys;
        bxvk.m124024a(bpys.class, bpys);
    }

    private bpys() {
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
            return bxvk.m124022a(f139925f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002", new Object[]{"a", "b", bqba.m112496b(), "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpys();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f139925f;
            }
            bxxk bxxk = f139926g;
            if (bxxk == null) {
                synchronized (bpys.class) {
                    bxxk = f139926g;
                    if (bxxk == null) {
                        bxxk = new bxve(f139925f);
                        f139926g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
