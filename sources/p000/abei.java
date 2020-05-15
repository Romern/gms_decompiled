package p000;

/* renamed from: abei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abei extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final abei f57232b;

    /* renamed from: c */
    private static volatile bxxk f57233c;

    /* renamed from: a */
    public bxwc f57234a = bxxn.f165040b;

    static {
        abei abei = new abei();
        f57232b = abei;
        GeneratedMessageLite.m124024a(abei.class, abei);
    }

    private abei() {
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
            return GeneratedMessageLite.m124022a(f57232b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", abeh.class});
        } else if (i2 == 3) {
            return new abei();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f57232b;
            }
            bxxk bxxk = f57233c;
            if (bxxk == null) {
                synchronized (abei.class) {
                    bxxk = f57233c;
                    if (bxxk == null) {
                        bxxk = new bxve(f57232b);
                        f57233c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
