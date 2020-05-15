package p000;

/* renamed from: bpcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpcj extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpcj f135734f;

    /* renamed from: h */
    private static volatile bxxk f135735h;

    /* renamed from: a */
    public int f135736a;

    /* renamed from: b */
    public int f135737b;

    /* renamed from: c */
    public int f135738c;

    /* renamed from: d */
    public int f135739d;

    /* renamed from: e */
    public int f135740e;

    /* renamed from: g */
    private byte f135741g = 2;

    static {
        bpcj bpcj = new bpcj();
        f135734f = bpcj;
        GeneratedMessageLite.m124024a(bpcj.class, bpcj);
    }

    private bpcj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f135741g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f135741g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f135734f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpcj();
        } else {
            if (i2 == 4) {
                return new bxvd(f135734f);
            }
            if (i2 == 5) {
                return f135734f;
            }
            bxxk bxxk = f135735h;
            if (bxxk == null) {
                synchronized (bpcj.class) {
                    bxxk = f135735h;
                    if (bxxk == null) {
                        bxxk = new bxve(f135734f);
                        f135735h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
