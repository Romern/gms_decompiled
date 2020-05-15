package p000;

/* renamed from: byma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byma extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final byma f166976j;

    /* renamed from: l */
    private static volatile bxxk f166977l;

    /* renamed from: a */
    public int f166978a;

    /* renamed from: b */
    public long f166979b;

    /* renamed from: c */
    public String f166980c = "";

    /* renamed from: d */
    public String f166981d = "";

    /* renamed from: e */
    public bxwc f166982e;

    /* renamed from: f */
    public bymb f166983f;

    /* renamed from: g */
    public int f166984g;

    /* renamed from: h */
    public String f166985h;

    /* renamed from: i */
    public boju f166986i;

    /* renamed from: k */
    private byte f166987k = 2;

    static {
        byma byma = new byma();
        f166976j = byma;
        GeneratedMessageLite.m124024a(byma.class, byma);
    }

    private byma() {
        bxxn bxxn = bxxn.f165040b;
        this.f166982e = bxxn.f165040b;
        this.f166985h = "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f166987k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f166987k = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f166976j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0002\u0001ᔅ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005\u001a\u0006ᐉ\u0003\u0007င\u0004\bဈ\u0005\tဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new byma();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f166976j;
            }
            bxxk bxxk = f166977l;
            if (bxxk == null) {
                synchronized (byma.class) {
                    bxxk = f166977l;
                    if (bxxk == null) {
                        bxxk = new bxve(f166976j);
                        f166977l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
