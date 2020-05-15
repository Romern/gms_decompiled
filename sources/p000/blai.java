package p000;

/* renamed from: blai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blai extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blai f125770a;

    /* renamed from: e */
    private static volatile bxxk f125771e;

    /* renamed from: b */
    private int f125772b;

    /* renamed from: c */
    private String f125773c = "";

    /* renamed from: d */
    private byte f125774d = 2;

    static {
        blai blai = new blai();
        f125770a = blai;
        GeneratedMessageLite.m124024a(blai.class, blai);
    }

    private blai() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125774d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125774d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125770a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new blai();
        } else {
            if (i2 == 4) {
                return new bxvd(f125770a);
            }
            if (i2 == 5) {
                return f125770a;
            }
            bxxk bxxk = f125771e;
            if (bxxk == null) {
                synchronized (blai.class) {
                    bxxk = f125771e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125770a);
                        f125771e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
