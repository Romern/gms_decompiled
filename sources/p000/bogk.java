package p000;

/* renamed from: bogk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bogk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bogk f132997d;

    /* renamed from: e */
    private static volatile bxxk f132998e;

    /* renamed from: a */
    public int f132999a;

    /* renamed from: b */
    public long f133000b;

    /* renamed from: c */
    public boolean f133001c;

    static {
        bogk bogk = new bogk();
        f132997d = bogk;
        bxvk.m124024a(bogk.class, bogk);
    }

    private bogk() {
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
            return bxvk.m124022a(f132997d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bogk();
        } else {
            if (i2 == 4) {
                return new bxvd(f132997d);
            }
            if (i2 == 5) {
                return f132997d;
            }
            bxxk bxxk = f132998e;
            if (bxxk == null) {
                synchronized (bogk.class) {
                    bxxk = f132998e;
                    if (bxxk == null) {
                        bxxk = new bxve(f132997d);
                        f132998e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
