package p000;

/* renamed from: bppz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bppz extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bppz f138678h;

    /* renamed from: j */
    private static volatile bxxk f138679j;

    /* renamed from: a */
    public int f138680a;

    /* renamed from: b */
    public String f138681b = "";

    /* renamed from: c */
    public bplh f138682c;

    /* renamed from: d */
    public String f138683d = "";

    /* renamed from: e */
    public bxwc f138684e = bxxn.f165040b;

    /* renamed from: f */
    public String f138685f = "";

    /* renamed from: g */
    public String f138686g = "";

    /* renamed from: i */
    private byte f138687i = 2;

    static {
        bppz bppz = new bppz();
        f138678h = bppz;
        GeneratedMessageLite.m124024a(bppz.class, bppz);
    }

    private bppz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f138687i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f138687i = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f138678h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bppz();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f138678h;
            }
            bxxk bxxk = f138679j;
            if (bxxk == null) {
                synchronized (bppz.class) {
                    bxxk = f138679j;
                    if (bxxk == null) {
                        bxxk = new bxve(f138678h);
                        f138679j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
