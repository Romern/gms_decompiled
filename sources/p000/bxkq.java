package p000;

/* renamed from: bxkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxkq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxkq f163780d;

    /* renamed from: e */
    public static final bxvj f163781e;

    /* renamed from: f */
    private static volatile bxxk f163782f;

    /* renamed from: a */
    public int f163783a;

    /* renamed from: b */
    public int f163784b;

    /* renamed from: c */
    public int f163785c;

    static {
        bxkq bxkq = new bxkq();
        f163780d = bxkq;
        GeneratedMessageLite.m124024a(bxkq.class, bxkq);
        bxcf bxcf = bxcf.f162779a;
        bxkq bxkq2 = f163780d;
        f163781e = GeneratedMessageLite.m124006a(bxcf, bxkq2, bxkq2, 172013548, bxzf.MESSAGE);
    }

    private bxkq() {
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
            return GeneratedMessageLite.m124022a(f163780d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bxkp.m122812b()});
        } else if (i2 == 3) {
            return new bxkq();
        } else {
            if (i2 == 4) {
                return new bxvd(f163780d);
            }
            if (i2 == 5) {
                return f163780d;
            }
            bxxk bxxk = f163782f;
            if (bxxk == null) {
                synchronized (bxkq.class) {
                    bxxk = f163782f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163780d);
                        f163782f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
