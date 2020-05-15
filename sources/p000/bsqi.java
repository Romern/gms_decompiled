package p000;

/* renamed from: bsqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsqi extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bsqi f146642h;

    /* renamed from: i */
    private static volatile bxxk f146643i;

    /* renamed from: a */
    public int f146644a;

    /* renamed from: b */
    public bssl f146645b;

    /* renamed from: c */
    public boolean f146646c;

    /* renamed from: d */
    public boolean f146647d;

    /* renamed from: e */
    public boolean f146648e;

    /* renamed from: f */
    public boolean f146649f;

    /* renamed from: g */
    public boolean f146650g;

    static {
        bsqi bsqi = new bsqi();
        f146642h = bsqi;
        GeneratedMessageLite.m124024a(bsqi.class, bsqi);
    }

    private bsqi() {
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
            return GeneratedMessageLite.m124022a(f146642h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bsqi();
        } else {
            if (i2 == 4) {
                return new bxvd(f146642h);
            }
            if (i2 == 5) {
                return f146642h;
            }
            bxxk bxxk = f146643i;
            if (bxxk == null) {
                synchronized (bsqi.class) {
                    bxxk = f146643i;
                    if (bxxk == null) {
                        bxxk = new bxve(f146642h);
                        f146643i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
