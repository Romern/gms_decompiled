package p000;

/* renamed from: abds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abds extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final abds f57130b;

    /* renamed from: c */
    private static volatile bxxk f57131c;

    /* renamed from: a */
    public bxwc f57132a = bxxn.f165040b;

    static {
        abds abds = new abds();
        f57130b = abds;
        GeneratedMessageLite.m124024a(abds.class, abds);
    }

    private abds() {
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
            return GeneratedMessageLite.m124022a(f57130b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", abdf.class});
        } else if (i2 == 3) {
            return new abds();
        } else {
            if (i2 == 4) {
                return new bxvd(f57130b);
            }
            if (i2 == 5) {
                return f57130b;
            }
            bxxk bxxk = f57131c;
            if (bxxk == null) {
                synchronized (abds.class) {
                    bxxk = f57131c;
                    if (bxxk == null) {
                        bxxk = new bxve(f57130b);
                        f57131c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
