package p000;

/* renamed from: aafq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aafq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final aafq f28042c;

    /* renamed from: d */
    private static volatile bxxk f28043d;

    /* renamed from: a */
    public int f28044a;

    /* renamed from: b */
    public int f28045b;

    static {
        aafq aafq = new aafq();
        f28042c = aafq;
        bxvk.m124024a(aafq.class, aafq);
    }

    private aafq() {
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
            return bxvk.m124022a(f28042c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", caij.f174710a});
        } else if (i2 == 3) {
            return new aafq();
        } else {
            if (i2 == 4) {
                return new bxvd(f28042c);
            }
            if (i2 == 5) {
                return f28042c;
            }
            bxxk bxxk = f28043d;
            if (bxxk == null) {
                synchronized (aafq.class) {
                    bxxk = f28043d;
                    if (bxxk == null) {
                        bxxk = new bxve(f28042c);
                        f28043d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
