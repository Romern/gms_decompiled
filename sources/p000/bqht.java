package p000;

/* renamed from: bqht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqht extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bqht f140719b;

    /* renamed from: c */
    private static volatile bxxk f140720c;

    /* renamed from: a */
    public bxvw f140721a = bxwq.f165002b;

    static {
        bqht bqht = new bqht();
        f140719b = bqht;
        GeneratedMessageLite.m124024a(bqht.class, bqht);
    }

    private bqht() {
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
            return GeneratedMessageLite.m124022a(f140719b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bqht();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f140719b;
            }
            bxxk bxxk = f140720c;
            if (bxxk == null) {
                synchronized (bqht.class) {
                    bxxk = f140720c;
                    if (bxxk == null) {
                        bxxk = new bxve(f140719b);
                        f140720c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
