package p000;

/* renamed from: caal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caal extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final caal f172339e;

    /* renamed from: f */
    private static volatile bxxk f172340f;

    /* renamed from: a */
    public int f172341a;

    /* renamed from: b */
    public String f172342b = "";

    /* renamed from: c */
    public int f172343c = 1;

    /* renamed from: d */
    public boolean f172344d;

    static {
        caal caal = new caal();
        f172339e = caal;
        GeneratedMessageLite.m124024a(caal.class, caal);
    }

    private caal() {
    }

    /* renamed from: c */
    public static caai m126416c() {
        return (caai) f172339e.mo74144da();
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
            return GeneratedMessageLite.m124022a(f172339e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဌ\u0001\u0004ဇ\u0002", new Object[]{"a", "b", "c", caaj.f172338a, "d"});
        } else if (i2 == 3) {
            return new caal();
        } else {
            if (i2 == 4) {
                return new caai();
            }
            if (i2 == 5) {
                return f172339e;
            }
            bxxk bxxk = f172340f;
            if (bxxk == null) {
                synchronized (caal.class) {
                    bxxk = f172340f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172339e);
                        f172340f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
