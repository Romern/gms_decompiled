package p000;

/* renamed from: bwzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwzn extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwzn f161622c;

    /* renamed from: d */
    public static final bxvj f161623d;

    /* renamed from: e */
    private static volatile bxxk f161624e;

    /* renamed from: a */
    public int f161625a;

    /* renamed from: b */
    public int f161626b = 1;

    static {
        bwzn bwzn = new bwzn();
        f161622c = bwzn;
        GeneratedMessageLite.m124024a(bwzn.class, bwzn);
        bwog bwog = bwog.f160437f;
        bwzn bwzn2 = f161622c;
        f161623d = GeneratedMessageLite.m124006a(bwog, bwzn2, bwzn2, 241991458, bxzf.MESSAGE);
    }

    private bwzn() {
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
            return GeneratedMessageLite.m124022a(f161622c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bwzl.f161621a});
        } else if (i2 == 3) {
            return new bwzn();
        } else {
            if (i2 == 4) {
                return new bxvd(f161622c);
            }
            if (i2 == 5) {
                return f161622c;
            }
            bxxk bxxk = f161624e;
            if (bxxk == null) {
                synchronized (bwzn.class) {
                    bxxk = f161624e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161622c);
                        f161624e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
