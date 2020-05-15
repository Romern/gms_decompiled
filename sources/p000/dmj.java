package p000;

/* renamed from: dmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dmj extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final dmj f13537b;

    /* renamed from: c */
    private static volatile bxxk f13538c;

    /* renamed from: a */
    public bxwc f13539a = bxxn.f165040b;

    static {
        dmj dmj = new dmj();
        f13537b = dmj;
        GeneratedMessageLite.m124024a(dmj.class, dmj);
    }

    private dmj() {
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
            return GeneratedMessageLite.m124022a(f13537b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dmn.class});
        } else if (i2 == 3) {
            return new dmj();
        } else {
            if (i2 == 4) {
                return new bxvd(f13537b);
            }
            if (i2 == 5) {
                return f13537b;
            }
            bxxk bxxk = f13538c;
            if (bxxk == null) {
                synchronized (dmj.class) {
                    bxxk = f13538c;
                    if (bxxk == null) {
                        bxxk = new bxve(f13537b);
                        f13538c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
