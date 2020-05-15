package p000;

/* renamed from: bwjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjx extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bwjx f159888j;

    /* renamed from: l */
    private static volatile bxxk f159889l;

    /* renamed from: a */
    public int f159890a;

    /* renamed from: b */
    public bmav f159891b;

    /* renamed from: c */
    public bmaq f159892c;

    /* renamed from: d */
    public bmar f159893d;

    /* renamed from: e */
    public int f159894e;

    /* renamed from: f */
    public bwjy f159895f;

    /* renamed from: g */
    public bwiu f159896g;

    /* renamed from: h */
    public String f159897h = "";

    /* renamed from: i */
    public bmag f159898i;

    /* renamed from: k */
    private byte f159899k = 2;

    static {
        bwjx bwjx = new bwjx();
        f159888j = bwjx;
        GeneratedMessageLite.m124024a(bwjx.class, bwjx);
    }

    private bwjx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159899k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159899k = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f159888j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ᐉ\u0004\u0006ဈ\u0006\u0007ဉ\u0005\bဉ\u0007", new Object[]{"a", "b", "c", "d", "e", bwgz.m121953b(), "f", "h", "g", "i"});
        } else if (i2 == 3) {
            return new bwjx();
        } else {
            if (i2 == 4) {
                return new bxvd(f159888j);
            }
            if (i2 == 5) {
                return f159888j;
            }
            bxxk bxxk = f159889l;
            if (bxxk == null) {
                synchronized (bwjx.class) {
                    bxxk = f159889l;
                    if (bxxk == null) {
                        bxxk = new bxve(f159888j);
                        f159889l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
