package p000;

/* renamed from: boim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boim extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final boim f133185j;

    /* renamed from: k */
    private static volatile bxxk f133186k;

    /* renamed from: a */
    public int f133187a;

    /* renamed from: b */
    public boje f133188b;

    /* renamed from: c */
    public int f133189c;

    /* renamed from: d */
    public int f133190d;

    /* renamed from: e */
    public boolean f133191e;

    /* renamed from: f */
    public boiz f133192f;

    /* renamed from: g */
    public int f133193g;

    /* renamed from: h */
    public long f133194h;

    /* renamed from: i */
    public int f133195i;

    static {
        boim boim = new boim();
        f133185j = boim;
        GeneratedMessageLite.m124024a(boim.class, boim);
    }

    private boim() {
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
            return GeneratedMessageLite.m124022a(f133185j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0004ဌ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဌ\u0006\bဂ\u0007\tဌ\b", new Object[]{"a", "b", "c", bojc.f133262a, "d", boio.f133200a, "e", "f", "g", bojb.f133261a, "h", "i", boil.f133184a});
        } else if (i2 == 3) {
            return new boim();
        } else {
            if (i2 == 4) {
                return new bxvd(f133185j);
            }
            if (i2 == 5) {
                return f133185j;
            }
            bxxk bxxk = f133186k;
            if (bxxk == null) {
                synchronized (boim.class) {
                    bxxk = f133186k;
                    if (bxxk == null) {
                        bxxk = new bxve(f133185j);
                        f133186k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
