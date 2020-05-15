package p000;

/* renamed from: brtv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brtv extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final brtv f143345g;

    /* renamed from: h */
    private static volatile bxxk f143346h;

    /* renamed from: a */
    public int f143347a;

    /* renamed from: b */
    public brtq f143348b;

    /* renamed from: c */
    public long f143349c;

    /* renamed from: d */
    public int f143350d;

    /* renamed from: e */
    public int f143351e;

    /* renamed from: f */
    public int f143352f;

    static {
        brtv brtv = new brtv();
        f143345g = brtv;
        GeneratedMessageLite.m124024a(brtv.class, brtv);
    }

    private brtv() {
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
            return GeneratedMessageLite.m124022a(f143345g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", brtu.f143344a, "e", "f"});
        } else if (i2 == 3) {
            return new brtv();
        } else {
            if (i2 == 4) {
                return new bxvd(f143345g);
            }
            if (i2 == 5) {
                return f143345g;
            }
            bxxk bxxk = f143346h;
            if (bxxk == null) {
                synchronized (brtv.class) {
                    bxxk = f143346h;
                    if (bxxk == null) {
                        bxxk = new bxve(f143345g);
                        f143346h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
