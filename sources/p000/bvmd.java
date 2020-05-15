package p000;

/* renamed from: bvmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvmd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvmd f156640c;

    /* renamed from: e */
    private static volatile bxxk f156641e;

    /* renamed from: a */
    public bvow f156642a;

    /* renamed from: b */
    public bxwc f156643b = bxxn.f165040b;

    /* renamed from: d */
    private int f156644d;

    static {
        bvmd bvmd = new bvmd();
        f156640c = bvmd;
        GeneratedMessageLite.m124024a(bvmd.class, bvmd);
    }

    private bvmd() {
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
            return GeneratedMessageLite.m124022a(f156640c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bvoo.class});
        } else if (i2 == 3) {
            return new bvmd();
        } else {
            if (i2 == 4) {
                return new bxvd(f156640c);
            }
            if (i2 == 5) {
                return f156640c;
            }
            bxxk bxxk = f156641e;
            if (bxxk == null) {
                synchronized (bvmd.class) {
                    bxxk = f156641e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156640c);
                        f156641e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
