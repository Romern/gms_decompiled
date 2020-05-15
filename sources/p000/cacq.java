package p000;

/* renamed from: cacq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cacq extends bxvk implements bxxd {

    /* renamed from: h */
    public static final cacq f172595h;

    /* renamed from: j */
    private static volatile bxxk f172596j;

    /* renamed from: a */
    public int f172597a;

    /* renamed from: b */
    public String f172598b = "";

    /* renamed from: c */
    public long f172599c;

    /* renamed from: d */
    public cabq f172600d;

    /* renamed from: e */
    public long f172601e;

    /* renamed from: f */
    public String f172602f = "";

    /* renamed from: g */
    public cack f172603g;

    /* renamed from: i */
    private byte f172604i = 2;

    static {
        cacq cacq = new cacq();
        f172595h = cacq;
        bxvk.m124024a(cacq.class, cacq);
    }

    private cacq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f172604i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f172604i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f172595h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new cacq();
        } else {
            if (i2 == 4) {
                return new bxvd(f172595h);
            }
            if (i2 == 5) {
                return f172595h;
            }
            bxxk bxxk = f172596j;
            if (bxxk == null) {
                synchronized (cacq.class) {
                    bxxk = f172596j;
                    if (bxxk == null) {
                        bxxk = new bxve(f172595h);
                        f172596j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
