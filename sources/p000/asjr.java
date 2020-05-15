package p000;

/* renamed from: asjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asjr extends bxvk implements bxxd {

    /* renamed from: h */
    public static final asjr f89085h;

    /* renamed from: i */
    private static volatile bxxk f89086i;

    /* renamed from: a */
    public int f89087a = 0;

    /* renamed from: b */
    public Object f89088b;

    /* renamed from: c */
    public String f89089c = "";

    /* renamed from: d */
    public long f89090d;

    /* renamed from: e */
    public long f89091e;

    /* renamed from: f */
    public bmtd f89092f;

    /* renamed from: g */
    public int f89093g;

    static {
        asjr asjr = new asjr();
        f89085h = asjr;
        bxvk.m124024a(asjr.class, asjr);
    }

    private asjr() {
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
            return bxvk.m124022a(f89085h, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003\u0002\u0004\u0002\u0005\t\u0006\u0004", new Object[]{"b", "a", "c", asjq.class, "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new asjr();
        } else {
            if (i2 == 4) {
                return new bxvd(f89085h);
            }
            if (i2 == 5) {
                return f89085h;
            }
            bxxk bxxk = f89086i;
            if (bxxk == null) {
                synchronized (asjr.class) {
                    bxxk = f89086i;
                    if (bxxk == null) {
                        bxxk = new bxve(f89085h);
                        f89086i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
