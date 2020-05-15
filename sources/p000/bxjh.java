package p000;

/* renamed from: bxjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxjh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxjh f163636d;

    /* renamed from: e */
    private static volatile bxxk f163637e;

    /* renamed from: a */
    public int f163638a;

    /* renamed from: b */
    public bxjc f163639b;

    /* renamed from: c */
    public bxwc f163640c = bxxn.f165040b;

    static {
        bxjh bxjh = new bxjh();
        f163636d = bxjh;
        GeneratedMessageLite.m124024a(bxjh.class, bxjh);
    }

    private bxjh() {
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
            return GeneratedMessageLite.m124022a(f163636d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", bxjw.class});
        } else if (i2 == 3) {
            return new bxjh();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f163636d;
            }
            bxxk bxxk = f163637e;
            if (bxxk == null) {
                synchronized (bxjh.class) {
                    bxxk = f163637e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163636d);
                        f163637e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
