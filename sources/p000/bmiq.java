package p000;

/* renamed from: bmiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmiq extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmiq f129615e;

    /* renamed from: f */
    private static volatile bxxk f129616f;

    /* renamed from: a */
    public int f129617a;

    /* renamed from: b */
    public String f129618b = "";

    /* renamed from: c */
    public String f129619c = "";

    /* renamed from: d */
    public String f129620d = "";

    static {
        bmiq bmiq = new bmiq();
        f129615e = bmiq;
        bxvk.m124024a(bmiq.class, bmiq);
    }

    private bmiq() {
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
            return bxvk.m124022a(f129615e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmiq();
        } else {
            if (i2 == 4) {
                return new bxvd(f129615e);
            }
            if (i2 == 5) {
                return f129615e;
            }
            bxxk bxxk = f129616f;
            if (bxxk == null) {
                synchronized (bmiq.class) {
                    bxxk = f129616f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129615e);
                        f129616f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
