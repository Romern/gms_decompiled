package p000;

/* renamed from: bxiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxiu extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxiu f163567e;

    /* renamed from: f */
    private static volatile bxxk f163568f;

    /* renamed from: a */
    public int f163569a;

    /* renamed from: b */
    public bxjc f163570b;

    /* renamed from: c */
    public int f163571c;

    /* renamed from: d */
    public bxwc f163572d = bxxn.f165040b;

    static {
        bxiu bxiu = new bxiu();
        f163567e = bxiu;
        GeneratedMessageLite.m124024a(bxiu.class, bxiu);
    }

    private bxiu() {
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
            return GeneratedMessageLite.m124022a(f163567e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003\u001c", new Object[]{"a", "b", "c", bxco.m122578b(), "d"});
        } else if (i2 == 3) {
            return new bxiu();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f163567e;
            }
            bxxk bxxk = f163568f;
            if (bxxk == null) {
                synchronized (bxiu.class) {
                    bxxk = f163568f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163567e);
                        f163568f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
