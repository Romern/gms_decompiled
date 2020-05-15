package p000;

/* renamed from: bpjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpjc extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpjc f137833e;

    /* renamed from: f */
    private static volatile bxxk f137834f;

    /* renamed from: a */
    public int f137835a;

    /* renamed from: b */
    public int f137836b;

    /* renamed from: c */
    public long f137837c = -1;

    /* renamed from: d */
    public int f137838d;

    static {
        bpjc bpjc = new bpjc();
        f137833e = bpjc;
        bxvk.m124024a(bpjc.class, bpjc);
    }

    private bpjc() {
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
            return bxvk.m124022a(f137833e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"a", "b", bpja.f137832a, "c", "d"});
        } else if (i2 == 3) {
            return new bpjc();
        } else {
            if (i2 == 4) {
                return new bxvd(f137833e);
            }
            if (i2 == 5) {
                return f137833e;
            }
            bxxk bxxk = f137834f;
            if (bxxk == null) {
                synchronized (bpjc.class) {
                    bxxk = f137834f;
                    if (bxxk == null) {
                        bxxk = new bxve(f137833e);
                        f137834f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
