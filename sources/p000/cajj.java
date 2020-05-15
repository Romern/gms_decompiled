package p000;

/* renamed from: cajj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cajj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cajj f174828c;

    /* renamed from: d */
    private static volatile bxxk f174829d;

    /* renamed from: a */
    public int f174830a;

    /* renamed from: b */
    public int f174831b;

    static {
        cajj cajj = new cajj();
        f174828c = cajj;
        GeneratedMessageLite.m124024a(cajj.class, cajj);
    }

    private cajj() {
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
            return GeneratedMessageLite.m124022a(f174828c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", caji.f174827a});
        } else if (i2 == 3) {
            return new cajj();
        } else {
            if (i2 == 4) {
                return new bxvd(f174828c);
            }
            if (i2 == 5) {
                return f174828c;
            }
            bxxk bxxk = f174829d;
            if (bxxk == null) {
                synchronized (cajj.class) {
                    bxxk = f174829d;
                    if (bxxk == null) {
                        bxxk = new bxve(f174828c);
                        f174829d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
