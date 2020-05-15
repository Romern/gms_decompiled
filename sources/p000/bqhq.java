package p000;

/* renamed from: bqhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqhq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqhq f140701c;

    /* renamed from: d */
    private static volatile bxxk f140702d;

    /* renamed from: a */
    public int f140703a;

    /* renamed from: b */
    public int f140704b;

    static {
        bqhq bqhq = new bqhq();
        f140701c = bqhq;
        bxvk.m124024a(bqhq.class, bqhq);
    }

    private bqhq() {
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
            return bxvk.m124022a(f140701c, "\u0000\u0002\u0000\u0000\u0005\u0006\u0002\u0000\u0000\u0000\u0005\f\u0006\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqhq();
        } else {
            if (i2 == 4) {
                return new bxvd(f140701c);
            }
            if (i2 == 5) {
                return f140701c;
            }
            bxxk bxxk = f140702d;
            if (bxxk == null) {
                synchronized (bqhq.class) {
                    bxxk = f140702d;
                    if (bxxk == null) {
                        bxxk = new bxve(f140701c);
                        f140702d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
