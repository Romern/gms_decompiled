package p000;

/* renamed from: boml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boml extends bxvk implements bxxd {

    /* renamed from: d */
    public static final boml f133668d;

    /* renamed from: e */
    private static volatile bxxk f133669e;

    /* renamed from: a */
    public long f133670a;

    /* renamed from: b */
    public int f133671b;

    /* renamed from: c */
    public int f133672c;

    static {
        boml boml = new boml();
        f133668d = boml;
        bxvk.m124024a(boml.class, boml);
    }

    private boml() {
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
            return bxvk.m124022a(f133668d, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0000\u0000\u0001\u0003\u0002\u000b\u0005\u000b", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new boml();
        } else {
            if (i2 == 4) {
                return new bxvd(f133668d);
            }
            if (i2 == 5) {
                return f133668d;
            }
            bxxk bxxk = f133669e;
            if (bxxk == null) {
                synchronized (boml.class) {
                    bxxk = f133669e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133668d);
                        f133669e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
