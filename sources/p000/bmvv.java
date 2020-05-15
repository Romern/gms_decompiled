package p000;

/* renamed from: bmvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvv extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmvv f131113e;

    /* renamed from: f */
    private static volatile bxxk f131114f;

    /* renamed from: a */
    public int f131115a;

    /* renamed from: b */
    public String f131116b = "";

    /* renamed from: c */
    public String f131117c = "";

    /* renamed from: d */
    public bmvp f131118d;

    static {
        bmvv bmvv = new bmvv();
        f131113e = bmvv;
        bxvk.m124024a(bmvv.class, bmvv);
    }

    private bmvv() {
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
            return bxvk.m124022a(f131113e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဉ\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmvv();
        } else {
            if (i2 == 4) {
                return new bxvd(f131113e);
            }
            if (i2 == 5) {
                return f131113e;
            }
            bxxk bxxk = f131114f;
            if (bxxk == null) {
                synchronized (bmvv.class) {
                    bxxk = f131114f;
                    if (bxxk == null) {
                        bxxk = new bxve(f131113e);
                        f131114f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
