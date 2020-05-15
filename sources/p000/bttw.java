package p000;

/* renamed from: bttw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bttw extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bttw f150399j;

    /* renamed from: l */
    private static volatile bxxk f150400l;

    /* renamed from: a */
    public int f150401a;

    /* renamed from: b */
    public String f150402b = "";

    /* renamed from: c */
    public btsf f150403c;

    /* renamed from: d */
    public btsb f150404d;

    /* renamed from: e */
    public String f150405e = "";

    /* renamed from: f */
    public int f150406f;

    /* renamed from: g */
    public int f150407g;

    /* renamed from: h */
    public bxvt f150408h = bxvm.f164965b;

    /* renamed from: i */
    public btsg f150409i;

    /* renamed from: k */
    private byte f150410k = 2;

    static {
        bttw bttw = new bttw();
        f150399j = bttw;
        GeneratedMessageLite.m124024a(bttw.class, bttw);
    }

    private bttw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f150410k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f150410k = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f150399j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007\u001e\bဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", bttu.f150397a, "g", bttv.f150398a, "h", btrr.m117076b(), "i"});
        } else if (i2 == 3) {
            return new bttw();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f150399j;
            }
            bxxk bxxk = f150400l;
            if (bxxk == null) {
                synchronized (bttw.class) {
                    bxxk = f150400l;
                    if (bxxk == null) {
                        bxxk = new bxve(f150399j);
                        f150400l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
