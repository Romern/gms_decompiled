package p000;

/* renamed from: bqrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqrk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bqrk f141443d;

    /* renamed from: e */
    private static volatile bxxk f141444e;

    /* renamed from: a */
    public int f141445a;

    /* renamed from: b */
    public bqrl f141446b;

    /* renamed from: c */
    public bxtx f141447c = bxtx.f164797b;

    static {
        bqrk bqrk = new bqrk();
        f141443d = bqrk;
        bxvk.m124024a(bqrk.class, bqrk);
    }

    private bqrk() {
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
            return bxvk.m124022a(f141443d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqrk();
        } else {
            if (i2 == 4) {
                return new bxvd(f141443d);
            }
            if (i2 == 5) {
                return f141443d;
            }
            bxxk bxxk = f141444e;
            if (bxxk == null) {
                synchronized (bqrk.class) {
                    bxxk = f141444e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141443d);
                        f141444e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
