package p000;

/* renamed from: blrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blrk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blrk f127482d;

    /* renamed from: e */
    private static volatile bxxk f127483e;

    /* renamed from: a */
    public int f127484a;

    /* renamed from: b */
    public bloy f127485b;

    /* renamed from: c */
    public String f127486c = "";

    static {
        blrk blrk = new blrk();
        f127482d = blrk;
        bxvk.m124024a(blrk.class, blrk);
    }

    private blrk() {
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
            return bxvk.m124022a(f127482d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0000\u0004ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blrk();
        } else {
            if (i2 == 4) {
                return new bxvd(f127482d);
            }
            if (i2 == 5) {
                return f127482d;
            }
            bxxk bxxk = f127483e;
            if (bxxk == null) {
                synchronized (blrk.class) {
                    bxxk = f127483e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127482d);
                        f127483e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
