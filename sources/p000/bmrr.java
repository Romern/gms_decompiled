package p000;

/* renamed from: bmrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmrr extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bmrr f130565j;

    /* renamed from: l */
    private static volatile bxxk f130566l;

    /* renamed from: a */
    public int f130567a;

    /* renamed from: b */
    public bmaq f130568b;

    /* renamed from: c */
    public bmav f130569c;

    /* renamed from: d */
    public bmar f130570d;

    /* renamed from: e */
    public bmrl f130571e;

    /* renamed from: f */
    public bxwc f130572f = bxxn.f165040b;

    /* renamed from: g */
    public bmag f130573g;

    /* renamed from: h */
    public int f130574h;

    /* renamed from: i */
    public long f130575i;

    /* renamed from: k */
    private byte f130576k = 2;

    static {
        bmrr bmrr = new bmrr();
        f130565j = bmrr;
        GeneratedMessageLite.m124024a(bmrr.class, bmrr);
    }

    private bmrr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f130576k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f130576k = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f130565j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0003\u0004ဉ\u0004\u0005ဌ\u0005\u0006ဂ\u0006\u0007ဉ\u0002\bЛ", new Object[]{"a", "b", "c", "e", "g", "h", bwgz.m121953b(), "i", "d", "f", bmrl.class});
        } else if (i2 == 3) {
            return new bmrr();
        } else {
            if (i2 == 4) {
                return new bxvd(f130565j);
            }
            if (i2 == 5) {
                return f130565j;
            }
            bxxk bxxk = f130566l;
            if (bxxk == null) {
                synchronized (bmrr.class) {
                    bxxk = f130566l;
                    if (bxxk == null) {
                        bxxk = new bxve(f130565j);
                        f130566l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
