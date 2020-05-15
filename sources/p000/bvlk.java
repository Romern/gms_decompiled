package p000;

/* renamed from: bvlk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvlk extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bvlk f156552f;

    /* renamed from: g */
    private static volatile bxxk f156553g;

    /* renamed from: a */
    public int f156554a;

    /* renamed from: b */
    public bvow f156555b;

    /* renamed from: c */
    public bxwc f156556c = bxxn.f165040b;

    /* renamed from: d */
    public String f156557d = "";

    /* renamed from: e */
    public bxwc f156558e = bxxn.f165040b;

    static {
        bvlk bvlk = new bvlk();
        f156552f = bvlk;
        GeneratedMessageLite.m124024a(bvlk.class, bvlk);
    }

    private bvlk() {
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
            return GeneratedMessageLite.m124022a(f156552f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဈ\u0001\u0004\u001b", new Object[]{"a", "b", "c", bvog.class, "d", "e", bvlj.class});
        } else if (i2 == 3) {
            return new bvlk();
        } else {
            if (i2 == 4) {
                return new bxvd(f156552f);
            }
            if (i2 == 5) {
                return f156552f;
            }
            bxxk bxxk = f156553g;
            if (bxxk == null) {
                synchronized (bvlk.class) {
                    bxxk = f156553g;
                    if (bxxk == null) {
                        bxxk = new bxve(f156552f);
                        f156553g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
