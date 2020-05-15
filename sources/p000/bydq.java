package p000;

/* renamed from: bydq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydq extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bydq f165829a;

    /* renamed from: e */
    private static volatile bxxk f165830e;

    /* renamed from: b */
    private int f165831b;

    /* renamed from: c */
    private bydm f165832c;

    /* renamed from: d */
    private byte f165833d = 2;

    static {
        bydq bydq = new bydq();
        f165829a = bydq;
        bxvk.m124024a(bydq.class, bydq);
    }

    private bydq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f165833d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f165833d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f165829a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new bydq();
        } else {
            if (i2 == 4) {
                return new bxvd(f165829a);
            }
            if (i2 == 5) {
                return f165829a;
            }
            bxxk bxxk = f165830e;
            if (bxxk == null) {
                synchronized (bydq.class) {
                    bxxk = f165830e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165829a);
                        f165830e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
