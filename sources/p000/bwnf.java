package p000;

/* renamed from: bwnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwnf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwnf f160349c;

    /* renamed from: d */
    public static final bxvj f160350d;

    /* renamed from: f */
    private static volatile bxxk f160351f;

    /* renamed from: a */
    public int f160352a;

    /* renamed from: b */
    public bwtg f160353b;

    /* renamed from: e */
    private int f160354e;

    static {
        bwnf bwnf = new bwnf();
        f160349c = bwnf;
        GeneratedMessageLite.m124024a(bwnf.class, bwnf);
        bwxl bwxl = bwxl.f161383i;
        bwnf bwnf2 = f160349c;
        f160350d = GeneratedMessageLite.m124006a(bwxl, bwnf2, bwnf2, 232057537, bxzf.MESSAGE);
    }

    private bwnf() {
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
            return GeneratedMessageLite.m124022a(f160349c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"e", "a", bwnd.f160348a, "b"});
        } else if (i2 == 3) {
            return new bwnf();
        } else {
            if (i2 == 4) {
                return new bxvd(f160349c);
            }
            if (i2 == 5) {
                return f160349c;
            }
            bxxk bxxk = f160351f;
            if (bxxk == null) {
                synchronized (bwnf.class) {
                    bxxk = f160351f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160349c);
                        f160351f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
