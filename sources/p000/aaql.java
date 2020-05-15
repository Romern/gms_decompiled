package p000;

/* renamed from: aaql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaql extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final aaql f28916c;

    /* renamed from: f */
    private static volatile bxxk f28917f;

    /* renamed from: a */
    public int f28918a;

    /* renamed from: b */
    public aaqk f28919b;

    /* renamed from: d */
    private aaqp f28920d;

    /* renamed from: e */
    private byte f28921e = 2;

    static {
        aaql aaql = new aaql();
        f28916c = aaql;
        GeneratedMessageLite.m124024a(aaql.class, aaql);
    }

    private aaql() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f28921e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f28921e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f28916c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"a", "d", "b"});
        } else if (i2 == 3) {
            return new aaql();
        } else {
            if (i2 == 4) {
                return new bxvd(f28916c);
            }
            if (i2 == 5) {
                return f28916c;
            }
            bxxk bxxk = f28917f;
            if (bxxk == null) {
                synchronized (aaql.class) {
                    bxxk = f28917f;
                    if (bxxk == null) {
                        bxxk = new bxve(f28916c);
                        f28917f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
