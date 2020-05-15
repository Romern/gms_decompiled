package p000;

/* renamed from: aafk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aafk extends bxvk implements bxxd {

    /* renamed from: f */
    public static final aafk f28015f;

    /* renamed from: g */
    private static volatile bxxk f28016g;

    /* renamed from: a */
    public int f28017a;

    /* renamed from: b */
    public aafn f28018b;

    /* renamed from: c */
    public aafm f28019c;

    /* renamed from: d */
    public aafq f28020d;

    /* renamed from: e */
    public aafp f28021e;

    static {
        aafk aafk = new aafk();
        f28015f = aafk;
        bxvk.m124024a(aafk.class, aafk);
    }

    private aafk() {
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
            return bxvk.m124022a(f28015f, "\u0001\u0004\u0000\u0001\u0001\u001d\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u001cဉ\u001a\u001dဉ\u001b", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aafk();
        } else {
            if (i2 == 4) {
                return new bxvd(f28015f);
            }
            if (i2 == 5) {
                return f28015f;
            }
            bxxk bxxk = f28016g;
            if (bxxk == null) {
                synchronized (aafk.class) {
                    bxxk = f28016g;
                    if (bxxk == null) {
                        bxxk = new bxve(f28015f);
                        f28016g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
