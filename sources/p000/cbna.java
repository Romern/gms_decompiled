package p000;

/* renamed from: cbna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbna extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbna f177706c;

    /* renamed from: d */
    private static volatile bxxk f177707d;

    /* renamed from: a */
    public cbmo f177708a;

    /* renamed from: b */
    public cbmf f177709b;

    static {
        cbna cbna = new cbna();
        f177706c = cbna;
        GeneratedMessageLite.m124024a(cbna.class, cbna);
    }

    private cbna() {
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
            return GeneratedMessageLite.m124022a(f177706c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new cbna();
        } else {
            if (i2 == 4) {
                return new bxvd(f177706c);
            }
            if (i2 == 5) {
                return f177706c;
            }
            bxxk bxxk = f177707d;
            if (bxxk == null) {
                synchronized (cbna.class) {
                    bxxk = f177707d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177706c);
                        f177707d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
