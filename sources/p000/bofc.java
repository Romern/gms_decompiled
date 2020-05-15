package p000;

/* renamed from: bofc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bofc extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bofc f132873f;

    /* renamed from: g */
    private static volatile bxxk f132874g;

    /* renamed from: a */
    public int f132875a;

    /* renamed from: b */
    public int f132876b;

    /* renamed from: c */
    public boolean f132877c;

    /* renamed from: d */
    public boolean f132878d;

    /* renamed from: e */
    public boolean f132879e;

    static {
        bofc bofc = new bofc();
        f132873f = bofc;
        bxvk.m124024a(bofc.class, bofc);
    }

    private bofc() {
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
            return bxvk.m124022a(f132873f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", bofa.f132872a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bofc();
        } else {
            if (i2 == 4) {
                return new bxvd(f132873f);
            }
            if (i2 == 5) {
                return f132873f;
            }
            bxxk bxxk = f132874g;
            if (bxxk == null) {
                synchronized (bofc.class) {
                    bxxk = f132874g;
                    if (bxxk == null) {
                        bxxk = new bxve(f132873f);
                        f132874g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
