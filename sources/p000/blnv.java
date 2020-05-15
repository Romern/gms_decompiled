package p000;

/* renamed from: blnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blnv extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final blnv f127029k;

    /* renamed from: m */
    private static volatile bxxk f127030m;

    /* renamed from: a */
    public int f127031a;

    /* renamed from: b */
    public int f127032b;

    /* renamed from: c */
    public int f127033c;

    /* renamed from: d */
    public int f127034d;

    /* renamed from: e */
    public blnu f127035e;

    /* renamed from: f */
    public int f127036f = 1;

    /* renamed from: g */
    public int f127037g = 1;

    /* renamed from: h */
    public long f127038h;

    /* renamed from: i */
    public boolean f127039i;

    /* renamed from: j */
    public boolean f127040j;

    /* renamed from: l */
    private byte f127041l = 2;

    static {
        blnv blnv = new blnv();
        f127029k = blnv;
        GeneratedMessageLite.m124024a(blnv.class, blnv);
    }

    private blnv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127041l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127041l = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127029k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ᐉ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007စ\u0006\bဇ\u0007\tဇ\b", new Object[]{"a", "b", "c", "d", "e", "f", blns.f127021a, "g", blnq.f127020a, "h", "i", "j"});
        } else if (i2 == 3) {
            return new blnv();
        } else {
            if (i2 == 4) {
                return new bxvd(f127029k);
            }
            if (i2 == 5) {
                return f127029k;
            }
            bxxk bxxk = f127030m;
            if (bxxk == null) {
                synchronized (blnv.class) {
                    bxxk = f127030m;
                    if (bxxk == null) {
                        bxxk = new bxve(f127029k);
                        f127030m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
