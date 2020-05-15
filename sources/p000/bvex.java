package p000;

/* renamed from: bvex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvex extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvex f155809c;

    /* renamed from: d */
    private static volatile bxxk f155810d;

    /* renamed from: a */
    public int f155811a;

    /* renamed from: b */
    public int f155812b;

    static {
        bvex bvex = new bvex();
        f155809c = bvex;
        bxvk.m124024a(bvex.class, bvex);
    }

    private bvex() {
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
            return bxvk.m124022a(f155809c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvex();
        } else {
            if (i2 == 4) {
                return new bxvd(f155809c);
            }
            if (i2 == 5) {
                return f155809c;
            }
            bxxk bxxk = f155810d;
            if (bxxk == null) {
                synchronized (bvex.class) {
                    bxxk = f155810d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155809c);
                        f155810d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
