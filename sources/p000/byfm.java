package p000;

/* renamed from: byfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byfm extends bxvk implements bxxd {

    /* renamed from: f */
    public static final byfm f166043f;

    /* renamed from: g */
    private static volatile bxxk f166044g;

    /* renamed from: a */
    public int f166045a;

    /* renamed from: b */
    public int f166046b = 0;

    /* renamed from: c */
    public Object f166047c;

    /* renamed from: d */
    public boolean f166048d;

    /* renamed from: e */
    public long f166049e;

    static {
        byfm byfm = new byfm();
        f166043f = byfm;
        bxvk.m124024a(byfm.class, byfm);
    }

    private byfm() {
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
            return bxvk.m124022a(f166043f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"c", "b", "a", byfl.class, byfk.class, "d", "e"});
        } else if (i2 == 3) {
            return new byfm();
        } else {
            if (i2 == 4) {
                return new bxvd(f166043f);
            }
            if (i2 == 5) {
                return f166043f;
            }
            bxxk bxxk = f166044g;
            if (bxxk == null) {
                synchronized (byfm.class) {
                    bxxk = f166044g;
                    if (bxxk == null) {
                        bxxk = new bxve(f166043f);
                        f166044g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
