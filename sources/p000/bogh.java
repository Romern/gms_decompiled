package p000;

/* renamed from: bogh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bogh extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bogh f132984e;

    /* renamed from: f */
    private static volatile bxxk f132985f;

    /* renamed from: a */
    public int f132986a;

    /* renamed from: b */
    public boolean f132987b;

    /* renamed from: c */
    public int f132988c;

    /* renamed from: d */
    public int f132989d;

    static {
        bogh bogh = new bogh();
        f132984e = bogh;
        bxvk.m124024a(bogh.class, bogh);
    }

    private bogh() {
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
            return bxvk.m124022a(f132984e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bogh();
        } else {
            if (i2 == 4) {
                return new bxvd(f132984e);
            }
            if (i2 == 5) {
                return f132984e;
            }
            bxxk bxxk = f132985f;
            if (bxxk == null) {
                synchronized (bogh.class) {
                    bxxk = f132985f;
                    if (bxxk == null) {
                        bxxk = new bxve(f132984e);
                        f132985f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
