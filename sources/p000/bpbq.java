package p000;

/* renamed from: bpbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpbq extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpbq f135610e;

    /* renamed from: f */
    private static volatile bxxk f135611f;

    /* renamed from: a */
    public int f135612a;

    /* renamed from: b */
    public int f135613b = 0;

    /* renamed from: c */
    public Object f135614c;

    /* renamed from: d */
    public int f135615d;

    static {
        bpbq bpbq = new bpbq();
        f135610e = bpbq;
        GeneratedMessageLite.m124024a(bpbq.class, bpbq);
    }

    private bpbq() {
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
            return GeneratedMessageLite.m124022a(f135610e, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဿ\u0000\u0003ဿ\u0000\u0004ဿ\u0000\u0005ဿ\u0000\u0006ြ\u0000", new Object[]{"c", "b", "a", "d", bpbm.f135607a, bpbo.f135609a, bpbk.f135605a, bpbn.f135608a, bpbl.f135606a, boyt.class});
        } else if (i2 == 3) {
            return new bpbq();
        } else {
            if (i2 == 4) {
                return new bxvd(f135610e);
            }
            if (i2 == 5) {
                return f135610e;
            }
            bxxk bxxk = f135611f;
            if (bxxk == null) {
                synchronized (bpbq.class) {
                    bxxk = f135611f;
                    if (bxxk == null) {
                        bxxk = new bxve(f135610e);
                        f135611f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
