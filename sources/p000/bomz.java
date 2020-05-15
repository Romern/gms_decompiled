package p000;

/* renamed from: bomz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bomz extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bomz f133743f;

    /* renamed from: g */
    private static volatile bxxk f133744g;

    /* renamed from: a */
    public int f133745a;

    /* renamed from: b */
    public int f133746b;

    /* renamed from: c */
    public int f133747c;

    /* renamed from: d */
    public bomw f133748d;

    /* renamed from: e */
    public long f133749e;

    static {
        bomz bomz = new bomz();
        f133743f = bomz;
        GeneratedMessageLite.m124024a(bomz.class, bomz);
    }

    private bomz() {
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
            return GeneratedMessageLite.m124022a(f133743f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0003င\u0002\u0004ဉ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", adbf.f61238a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bomz();
        } else {
            if (i2 == 4) {
                return new bxvd(f133743f);
            }
            if (i2 == 5) {
                return f133743f;
            }
            bxxk bxxk = f133744g;
            if (bxxk == null) {
                synchronized (bomz.class) {
                    bxxk = f133744g;
                    if (bxxk == null) {
                        bxxk = new bxve(f133743f);
                        f133744g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
