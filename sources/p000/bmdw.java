package p000;

/* renamed from: bmdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmdw extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bmdw f128877h;

    /* renamed from: i */
    private static volatile bxxk f128878i;

    /* renamed from: a */
    public int f128879a;

    /* renamed from: b */
    public String f128880b = "";

    /* renamed from: c */
    public long f128881c;

    /* renamed from: d */
    public ByteString f128882d = ByteString.f164797b;

    /* renamed from: e */
    public String f128883e = "";

    /* renamed from: f */
    public String f128884f = "";

    /* renamed from: g */
    public int f128885g;

    static {
        bmdw bmdw = new bmdw();
        f128877h = bmdw;
        GeneratedMessageLite.m124024a(bmdw.class, bmdw);
    }

    private bmdw() {
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
            return GeneratedMessageLite.m124022a(f128877h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0002\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဂ\u0001\u0006ဌ\u0005", new Object[]{"a", "b", "d", "e", "f", "c", "g", bmdv.f128876a});
        } else if (i2 == 3) {
            return new bmdw();
        } else {
            if (i2 == 4) {
                return new bxvd(f128877h);
            }
            if (i2 == 5) {
                return f128877h;
            }
            bxxk bxxk = f128878i;
            if (bxxk == null) {
                synchronized (bmdw.class) {
                    bxxk = f128878i;
                    if (bxxk == null) {
                        bxxk = new bxve(f128877h);
                        f128878i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
