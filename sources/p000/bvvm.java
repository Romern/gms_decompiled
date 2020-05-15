package p000;

/* renamed from: bvvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvvm extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvvm f157814d;

    /* renamed from: e */
    private static volatile bxxk f157815e;

    /* renamed from: a */
    public int f157816a;

    /* renamed from: b */
    public int f157817b;

    /* renamed from: c */
    public int f157818c;

    static {
        bvvm bvvm = new bvvm();
        f157814d = bvvm;
        GeneratedMessageLite.m124024a(bvvm.class, bvvm);
    }

    private bvvm() {
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
            return GeneratedMessageLite.m124022a(f157814d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", bvvc.f157788a, "c"});
        } else if (i2 == 3) {
            return new bvvm();
        } else {
            if (i2 == 4) {
                return new bxvd(f157814d);
            }
            if (i2 == 5) {
                return f157814d;
            }
            bxxk bxxk = f157815e;
            if (bxxk == null) {
                synchronized (bvvm.class) {
                    bxxk = f157815e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157814d);
                        f157815e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
