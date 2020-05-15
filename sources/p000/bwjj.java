package p000;

/* renamed from: bwjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjj extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bwjj f159787g;

    /* renamed from: i */
    private static volatile bxxk f159788i;

    /* renamed from: a */
    public int f159789a;

    /* renamed from: b */
    public bmav f159790b;

    /* renamed from: c */
    public bmaq f159791c;

    /* renamed from: d */
    public bmar f159792d;

    /* renamed from: e */
    public bwjg f159793e;

    /* renamed from: f */
    public int f159794f;

    /* renamed from: h */
    private byte f159795h = 2;

    static {
        bwjj bwjj = new bwjj();
        f159787g = bwjj;
        GeneratedMessageLite.m124024a(bwjj.class, bwjj);
    }

    private bwjj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159795h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159795h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f159787g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0003\u0004ဌ\u0004\u0005ဉ\u0002", new Object[]{"a", "b", "c", "e", "f", bwgz.m121953b(), "d"});
        } else if (i2 == 3) {
            return new bwjj();
        } else {
            if (i2 == 4) {
                return new bxvd(f159787g);
            }
            if (i2 == 5) {
                return f159787g;
            }
            bxxk bxxk = f159788i;
            if (bxxk == null) {
                synchronized (bwjj.class) {
                    bxxk = f159788i;
                    if (bxxk == null) {
                        bxxk = new bxve(f159787g);
                        f159788i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
