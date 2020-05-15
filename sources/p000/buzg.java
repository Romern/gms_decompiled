package p000;

/* renamed from: buzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buzg extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final buzg f155373d;

    /* renamed from: e */
    private static volatile bxxk f155374e;

    /* renamed from: a */
    public int f155375a;

    /* renamed from: b */
    public buzq f155376b;

    /* renamed from: c */
    public buzv f155377c;

    static {
        buzg buzg = new buzg();
        f155373d = buzg;
        GeneratedMessageLite.m124024a(buzg.class, buzg);
    }

    private buzg() {
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
            return GeneratedMessageLite.m124022a(f155373d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new buzg();
        } else {
            if (i2 == 4) {
                return new bxvd(f155373d);
            }
            if (i2 == 5) {
                return f155373d;
            }
            bxxk bxxk = f155374e;
            if (bxxk == null) {
                synchronized (buzg.class) {
                    bxxk = f155374e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155373d);
                        f155374e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
