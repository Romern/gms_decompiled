package p000;

/* renamed from: mqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mqr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final mqr f34342c;

    /* renamed from: d */
    private static volatile bxxk f34343d;

    /* renamed from: a */
    public int f34344a;

    /* renamed from: b */
    public int f34345b;

    static {
        mqr mqr = new mqr();
        f34342c = mqr;
        bxvk.m124024a(mqr.class, mqr);
    }

    private mqr() {
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
            return bxvk.m124022a(f34342c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", mqq.f34341a});
        } else if (i2 == 3) {
            return new mqr();
        } else {
            if (i2 == 4) {
                return new bxvd(f34342c);
            }
            if (i2 == 5) {
                return f34342c;
            }
            bxxk bxxk = f34343d;
            if (bxxk == null) {
                synchronized (mqr.class) {
                    bxxk = f34343d;
                    if (bxxk == null) {
                        bxxk = new bxve(f34342c);
                        f34343d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
