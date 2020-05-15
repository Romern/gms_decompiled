package p000;

/* renamed from: ajnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajnk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final ajnk f70974d;

    /* renamed from: e */
    private static volatile bxxk f70975e;

    /* renamed from: a */
    public int f70976a;

    /* renamed from: b */
    public int f70977b;

    /* renamed from: c */
    public ajnw f70978c;

    static {
        ajnk ajnk = new ajnk();
        f70974d = ajnk;
        bxvk.m124024a(ajnk.class, ajnk);
    }

    private ajnk() {
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
            return bxvk.m124022a(f70974d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", ajni.f70973a, "c"});
        } else if (i2 == 3) {
            return new ajnk();
        } else {
            if (i2 == 4) {
                return new bxvd(f70974d);
            }
            if (i2 == 5) {
                return f70974d;
            }
            bxxk bxxk = f70975e;
            if (bxxk == null) {
                synchronized (ajnk.class) {
                    bxxk = f70975e;
                    if (bxxk == null) {
                        bxxk = new bxve(f70974d);
                        f70975e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
