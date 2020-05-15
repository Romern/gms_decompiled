package p000;

/* renamed from: bwvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwvg extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwvg f161118e;

    /* renamed from: f */
    public static final bxvj f161119f;

    /* renamed from: h */
    private static volatile bxxk f161120h;

    /* renamed from: a */
    public bxwc f161121a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f161122b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f161123c = bxxn.f165040b;

    /* renamed from: d */
    public long f161124d;

    /* renamed from: g */
    private int f161125g;

    static {
        bwvg bwvg = new bwvg();
        f161118e = bwvg;
        GeneratedMessageLite.m124024a(bwvg.class, bwvg);
        bwny bwny = bwny.f160414k;
        bwvg bwvg2 = f161118e;
        f161119f = GeneratedMessageLite.m124006a(bwny, bwvg2, bwvg2, 243313294, bxzf.MESSAGE);
    }

    private bwvg() {
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
            return GeneratedMessageLite.m124022a(f161118e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0004\u001b\u0005ဂ\u0000", new Object[]{"g", "a", bwvh.class, "b", bwuf.class, "c", bwur.class, "d"});
        } else if (i2 == 3) {
            return new bwvg();
        } else {
            if (i2 == 4) {
                return new bxvd(f161118e);
            }
            if (i2 == 5) {
                return f161118e;
            }
            bxxk bxxk = f161120h;
            if (bxxk == null) {
                synchronized (bwvg.class) {
                    bxxk = f161120h;
                    if (bxxk == null) {
                        bxxk = new bxve(f161118e);
                        f161120h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
