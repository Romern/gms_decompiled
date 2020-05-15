package p000;

/* renamed from: cabj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cabj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cabj f172440c;

    /* renamed from: d */
    private static volatile bxxk f172441d;

    /* renamed from: a */
    public int f172442a;

    /* renamed from: b */
    public int f172443b;

    static {
        cabj cabj = new cabj();
        f172440c = cabj;
        GeneratedMessageLite.m124024a(cabj.class, cabj);
    }

    private cabj() {
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
            return GeneratedMessageLite.m124022a(f172440c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", cabi.f172439a});
        } else if (i2 == 3) {
            return new cabj();
        } else {
            if (i2 == 4) {
                return new bxvd(f172440c);
            }
            if (i2 == 5) {
                return f172440c;
            }
            bxxk bxxk = f172441d;
            if (bxxk == null) {
                synchronized (cabj.class) {
                    bxxk = f172441d;
                    if (bxxk == null) {
                        bxxk = new bxve(f172440c);
                        f172441d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
