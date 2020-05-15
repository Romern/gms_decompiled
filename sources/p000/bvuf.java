package p000;

/* renamed from: bvuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvuf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvuf f157677d;

    /* renamed from: e */
    private static volatile bxxk f157678e;

    /* renamed from: a */
    public int f157679a;

    /* renamed from: b */
    public bzrv f157680b;

    /* renamed from: c */
    public bvtx f157681c;

    static {
        bvuf bvuf = new bvuf();
        f157677d = bvuf;
        bxvk.m124024a(bvuf.class, bvuf);
    }

    private bvuf() {
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
            return bxvk.m124022a(f157677d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvuf();
        } else {
            if (i2 == 4) {
                return new bxvd(f157677d);
            }
            if (i2 == 5) {
                return f157677d;
            }
            bxxk bxxk = f157678e;
            if (bxxk == null) {
                synchronized (bvuf.class) {
                    bxxk = f157678e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157677d);
                        f157678e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
