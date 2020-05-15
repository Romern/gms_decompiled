package p000;

/* renamed from: bmoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmoq extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bmoq f130246g;

    /* renamed from: h */
    private static volatile bxxk f130247h;

    /* renamed from: a */
    public int f130248a;

    /* renamed from: b */
    public bmno f130249b;

    /* renamed from: c */
    public String f130250c = "";

    /* renamed from: d */
    public bmnr f130251d;

    /* renamed from: e */
    public bxwc f130252e = bxxn.f165040b;

    /* renamed from: f */
    public int f130253f = 2;

    static {
        bmoq bmoq = new bmoq();
        f130246g = bmoq;
        GeneratedMessageLite.m124024a(bmoq.class, bmoq);
    }

    private bmoq() {
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
            return GeneratedMessageLite.m124022a(f130246g, "\u0001\u0005\u0000\u0001\u0003\u0007\u0005\u0000\u0001\u0000\u0003ဉ\u0000\u0004ဈ\u0001\u0005ဉ\u0002\u0006\u001b\u0007ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", bmno.class, "f", bmoo.f130245a});
        } else if (i2 == 3) {
            return new bmoq();
        } else {
            if (i2 == 4) {
                return new bxvd(f130246g);
            }
            if (i2 == 5) {
                return f130246g;
            }
            bxxk bxxk = f130247h;
            if (bxxk == null) {
                synchronized (bmoq.class) {
                    bxxk = f130247h;
                    if (bxxk == null) {
                        bxxk = new bxve(f130246g);
                        f130247h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
