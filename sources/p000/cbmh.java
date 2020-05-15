package p000;

/* renamed from: cbmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbmh f177621c;

    /* renamed from: d */
    private static volatile bxxk f177622d;

    /* renamed from: a */
    public int f177623a;

    /* renamed from: b */
    public bxwc f177624b = bxxn.f165040b;

    static {
        cbmh cbmh = new cbmh();
        f177621c = cbmh;
        GeneratedMessageLite.m124024a(cbmh.class, cbmh);
    }

    private cbmh() {
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
            return GeneratedMessageLite.m124022a(f177621c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"a", "b", cbmg.class});
        } else if (i2 == 3) {
            return new cbmh();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f177621c;
            }
            bxxk bxxk = f177622d;
            if (bxxk == null) {
                synchronized (cbmh.class) {
                    bxxk = f177622d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177621c);
                        f177622d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
