package p000;

/* renamed from: bxnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxnj extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxnj f164037e;

    /* renamed from: f */
    public static final bxvj f164038f;

    /* renamed from: g */
    private static volatile bxxk f164039g;

    /* renamed from: a */
    public int f164040a;

    /* renamed from: b */
    public bxwc f164041b = bxxn.f165040b;

    /* renamed from: c */
    public int f164042c;

    /* renamed from: d */
    public int f164043d;

    static {
        bxnj bxnj = new bxnj();
        f164037e = bxnj;
        GeneratedMessageLite.m124024a(bxnj.class, bxnj);
        bxcf bxcf = bxcf.f162779a;
        bxnj bxnj2 = f164037e;
        f164038f = GeneratedMessageLite.m124006a(bxcf, bxnj2, bxnj2, 136068878, bxzf.MESSAGE);
    }

    private bxnj() {
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
            return GeneratedMessageLite.m124022a(f164037e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001", new Object[]{"a", "b", bxni.class, "c", "d"});
        } else if (i2 == 3) {
            return new bxnj();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f164037e;
            }
            bxxk bxxk = f164039g;
            if (bxxk == null) {
                synchronized (bxnj.class) {
                    bxxk = f164039g;
                    if (bxxk == null) {
                        bxxk = new bxve(f164037e);
                        f164039g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
