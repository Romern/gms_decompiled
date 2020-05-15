package p000;

/* renamed from: bsaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsaj extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bsaj f143852g;

    /* renamed from: h */
    private static volatile bxxk f143853h;

    /* renamed from: a */
    public int f143854a;

    /* renamed from: b */
    public boolean f143855b;

    /* renamed from: c */
    public boolean f143856c;

    /* renamed from: d */
    public int f143857d = 1;

    /* renamed from: e */
    public long f143858e;

    /* renamed from: f */
    public long f143859f;

    static {
        bsaj bsaj = new bsaj();
        f143852g = bsaj;
        GeneratedMessageLite.m124024a(bsaj.class, bsaj);
    }

    private bsaj() {
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
            return GeneratedMessageLite.m124022a(f143852g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", "c", "d", bsag.f143838a, "e", "f"});
        } else if (i2 == 3) {
            return new bsaj();
        } else {
            if (i2 == 4) {
                return new bxvd(f143852g);
            }
            if (i2 == 5) {
                return f143852g;
            }
            bxxk bxxk = f143853h;
            if (bxxk == null) {
                synchronized (bsaj.class) {
                    bxxk = f143853h;
                    if (bxxk == null) {
                        bxxk = new bxve(f143852g);
                        f143853h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
