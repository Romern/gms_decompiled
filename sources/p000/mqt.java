package p000;

/* renamed from: mqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mqt extends bxvk implements bxxd {

    /* renamed from: e */
    public static final mqt f34347e;

    /* renamed from: f */
    private static volatile bxxk f34348f;

    /* renamed from: a */
    public int f34349a;

    /* renamed from: b */
    public int f34350b;

    /* renamed from: c */
    public int f34351c;

    /* renamed from: d */
    public int f34352d;

    static {
        mqt mqt = new mqt();
        f34347e = mqt;
        bxvk.m124024a(mqt.class, mqt);
    }

    private mqt() {
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
            return bxvk.m124022a(f34347e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", mqs.f34346a, "c", mqi.f34230a, "d"});
        } else if (i2 == 3) {
            return new mqt();
        } else {
            if (i2 == 4) {
                return new bxvd(f34347e);
            }
            if (i2 == 5) {
                return f34347e;
            }
            bxxk bxxk = f34348f;
            if (bxxk == null) {
                synchronized (mqt.class) {
                    bxxk = f34348f;
                    if (bxxk == null) {
                        bxxk = new bxve(f34347e);
                        f34348f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
