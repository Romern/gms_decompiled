package p000;

/* renamed from: bpkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpkz extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bpkz f138037j;

    /* renamed from: k */
    private static volatile bxxk f138038k;

    /* renamed from: a */
    public int f138039a;

    /* renamed from: b */
    public int f138040b;

    /* renamed from: c */
    public long f138041c;

    /* renamed from: d */
    public long f138042d;

    /* renamed from: e */
    public boolean f138043e;

    /* renamed from: f */
    public boolean f138044f;

    /* renamed from: g */
    public int f138045g;

    /* renamed from: h */
    public int f138046h;

    /* renamed from: i */
    public int f138047i;

    static {
        bpkz bpkz = new bpkz();
        f138037j = bpkz;
        bxvk.m124024a(bpkz.class, bpkz);
    }

    private bpkz() {
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
            return bxvk.m124022a(f138037j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bpkz();
        } else {
            if (i2 == 4) {
                return new bxvd(f138037j);
            }
            if (i2 == 5) {
                return f138037j;
            }
            bxxk bxxk = f138038k;
            if (bxxk == null) {
                synchronized (bpkz.class) {
                    bxxk = f138038k;
                    if (bxxk == null) {
                        bxxk = new bxve(f138037j);
                        f138038k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
