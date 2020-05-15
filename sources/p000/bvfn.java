package p000;

/* renamed from: bvfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfn extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvfn f155891d;

    /* renamed from: e */
    private static volatile bxxk f155892e;

    /* renamed from: a */
    public int f155893a;

    /* renamed from: b */
    public long f155894b;

    /* renamed from: c */
    public bvfe f155895c;

    static {
        bvfn bvfn = new bvfn();
        f155891d = bvfn;
        bxvk.m124024a(bvfn.class, bvfn);
    }

    private bvfn() {
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
            return bxvk.m124022a(f155891d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvfn();
        } else {
            if (i2 == 4) {
                return new bxvd(f155891d);
            }
            if (i2 == 5) {
                return f155891d;
            }
            bxxk bxxk = f155892e;
            if (bxxk == null) {
                synchronized (bvfn.class) {
                    bxxk = f155892e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155891d);
                        f155892e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
