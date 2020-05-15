package p000;

/* renamed from: cbqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbqv f178075d;

    /* renamed from: f */
    private static volatile bxxk f178076f;

    /* renamed from: a */
    public cbql f178077a;

    /* renamed from: b */
    public bxwc f178078b = bxxn.f165040b;

    /* renamed from: c */
    public cbrc f178079c;

    /* renamed from: e */
    private byte f178080e = 2;

    static {
        cbqv cbqv = new cbqv();
        f178075d = cbqv;
        GeneratedMessageLite.m124024a(cbqv.class, cbqv);
    }

    private cbqv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f178080e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f178080e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f178075d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002\t\u0003\t", new Object[]{"b", cbrb.class, "c", "a"});
        } else if (i2 == 3) {
            return new cbqv();
        } else {
            if (i2 == 4) {
                return new bxvd(f178075d);
            }
            if (i2 == 5) {
                return f178075d;
            }
            bxxk bxxk = f178076f;
            if (bxxk == null) {
                synchronized (cbqv.class) {
                    bxxk = f178076f;
                    if (bxxk == null) {
                        bxxk = new bxve(f178075d);
                        f178076f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
