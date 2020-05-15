package p000;

/* renamed from: bvlm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvlm extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvlm f156564e;

    /* renamed from: f */
    private static volatile bxxk f156565f;

    /* renamed from: a */
    public int f156566a;

    /* renamed from: b */
    public bvov f156567b;

    /* renamed from: c */
    public bxwc f156568c = bxxn.f165040b;

    /* renamed from: d */
    public int f156569d;

    static {
        bvlm bvlm = new bvlm();
        f156564e = bvlm;
        GeneratedMessageLite.m124024a(bvlm.class, bvlm);
    }

    private bvlm() {
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
            return GeneratedMessageLite.m124022a(f156564e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003င\u0001", new Object[]{"a", "b", "c", bvll.class, "d"});
        } else if (i2 == 3) {
            return new bvlm();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f156564e;
            }
            bxxk bxxk = f156565f;
            if (bxxk == null) {
                synchronized (bvlm.class) {
                    bxxk = f156565f;
                    if (bxxk == null) {
                        bxxk = new bxve(f156564e);
                        f156565f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
