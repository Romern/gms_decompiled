package p000;

/* renamed from: bpcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpcw extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpcw f135877e;

    /* renamed from: f */
    private static volatile bxxk f135878f;

    /* renamed from: a */
    public int f135879a;

    /* renamed from: b */
    public long f135880b;

    /* renamed from: c */
    public int f135881c;

    /* renamed from: d */
    public int f135882d;

    static {
        bpcw bpcw = new bpcw();
        f135877e = bpcw;
        bxvk.m124024a(bpcw.class, bpcw);
    }

    private bpcw() {
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
            return bxvk.m124022a(f135877e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpcw();
        } else {
            if (i2 == 4) {
                return new bxvd(f135877e);
            }
            if (i2 == 5) {
                return f135877e;
            }
            bxxk bxxk = f135878f;
            if (bxxk == null) {
                synchronized (bpcw.class) {
                    bxxk = f135878f;
                    if (bxxk == null) {
                        bxxk = new bxve(f135877e);
                        f135878f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
