package p000;

/* renamed from: bwnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwnb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwnb f160338c;

    /* renamed from: d */
    public static final bxvj f160339d;

    /* renamed from: e */
    private static volatile bxxk f160340e;

    /* renamed from: a */
    public int f160341a;

    /* renamed from: b */
    public bwtd f160342b;

    static {
        bwnb bwnb = new bwnb();
        f160338c = bwnb;
        GeneratedMessageLite.m124024a(bwnb.class, bwnb);
        bwny bwny = bwny.f160414k;
        bwnb bwnb2 = f160338c;
        f160339d = GeneratedMessageLite.m124006a(bwny, bwnb2, bwnb2, 232057536, bxzf.MESSAGE);
    }

    private bwnb() {
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
            return GeneratedMessageLite.m124022a(f160338c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwnb();
        } else {
            if (i2 == 4) {
                return new bxvd(f160338c);
            }
            if (i2 == 5) {
                return f160338c;
            }
            bxxk bxxk = f160340e;
            if (bxxk == null) {
                synchronized (bwnb.class) {
                    bxxk = f160340e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160338c);
                        f160340e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
