package p000;

/* renamed from: bko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bko extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bko f5002h;

    /* renamed from: i */
    private static volatile bxxk f5003i;

    /* renamed from: a */
    public int f5004a;

    /* renamed from: b */
    public long f5005b;

    /* renamed from: c */
    public long f5006c;

    /* renamed from: d */
    public long f5007d;

    /* renamed from: e */
    public long f5008e;

    /* renamed from: f */
    public bkq f5009f;

    /* renamed from: g */
    public boolean f5010g = true;

    static {
        bko bko = new bko();
        f5002h = bko;
        GeneratedMessageLite.m124024a(bko.class, bko);
    }

    private bko() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f5002h, "\u0001\u0006\u0000\u0001\u0001e\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0004ဂ\u0004\fဂ\u0002dဉ\reဇ\u000e", new Object[]{"a", "b", "c", "e", "d", "f", "g"});
        } else if (i2 == 3) {
            return new bko();
        } else {
            if (i2 == 4) {
                return new bxvd(f5002h);
            }
            if (i2 == 5) {
                return f5002h;
            }
            bxxk bxxk = f5003i;
            if (bxxk == null) {
                synchronized (bko.class) {
                    bxxk = f5003i;
                    if (bxxk == null) {
                        bxxk = new bxve(f5002h);
                        f5003i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
