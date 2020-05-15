package p000;

/* renamed from: bmon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmon extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bmon f130242b;

    /* renamed from: c */
    private static volatile bxxk f130243c;

    /* renamed from: a */
    public bxwc f130244a = bxxn.f165040b;

    static {
        bmon bmon = new bmon();
        f130242b = bmon;
        GeneratedMessageLite.m124024a(bmon.class, bmon);
    }

    private bmon() {
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
            return GeneratedMessageLite.m124022a(f130242b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bmom.class});
        } else if (i2 == 3) {
            return new bmon();
        } else {
            if (i2 == 4) {
                return new bxvd(f130242b);
            }
            if (i2 == 5) {
                return f130242b;
            }
            bxxk bxxk = f130243c;
            if (bxxk == null) {
                synchronized (bmon.class) {
                    bxxk = f130243c;
                    if (bxxk == null) {
                        bxxk = new bxve(f130242b);
                        f130243c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
