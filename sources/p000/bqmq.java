package p000;

/* renamed from: bqmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqmq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqmq f141249c;

    /* renamed from: d */
    private static volatile bxxk f141250d;

    /* renamed from: a */
    public String f141251a = "";

    /* renamed from: b */
    public int f141252b;

    static {
        bqmq bqmq = new bqmq();
        f141249c = bqmq;
        bxvk.m124024a(bqmq.class, bqmq);
    }

    private bqmq() {
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
            return bxvk.m124022a(f141249c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqmq();
        } else {
            if (i2 == 4) {
                return new bxvd(f141249c);
            }
            if (i2 == 5) {
                return f141249c;
            }
            bxxk bxxk = f141250d;
            if (bxxk == null) {
                synchronized (bqmq.class) {
                    bxxk = f141250d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141249c);
                        f141250d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
