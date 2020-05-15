package p000;

/* renamed from: aait */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aait extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final aait f28219k;

    /* renamed from: l */
    private static volatile bxxk f28220l;

    /* renamed from: a */
    public int f28221a;

    /* renamed from: b */
    public String f28222b = "";

    /* renamed from: c */
    public long f28223c;

    /* renamed from: d */
    public int f28224d;

    /* renamed from: e */
    public boolean f28225e;

    /* renamed from: f */
    public int f28226f;

    /* renamed from: g */
    public int f28227g;

    /* renamed from: h */
    public int f28228h;

    /* renamed from: i */
    public long f28229i;

    /* renamed from: j */
    public aaiy f28230j;

    static {
        aait aait = new aait();
        f28219k = aait;
        GeneratedMessageLite.m124024a(aait.class, aait);
    }

    private aait() {
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
            return GeneratedMessageLite.m124022a(f28219k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0002\u0003ဂ\u0001\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bတ\u0007\tဉ\b", new Object[]{"a", "b", "d", "c", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new aait();
        } else {
            if (i2 == 4) {
                return new bxvd(f28219k);
            }
            if (i2 == 5) {
                return f28219k;
            }
            bxxk bxxk = f28220l;
            if (bxxk == null) {
                synchronized (aait.class) {
                    bxxk = f28220l;
                    if (bxxk == null) {
                        bxxk = new bxve(f28219k);
                        f28220l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
