package p000;

/* renamed from: bvtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvtr extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bvtr f157603g;

    /* renamed from: h */
    private static volatile bxxk f157604h;

    /* renamed from: a */
    public int f157605a;

    /* renamed from: b */
    public long f157606b;

    /* renamed from: c */
    public int f157607c;

    /* renamed from: d */
    public int f157608d;

    /* renamed from: e */
    public boolean f157609e;

    /* renamed from: f */
    public int f157610f;

    static {
        bvtr bvtr = new bvtr();
        f157603g = bvtr;
        GeneratedMessageLite.m124024a(bvtr.class, bvtr);
    }

    private bvtr() {
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
            return GeneratedMessageLite.m124022a(f157603g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001စ\u0000\u0002ဏ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", bvtq.f157602a, "e", "f"});
        } else if (i2 == 3) {
            return new bvtr();
        } else {
            if (i2 == 4) {
                return new bxvd(f157603g);
            }
            if (i2 == 5) {
                return f157603g;
            }
            bxxk bxxk = f157604h;
            if (bxxk == null) {
                synchronized (bvtr.class) {
                    bxxk = f157604h;
                    if (bxxk == null) {
                        bxxk = new bxve(f157603g);
                        f157604h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
