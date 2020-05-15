package p000;

/* renamed from: blds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blds extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blds f126121d;

    /* renamed from: e */
    private static volatile bxxk f126122e;

    /* renamed from: a */
    public int f126123a;

    /* renamed from: b */
    public bldr f126124b;

    /* renamed from: c */
    public bxwc f126125c = bxxn.f165040b;

    static {
        blds blds = new blds();
        f126121d = blds;
        GeneratedMessageLite.m124024a(blds.class, blds);
    }

    private blds() {
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
            return GeneratedMessageLite.m124022a(f126121d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", blfa.class});
        } else if (i2 == 3) {
            return new blds();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f126121d;
            }
            bxxk bxxk = f126122e;
            if (bxxk == null) {
                synchronized (blds.class) {
                    bxxk = f126122e;
                    if (bxxk == null) {
                        bxxk = new bxve(f126121d);
                        f126122e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
