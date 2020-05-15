package p000;

/* renamed from: bwxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwxv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwxv f161421d;

    /* renamed from: e */
    private static volatile bxxk f161422e;

    /* renamed from: a */
    public int f161423a;

    /* renamed from: b */
    public bwxj f161424b;

    /* renamed from: c */
    public bwym f161425c;

    static {
        bwxv bwxv = new bwxv();
        f161421d = bwxv;
        GeneratedMessageLite.m124024a(bwxv.class, bwxv);
    }

    private bwxv() {
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
            return GeneratedMessageLite.m124022a(f161421d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwxv();
        } else {
            if (i2 == 4) {
                return new bxvd(f161421d);
            }
            if (i2 == 5) {
                return f161421d;
            }
            bxxk bxxk = f161422e;
            if (bxxk == null) {
                synchronized (bwxv.class) {
                    bxxk = f161422e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161421d);
                        f161422e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
