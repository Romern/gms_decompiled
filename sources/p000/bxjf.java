package p000;

/* renamed from: bxjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxjf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxjf f163626d;

    /* renamed from: e */
    private static volatile bxxk f163627e;

    /* renamed from: a */
    public int f163628a;

    /* renamed from: b */
    public bxjc f163629b;

    /* renamed from: c */
    public bxwc f163630c = bxxn.f165040b;

    static {
        bxjf bxjf = new bxjf();
        f163626d = bxjf;
        GeneratedMessageLite.m124024a(bxjf.class, bxjf);
    }

    private bxjf() {
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
            return GeneratedMessageLite.m124022a(f163626d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", bxjx.class});
        } else if (i2 == 3) {
            return new bxjf();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f163626d;
            }
            bxxk bxxk = f163627e;
            if (bxxk == null) {
                synchronized (bxjf.class) {
                    bxxk = f163627e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163626d);
                        f163627e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
