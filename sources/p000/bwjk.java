package p000;

/* renamed from: bwjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjk extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bwjk f159796e;

    /* renamed from: f */
    private static volatile bxxk f159797f;

    /* renamed from: a */
    public int f159798a;

    /* renamed from: b */
    public bmaj f159799b;

    /* renamed from: c */
    public bxtx f159800c = bxtx.f164797b;

    /* renamed from: d */
    public bwhf f159801d;

    static {
        bwjk bwjk = new bwjk();
        f159796e = bwjk;
        bxvk.m124024a(bwjk.class, bwjk);
    }

    private bwjk() {
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
            return bxvk.m124022a(f159796e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bwjk();
        } else {
            if (i2 == 4) {
                return new bxvd(f159796e);
            }
            if (i2 == 5) {
                return f159796e;
            }
            bxxk bxxk = f159797f;
            if (bxxk == null) {
                synchronized (bwjk.class) {
                    bxxk = f159797f;
                    if (bxxk == null) {
                        bxxk = new bxve(f159796e);
                        f159797f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
