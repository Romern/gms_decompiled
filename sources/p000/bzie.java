package p000;

/* renamed from: bzie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzie extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzie f170162b;

    /* renamed from: c */
    public static final bxvj f170163c;

    /* renamed from: e */
    private static volatile bxxk f170164e;

    /* renamed from: a */
    public bxwc f170165a = bxxn.f165040b;

    /* renamed from: d */
    private byte f170166d = 2;

    static {
        bzie bzie = new bzie();
        f170162b = bzie;
        GeneratedMessageLite.m124024a(bzie.class, bzie);
        blca blca = blca.f125893b;
        bzie bzie2 = f170162b;
        f170163c = GeneratedMessageLite.m124006a(blca, bzie2, bzie2, 64399324, bxzf.MESSAGE);
    }

    private bzie() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f170166d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f170166d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f170162b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0001\u0003Л", new Object[]{"a", bzhk.class});
        } else if (i2 == 3) {
            return new bzie();
        } else {
            if (i2 == 4) {
                return new bxvd(f170162b);
            }
            if (i2 == 5) {
                return f170162b;
            }
            bxxk bxxk = f170164e;
            if (bxxk == null) {
                synchronized (bzie.class) {
                    bxxk = f170164e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170162b);
                        f170164e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
