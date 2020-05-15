package p000;

/* renamed from: bxdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxdj extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxdj f163036e;

    /* renamed from: f */
    private static volatile bxxk f163037f;

    /* renamed from: a */
    public int f163038a;

    /* renamed from: b */
    public String f163039b = "";

    /* renamed from: c */
    public String f163040c = "";

    /* renamed from: d */
    public String f163041d = "";

    static {
        bxdj bxdj = new bxdj();
        f163036e = bxdj;
        GeneratedMessageLite.m124024a(bxdj.class, bxdj);
    }

    private bxdj() {
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
            return GeneratedMessageLite.m124022a(f163036e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bxdj();
        } else {
            if (i2 == 4) {
                return new bxvd(f163036e);
            }
            if (i2 == 5) {
                return f163036e;
            }
            bxxk bxxk = f163037f;
            if (bxxk == null) {
                synchronized (bxdj.class) {
                    bxxk = f163037f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163036e);
                        f163037f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
