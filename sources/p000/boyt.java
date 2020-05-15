package p000;

/* renamed from: boyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boyt extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final boyt f135341h;

    /* renamed from: i */
    private static volatile bxxk f135342i;

    /* renamed from: a */
    public int f135343a;

    /* renamed from: b */
    public int f135344b;

    /* renamed from: c */
    public int f135345c;

    /* renamed from: d */
    public String f135346d = "";

    /* renamed from: e */
    public String f135347e = "";

    /* renamed from: f */
    public int f135348f;

    /* renamed from: g */
    public int f135349g;

    static {
        boyt boyt = new boyt();
        f135341h = boyt;
        GeneratedMessageLite.m124024a(boyt.class, boyt);
    }

    private boyt() {
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
            return GeneratedMessageLite.m124022a(f135341h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"a", "b", boyq.f135338a, "c", boys.f135340a, "d", "e", "f", boyr.f135339a, "g", boyp.f135337a});
        } else if (i2 == 3) {
            return new boyt();
        } else {
            if (i2 == 4) {
                return new bxvd(f135341h);
            }
            if (i2 == 5) {
                return f135341h;
            }
            bxxk bxxk = f135342i;
            if (bxxk == null) {
                synchronized (boyt.class) {
                    bxxk = f135342i;
                    if (bxxk == null) {
                        bxxk = new bxve(f135341h);
                        f135342i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
