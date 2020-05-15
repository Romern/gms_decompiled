package p000;

/* renamed from: cbjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjs extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbjs f177362b;

    /* renamed from: c */
    private static volatile bxxk f177363c;

    /* renamed from: a */
    public cbjp f177364a;

    static {
        cbjs cbjs = new cbjs();
        f177362b = cbjs;
        GeneratedMessageLite.m124024a(cbjs.class, cbjs);
    }

    private cbjs() {
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
            return GeneratedMessageLite.m124022a(f177362b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbjs();
        } else {
            if (i2 == 4) {
                return new bxvd(f177362b);
            }
            if (i2 == 5) {
                return f177362b;
            }
            bxxk bxxk = f177363c;
            if (bxxk == null) {
                synchronized (cbjs.class) {
                    bxxk = f177363c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177362b);
                        f177363c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
