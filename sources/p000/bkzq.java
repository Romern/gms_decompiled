package p000;

/* renamed from: bkzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkzq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bkzq f125670d;

    /* renamed from: k */
    private static volatile bxxk f125671k;

    /* renamed from: a */
    public int f125672a;

    /* renamed from: b */
    public bkzr f125673b;

    /* renamed from: c */
    public bkzo f125674c;

    /* renamed from: e */
    private int f125675e;

    /* renamed from: f */
    private bkym f125676f;

    /* renamed from: g */
    private blag f125677g;

    /* renamed from: h */
    private blai f125678h;

    /* renamed from: i */
    private blat f125679i;

    /* renamed from: j */
    private byte f125680j = 2;

    static {
        bkzq bkzq = new bkzq();
        f125670d = bkzq;
        bxvk.m124024a(bkzq.class, bkzq);
    }

    private bkzq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125680j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125680j = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f125670d, "\u0001\u0006\u0000\u0002\u00013\u0006\u0000\u0000\u0003\u0001ဉ\u0000\u0003ဉ\u0002\nဉ\t%ᐉ$0ᐉ/3ᐉ2", new Object[]{"a", "e", "f", "b", "c", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bkzq();
        } else {
            if (i2 == 4) {
                return new bxvd(f125670d);
            }
            if (i2 == 5) {
                return f125670d;
            }
            bxxk bxxk = f125671k;
            if (bxxk == null) {
                synchronized (bkzq.class) {
                    bxxk = f125671k;
                    if (bxxk == null) {
                        bxxk = new bxve(f125670d);
                        f125671k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
