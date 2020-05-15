package p000;

/* renamed from: bznj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bznj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bznj f170716d;

    /* renamed from: e */
    private static volatile bxxk f170717e;

    /* renamed from: a */
    public int f170718a;

    /* renamed from: b */
    public bzmm f170719b;

    /* renamed from: c */
    public bzlm f170720c;

    static {
        bznj bznj = new bznj();
        f170716d = bznj;
        bxvk.m124024a(bznj.class, bznj);
    }

    private bznj() {
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
            return bxvk.m124022a(f170716d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bznj();
        } else {
            if (i2 == 4) {
                return new bxvd(f170716d);
            }
            if (i2 == 5) {
                return f170716d;
            }
            bxxk bxxk = f170717e;
            if (bxxk == null) {
                synchronized (bznj.class) {
                    bxxk = f170717e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170716d);
                        f170717e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
