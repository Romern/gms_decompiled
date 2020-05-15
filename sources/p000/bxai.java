package p000;

/* renamed from: bxai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxai extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxai f161689d;

    /* renamed from: e */
    public static final bxvj f161690e;

    /* renamed from: h */
    private static volatile bxxk f161691h;

    /* renamed from: a */
    public bxwc f161692a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f161693b = bxxn.f165040b;

    /* renamed from: c */
    public int f161694c;

    /* renamed from: f */
    private int f161695f;

    /* renamed from: g */
    private byte f161696g = 2;

    static {
        bxai bxai = new bxai();
        f161689d = bxai;
        GeneratedMessageLite.m124024a(bxai.class, bxai);
        bwxl bwxl = bwxl.f161383i;
        bxai bxai2 = f161689d;
        f161690e = GeneratedMessageLite.m124006a(bwxl, bxai2, bxai2, 62160224, bxzf.MESSAGE);
    }

    private bxai() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161696g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161696g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f161689d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001Л\u0002Л\u0003ဌ\u0000", new Object[]{"f", "a", bwxl.class, "b", bwxl.class, "c", bxag.f161688a});
        } else if (i2 == 3) {
            return new bxai();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f161689d;
            }
            bxxk bxxk = f161691h;
            if (bxxk == null) {
                synchronized (bxai.class) {
                    bxxk = f161691h;
                    if (bxxk == null) {
                        bxxk = new bxve(f161689d);
                        f161691h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
