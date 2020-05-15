package p000;

/* renamed from: bwjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjf extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bwjf f159753g;

    /* renamed from: i */
    private static volatile bxxk f159754i;

    /* renamed from: a */
    public int f159755a;

    /* renamed from: b */
    public bmav f159756b;

    /* renamed from: c */
    public bmaq f159757c;

    /* renamed from: d */
    public bmar f159758d;

    /* renamed from: e */
    public bwjg f159759e;

    /* renamed from: f */
    public int f159760f;

    /* renamed from: h */
    private byte f159761h = 2;

    static {
        bwjf bwjf = new bwjf();
        f159753g = bwjf;
        GeneratedMessageLite.m124024a(bwjf.class, bwjf);
    }

    private bwjf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159761h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159761h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f159753g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", "c", "d", "e", "f", bwgz.m121953b()});
        } else if (i2 == 3) {
            return new bwjf();
        } else {
            if (i2 == 4) {
                return new bxvd(f159753g);
            }
            if (i2 == 5) {
                return f159753g;
            }
            bxxk bxxk = f159754i;
            if (bxxk == null) {
                synchronized (bwjf.class) {
                    bxxk = f159754i;
                    if (bxxk == null) {
                        bxxk = new bxve(f159753g);
                        f159754i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
