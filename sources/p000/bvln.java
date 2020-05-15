package p000;

/* renamed from: bvln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvln extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvln f156570c;

    /* renamed from: e */
    private static volatile bxxk f156571e;

    /* renamed from: a */
    public bxwc f156572a = bxxn.f165040b;

    /* renamed from: b */
    public long f156573b;

    /* renamed from: d */
    private int f156574d;

    static {
        bvln bvln = new bvln();
        f156570c = bvln;
        GeneratedMessageLite.m124024a(bvln.class, bvln);
    }

    private bvln() {
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
            return GeneratedMessageLite.m124022a(f156570c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001စ\u0000\u0002\u001b", new Object[]{"d", "b", "a", bvog.class});
        } else if (i2 == 3) {
            return new bvln();
        } else {
            if (i2 == 4) {
                return new bxvd(f156570c);
            }
            if (i2 == 5) {
                return f156570c;
            }
            bxxk bxxk = f156571e;
            if (bxxk == null) {
                synchronized (bvln.class) {
                    bxxk = f156571e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156570c);
                        f156571e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
