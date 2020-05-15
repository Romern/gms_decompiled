package p000;

/* renamed from: cbjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjo extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbjo f177349b;

    /* renamed from: c */
    private static volatile bxxk f177350c;

    /* renamed from: a */
    public cbjp f177351a;

    static {
        cbjo cbjo = new cbjo();
        f177349b = cbjo;
        GeneratedMessageLite.m124024a(cbjo.class, cbjo);
    }

    private cbjo() {
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
            return GeneratedMessageLite.m124022a(f177349b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbjo();
        } else {
            if (i2 == 4) {
                return new bxvd(f177349b);
            }
            if (i2 == 5) {
                return f177349b;
            }
            bxxk bxxk = f177350c;
            if (bxxk == null) {
                synchronized (cbjo.class) {
                    bxxk = f177350c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177349b);
                        f177350c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
