package p000;

/* renamed from: bxje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxje extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxje f163621d;

    /* renamed from: e */
    private static volatile bxxk f163622e;

    /* renamed from: a */
    public int f163623a;

    /* renamed from: b */
    public long f163624b = Long.MAX_VALUE;

    /* renamed from: c */
    public int f163625c = 10;

    static {
        bxje bxje = new bxje();
        f163621d = bxje;
        bxvk.m124024a(bxje.class, bxje);
    }

    private bxje() {
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
            return bxvk.m124022a(f163621d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxje();
        } else {
            if (i2 == 4) {
                return new bxvd(f163621d);
            }
            if (i2 == 5) {
                return f163621d;
            }
            bxxk bxxk = f163622e;
            if (bxxk == null) {
                synchronized (bxje.class) {
                    bxxk = f163622e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163621d);
                        f163622e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
