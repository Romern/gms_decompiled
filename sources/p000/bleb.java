package p000;

/* renamed from: bleb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bleb extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bleb f126167e;

    /* renamed from: f */
    private static volatile bxxk f126168f;

    /* renamed from: a */
    public int f126169a;

    /* renamed from: b */
    public bleu f126170b;

    /* renamed from: c */
    public String f126171c = "";

    /* renamed from: d */
    public String f126172d = "";

    static {
        bleb bleb = new bleb();
        f126167e = bleb;
        GeneratedMessageLite.m124024a(bleb.class, bleb);
    }

    private bleb() {
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
            return GeneratedMessageLite.m124022a(f126167e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bleb();
        } else {
            if (i2 == 4) {
                return new bxvd(f126167e);
            }
            if (i2 == 5) {
                return f126167e;
            }
            bxxk bxxk = f126168f;
            if (bxxk == null) {
                synchronized (bleb.class) {
                    bxxk = f126168f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126167e);
                        f126168f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
