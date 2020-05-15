package p000;

/* renamed from: bvuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvuq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvuq f157725d;

    /* renamed from: e */
    private static volatile bxxk f157726e;

    /* renamed from: a */
    public int f157727a;

    /* renamed from: b */
    public bvup f157728b;

    /* renamed from: c */
    public bvup f157729c;

    static {
        bvuq bvuq = new bvuq();
        f157725d = bvuq;
        GeneratedMessageLite.m124024a(bvuq.class, bvuq);
    }

    private bvuq() {
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
            return GeneratedMessageLite.m124022a(f157725d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvuq();
        } else {
            if (i2 == 4) {
                return new bxvd(f157725d);
            }
            if (i2 == 5) {
                return f157725d;
            }
            bxxk bxxk = f157726e;
            if (bxxk == null) {
                synchronized (bvuq.class) {
                    bxxk = f157726e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157725d);
                        f157726e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
