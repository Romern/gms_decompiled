package p000;

/* renamed from: bplf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bplf extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bplf f138075e;

    /* renamed from: f */
    private static volatile bxxk f138076f;

    /* renamed from: a */
    public int f138077a;

    /* renamed from: b */
    public int f138078b = 1;

    /* renamed from: c */
    public bplg f138079c;

    /* renamed from: d */
    public bpld f138080d;

    static {
        bplf bplf = new bplf();
        f138075e = bplf;
        bxvk.m124024a(bplf.class, bplf);
    }

    private bplf() {
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
            return bxvk.m124022a(f138075e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", bple.f138074a, "c", "d"});
        } else if (i2 == 3) {
            return new bplf();
        } else {
            if (i2 == 4) {
                return new bxvd(f138075e);
            }
            if (i2 == 5) {
                return f138075e;
            }
            bxxk bxxk = f138076f;
            if (bxxk == null) {
                synchronized (bplf.class) {
                    bxxk = f138076f;
                    if (bxxk == null) {
                        bxxk = new bxve(f138075e);
                        f138076f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
