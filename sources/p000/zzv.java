package p000;

/* renamed from: zzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zzv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final zzv f56346b;

    /* renamed from: c */
    private static volatile bxxk f56347c;

    /* renamed from: a */
    public bxwc f56348a = bxxn.f165040b;

    static {
        zzv zzv = new zzv();
        f56346b = zzv;
        GeneratedMessageLite.m124024a(zzv.class, zzv);
    }

    private zzv() {
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
            return GeneratedMessageLite.m124022a(f56346b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", zzu.class});
        } else if (i2 == 3) {
            return new zzv();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f56346b;
            }
            bxxk bxxk = f56347c;
            if (bxxk == null) {
                synchronized (zzv.class) {
                    bxxk = f56347c;
                    if (bxxk == null) {
                        bxxk = new bxve(f56346b);
                        f56347c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
