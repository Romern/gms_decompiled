package p000;

/* renamed from: body */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class body extends bxvk implements bxxd {

    /* renamed from: e */
    public static final body f132751e;

    /* renamed from: f */
    private static volatile bxxk f132752f;

    /* renamed from: a */
    public int f132753a;

    /* renamed from: b */
    public int f132754b;

    /* renamed from: c */
    public long f132755c;

    /* renamed from: d */
    public long f132756d;

    static {
        body body = new body();
        f132751e = body;
        bxvk.m124024a(body.class, body);
    }

    private body() {
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
            return bxvk.m124022a(f132751e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", bodx.f132750a, "c", "d"});
        } else if (i2 == 3) {
            return new body();
        } else {
            if (i2 == 4) {
                return new bxvd(f132751e);
            }
            if (i2 == 5) {
                return f132751e;
            }
            bxxk bxxk = f132752f;
            if (bxxk == null) {
                synchronized (body.class) {
                    bxxk = f132752f;
                    if (bxxk == null) {
                        bxxk = new bxve(f132751e);
                        f132752f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
