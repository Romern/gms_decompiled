package p000;

/* renamed from: bsmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsmg extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bsmg f145015h;

    /* renamed from: i */
    public static final bxvj f145016i;

    /* renamed from: j */
    private static volatile bxxk f145017j;

    /* renamed from: a */
    public int f145018a;

    /* renamed from: b */
    public bsqe f145019b;

    /* renamed from: c */
    public boolean f145020c;

    /* renamed from: d */
    public int f145021d;

    /* renamed from: e */
    public int f145022e;

    /* renamed from: f */
    public bxwc f145023f = bxxn.f165040b;

    /* renamed from: g */
    public bsmf f145024g;

    static {
        bsmg bsmg = new bsmg();
        f145015h = bsmg;
        GeneratedMessageLite.m124024a(bsmg.class, bsmg);
        bldd bldd = bldd.f126046a;
        bsmg bsmg2 = f145015h;
        f145016i = GeneratedMessageLite.m124006a(bldd, bsmg2, bsmg2, 224317579, bxzf.MESSAGE);
    }

    private bsmg() {
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
            return GeneratedMessageLite.m124022a(f145015h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003\u0005\u001a\u0006ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bsmg();
        } else {
            if (i2 == 4) {
                return new bxvd(f145015h);
            }
            if (i2 == 5) {
                return f145015h;
            }
            bxxk bxxk = f145017j;
            if (bxxk == null) {
                synchronized (bsmg.class) {
                    bxxk = f145017j;
                    if (bxxk == null) {
                        bxxk = new bxve(f145015h);
                        f145017j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
