package p000;

/* renamed from: bzmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzmq extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bzmq f170630f;

    /* renamed from: g */
    private static volatile bxxk f170631g;

    /* renamed from: a */
    public int f170632a;

    /* renamed from: b */
    public String f170633b = "";

    /* renamed from: c */
    public String f170634c = "";

    /* renamed from: d */
    public int f170635d;

    /* renamed from: e */
    public int f170636e;

    static {
        bzmq bzmq = new bzmq();
        f170630f = bzmq;
        bxvk.m124024a(bzmq.class, bzmq);
    }

    private bzmq() {
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
            return bxvk.m124022a(f170630f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", bzmp.f170629a, "e", bzmn.f170628a});
        } else if (i2 == 3) {
            return new bzmq();
        } else {
            if (i2 == 4) {
                return new bxvd(f170630f);
            }
            if (i2 == 5) {
                return f170630f;
            }
            bxxk bxxk = f170631g;
            if (bxxk == null) {
                synchronized (bzmq.class) {
                    bxxk = f170631g;
                    if (bxxk == null) {
                        bxxk = new bxve(f170630f);
                        f170631g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
