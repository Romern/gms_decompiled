package p000;

/* renamed from: bvom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvom extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvom f157052d;

    /* renamed from: e */
    private static volatile bxxk f157053e;

    /* renamed from: a */
    public int f157054a;

    /* renamed from: b */
    public bvol f157055b;

    /* renamed from: c */
    public bxwc f157056c = bxxn.f165040b;

    static {
        bvom bvom = new bvom();
        f157052d = bvom;
        GeneratedMessageLite.m124024a(bvom.class, bvom);
    }

    private bvom() {
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
            return GeneratedMessageLite.m124022a(f157052d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", bvon.class});
        } else if (i2 == 3) {
            return new bvom();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f157052d;
            }
            bxxk bxxk = f157053e;
            if (bxxk == null) {
                synchronized (bvom.class) {
                    bxxk = f157053e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157052d);
                        f157053e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
