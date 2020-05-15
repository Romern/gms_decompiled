package p000;

/* renamed from: cbjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbjq f177355c;

    /* renamed from: d */
    private static volatile bxxk f177356d;

    /* renamed from: a */
    public cbmo f177357a;

    /* renamed from: b */
    public cblf f177358b;

    static {
        cbjq cbjq = new cbjq();
        f177355c = cbjq;
        GeneratedMessageLite.m124024a(cbjq.class, cbjq);
    }

    private cbjq() {
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
            return GeneratedMessageLite.m124022a(f177355c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbjq();
        } else {
            if (i2 == 4) {
                return new bxvd(f177355c);
            }
            if (i2 == 5) {
                return f177355c;
            }
            bxxk bxxk = f177356d;
            if (bxxk == null) {
                synchronized (cbjq.class) {
                    bxxk = f177356d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177355c);
                        f177356d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
