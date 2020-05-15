package p000;

/* renamed from: sgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sgl extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final sgl f44414e;

    /* renamed from: f */
    private static volatile bxxk f44415f;

    /* renamed from: a */
    public String f44416a = "";

    /* renamed from: b */
    public int f44417b;

    /* renamed from: c */
    public bxwc f44418c = bxxn.f165040b;

    /* renamed from: d */
    public boolean f44419d;

    static {
        sgl sgl = new sgl();
        f44414e = sgl;
        GeneratedMessageLite.m124024a(sgl.class, sgl);
    }

    private sgl() {
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
            return GeneratedMessageLite.m124022a(f44414e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\u0007", new Object[]{"a", "b", "c", sgk.class, "d"});
        } else if (i2 == 3) {
            return new sgl();
        } else {
            if (i2 == 4) {
                return new bxvd(f44414e);
            }
            if (i2 == 5) {
                return f44414e;
            }
            bxxk bxxk = f44415f;
            if (bxxk == null) {
                synchronized (sgl.class) {
                    bxxk = f44415f;
                    if (bxxk == null) {
                        bxxk = new bxve(f44414e);
                        f44415f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
