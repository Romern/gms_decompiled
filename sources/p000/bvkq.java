package p000;

/* renamed from: bvkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvkq extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvkq f156454e;

    /* renamed from: f */
    private static volatile bxxk f156455f;

    /* renamed from: a */
    public long f156456a;

    /* renamed from: b */
    public int f156457b;

    /* renamed from: c */
    public String f156458c = "";

    /* renamed from: d */
    public long f156459d;

    static {
        bvkq bvkq = new bvkq();
        f156454e = bvkq;
        bxvk.m124024a(bvkq.class, bvkq);
    }

    private bvkq() {
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
            return bxvk.m124022a(f156454e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u0002\u0002\f\u0003Ȉ\u0005\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bvkq();
        } else {
            if (i2 == 4) {
                return new bxvd(f156454e);
            }
            if (i2 == 5) {
                return f156454e;
            }
            bxxk bxxk = f156455f;
            if (bxxk == null) {
                synchronized (bvkq.class) {
                    bxxk = f156455f;
                    if (bxxk == null) {
                        bxxk = new bxve(f156454e);
                        f156455f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
