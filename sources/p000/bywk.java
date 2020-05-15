package p000;

/* renamed from: bywk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywk extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bywk f168584f;

    /* renamed from: g */
    private static volatile bxxk f168585g;

    /* renamed from: a */
    public int f168586a;

    /* renamed from: b */
    public int f168587b;

    /* renamed from: c */
    public int f168588c;

    /* renamed from: d */
    public int f168589d;

    /* renamed from: e */
    public int f168590e;

    static {
        bywk bywk = new bywk();
        f168584f = bywk;
        bxvk.m124024a(bywk.class, bywk);
    }

    private bywk() {
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
            return bxvk.m124022a(f168584f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", bvhn.f156100a, "c", bvho.f156101a, "d", bvhq.f156103a, "e", bvhp.f156102a});
        } else if (i2 == 3) {
            return new bywk();
        } else {
            if (i2 == 4) {
                return new bxvd(f168584f);
            }
            if (i2 == 5) {
                return f168584f;
            }
            bxxk bxxk = f168585g;
            if (bxxk == null) {
                synchronized (bywk.class) {
                    bxxk = f168585g;
                    if (bxxk == null) {
                        bxxk = new bxve(f168584f);
                        f168585g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
