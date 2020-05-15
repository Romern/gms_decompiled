package p000;

/* renamed from: bodo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bodo extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bodo f132717f;

    /* renamed from: g */
    private static volatile bxxk f132718g;

    /* renamed from: a */
    public int f132719a;

    /* renamed from: b */
    public String f132720b = "";

    /* renamed from: c */
    public body f132721c;

    /* renamed from: d */
    public int f132722d;

    /* renamed from: e */
    public int f132723e;

    static {
        bodo bodo = new bodo();
        f132717f = bodo;
        GeneratedMessageLite.m124024a(bodo.class, bodo);
    }

    private bodo() {
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
            return GeneratedMessageLite.m124022a(f132717f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", bodn.f132716a});
        } else if (i2 == 3) {
            return new bodo();
        } else {
            if (i2 == 4) {
                return new bxvd(f132717f);
            }
            if (i2 == 5) {
                return f132717f;
            }
            bxxk bxxk = f132718g;
            if (bxxk == null) {
                synchronized (bodo.class) {
                    bxxk = f132718g;
                    if (bxxk == null) {
                        bxxk = new bxve(f132717f);
                        f132718g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
