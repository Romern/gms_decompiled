package p000;

/* renamed from: bptp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bptp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bptp f139155c;

    /* renamed from: d */
    private static volatile bxxk f139156d;

    /* renamed from: a */
    public int f139157a;

    /* renamed from: b */
    public bpsv f139158b;

    static {
        bptp bptp = new bptp();
        f139155c = bptp;
        bxvk.m124024a(bptp.class, bptp);
    }

    private bptp() {
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
            return bxvk.m124022a(f139155c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bptp();
        } else {
            if (i2 == 4) {
                return new bxvd(f139155c);
            }
            if (i2 == 5) {
                return f139155c;
            }
            bxxk bxxk = f139156d;
            if (bxxk == null) {
                synchronized (bptp.class) {
                    bxxk = f139156d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139155c);
                        f139156d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
