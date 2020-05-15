package p000;

/* renamed from: bycl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bycl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bycl f165662d;

    /* renamed from: e */
    private static volatile bxxk f165663e;

    /* renamed from: a */
    public int f165664a;

    /* renamed from: b */
    public bycm f165665b;

    /* renamed from: c */
    public bycm f165666c;

    static {
        bycl bycl = new bycl();
        f165662d = bycl;
        GeneratedMessageLite.m124024a(bycl.class, bycl);
    }

    private bycl() {
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
            return GeneratedMessageLite.m124022a(f165662d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bycl();
        } else {
            if (i2 == 4) {
                return new bxvd(f165662d);
            }
            if (i2 == 5) {
                return f165662d;
            }
            bxxk bxxk = f165663e;
            if (bxxk == null) {
                synchronized (bycl.class) {
                    bxxk = f165663e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165662d);
                        f165663e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
