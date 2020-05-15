package p000;

/* renamed from: blok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blok extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final blok f127099f;

    /* renamed from: h */
    private static volatile bxxk f127100h;

    /* renamed from: a */
    public int f127101a;

    /* renamed from: b */
    public blnv f127102b;

    /* renamed from: c */
    public int f127103c;

    /* renamed from: d */
    public boolean f127104d;

    /* renamed from: e */
    public blnv f127105e;

    /* renamed from: g */
    private byte f127106g = 2;

    static {
        blok blok = new blok();
        f127099f = blok;
        GeneratedMessageLite.m124024a(blok.class, blok);
    }

    private blok() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127106g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127106g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127099f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0003င\u0002\u0004ဇ\u0003\u0005ᐉ\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new blok();
        } else {
            if (i2 == 4) {
                return new bxvd(f127099f);
            }
            if (i2 == 5) {
                return f127099f;
            }
            bxxk bxxk = f127100h;
            if (bxxk == null) {
                synchronized (blok.class) {
                    bxxk = f127100h;
                    if (bxxk == null) {
                        bxxk = new bxve(f127099f);
                        f127100h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
