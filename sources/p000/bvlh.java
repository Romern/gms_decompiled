package p000;

/* renamed from: bvlh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvlh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvlh f156535c;

    /* renamed from: e */
    private static volatile bxxk f156536e;

    /* renamed from: a */
    public bvow f156537a;

    /* renamed from: b */
    public bxwc f156538b = bxxn.f165040b;

    /* renamed from: d */
    private int f156539d;

    static {
        bvlh bvlh = new bvlh();
        f156535c = bvlh;
        GeneratedMessageLite.m124024a(bvlh.class, bvlh);
    }

    private bvlh() {
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
            return GeneratedMessageLite.m124022a(f156535c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bvog.class});
        } else if (i2 == 3) {
            return new bvlh();
        } else {
            if (i2 == 4) {
                return new bxvd(f156535c);
            }
            if (i2 == 5) {
                return f156535c;
            }
            bxxk bxxk = f156536e;
            if (bxxk == null) {
                synchronized (bvlh.class) {
                    bxxk = f156536e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156535c);
                        f156536e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
