package p000;

/* renamed from: bpxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxq extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpxq f139756e;

    /* renamed from: f */
    private static volatile bxxk f139757f;

    /* renamed from: a */
    public int f139758a;

    /* renamed from: b */
    public int f139759b;

    /* renamed from: c */
    public long f139760c;

    /* renamed from: d */
    public long f139761d;

    static {
        bpxq bpxq = new bpxq();
        f139756e = bpxq;
        bxvk.m124024a(bpxq.class, bpxq);
    }

    private bpxq() {
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
            return bxvk.m124022a(f139756e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", bqae.f140121a, "c", "d"});
        } else if (i2 == 3) {
            return new bpxq();
        } else {
            if (i2 == 4) {
                return new bxvd(f139756e);
            }
            if (i2 == 5) {
                return f139756e;
            }
            bxxk bxxk = f139757f;
            if (bxxk == null) {
                synchronized (bpxq.class) {
                    bxxk = f139757f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139756e);
                        f139757f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
