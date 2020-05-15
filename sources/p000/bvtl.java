package p000;

/* renamed from: bvtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvtl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvtl f157577d;

    /* renamed from: e */
    private static volatile bxxk f157578e;

    /* renamed from: a */
    public int f157579a;

    /* renamed from: b */
    public bvtx f157580b;

    /* renamed from: c */
    public int f157581c;

    static {
        bvtl bvtl = new bvtl();
        f157577d = bvtl;
        GeneratedMessageLite.m124024a(bvtl.class, bvtl);
    }

    private bvtl() {
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
            return GeneratedMessageLite.m124022a(f157577d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvtl();
        } else {
            if (i2 == 4) {
                return new bxvd(f157577d);
            }
            if (i2 == 5) {
                return f157577d;
            }
            bxxk bxxk = f157578e;
            if (bxxk == null) {
                synchronized (bvtl.class) {
                    bxxk = f157578e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157577d);
                        f157578e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
