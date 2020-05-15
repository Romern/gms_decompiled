package p000;

/* renamed from: boex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boex extends bxvk implements bxxd {

    /* renamed from: e */
    public static final boex f132861e;

    /* renamed from: f */
    private static volatile bxxk f132862f;

    /* renamed from: a */
    public int f132863a;

    /* renamed from: b */
    public boolean f132864b;

    /* renamed from: c */
    public boolean f132865c;

    /* renamed from: d */
    public long f132866d;

    static {
        boex boex = new boex();
        f132861e = boex;
        bxvk.m124024a(boex.class, boex);
    }

    private boex() {
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
            return bxvk.m124022a(f132861e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဃ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new boex();
        } else {
            if (i2 == 4) {
                return new bxvd(f132861e);
            }
            if (i2 == 5) {
                return f132861e;
            }
            bxxk bxxk = f132862f;
            if (bxxk == null) {
                synchronized (boex.class) {
                    bxxk = f132862f;
                    if (bxxk == null) {
                        bxxk = new bxve(f132861e);
                        f132862f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
