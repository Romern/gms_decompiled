package p000;

/* renamed from: ajhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajhj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final ajhj f70648d;

    /* renamed from: e */
    private static volatile bxxk f70649e;

    /* renamed from: a */
    public int f70650a;

    /* renamed from: b */
    public ajhi f70651b;

    /* renamed from: c */
    public ajhi f70652c;

    static {
        ajhj ajhj = new ajhj();
        f70648d = ajhj;
        bxvk.m124024a(ajhj.class, ajhj);
    }

    private ajhj() {
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
            return bxvk.m124022a(f70648d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new ajhj();
        } else {
            if (i2 == 4) {
                return new bxvd(f70648d);
            }
            if (i2 == 5) {
                return f70648d;
            }
            bxxk bxxk = f70649e;
            if (bxxk == null) {
                synchronized (ajhj.class) {
                    bxxk = f70649e;
                    if (bxxk == null) {
                        bxxk = new bxve(f70648d);
                        f70649e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
