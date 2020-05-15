package p000;

/* renamed from: bwnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwnr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwnr f160384d;

    /* renamed from: e */
    public static final bxvj f160385e;

    /* renamed from: g */
    private static volatile bxxk f160386g;

    /* renamed from: a */
    public int f160387a;

    /* renamed from: b */
    public bwxl f160388b;

    /* renamed from: c */
    public bwxl f160389c;

    /* renamed from: f */
    private byte f160390f = 2;

    static {
        bwnr bwnr = new bwnr();
        f160384d = bwnr;
        GeneratedMessageLite.m124024a(bwnr.class, bwnr);
        bwxl bwxl = bwxl.f161383i;
        bwnr bwnr2 = f160384d;
        f160385e = GeneratedMessageLite.m124006a(bwxl, bwnr2, bwnr2, 228971051, bxzf.MESSAGE);
    }

    private bwnr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160390f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160390f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f160384d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwnr();
        } else {
            if (i2 == 4) {
                return new bxvd(f160384d);
            }
            if (i2 == 5) {
                return f160384d;
            }
            bxxk bxxk = f160386g;
            if (bxxk == null) {
                synchronized (bwnr.class) {
                    bxxk = f160386g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160384d);
                        f160386g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
