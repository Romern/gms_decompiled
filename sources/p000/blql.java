package p000;

/* renamed from: blql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blql extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final blql f127360g;

    /* renamed from: i */
    private static volatile bxxk f127361i;

    /* renamed from: a */
    public int f127362a;

    /* renamed from: b */
    public blrk f127363b;

    /* renamed from: c */
    public blou f127364c;

    /* renamed from: d */
    public blox f127365d;

    /* renamed from: e */
    public blrj f127366e;

    /* renamed from: f */
    public blrb f127367f;

    /* renamed from: h */
    private byte f127368h = 2;

    static {
        blql blql = new blql();
        f127360g = blql;
        GeneratedMessageLite.m124024a(blql.class, blql);
    }

    private blql() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127368h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127368h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127360g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0006ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new blql();
        } else {
            if (i2 == 4) {
                return new bxvd(f127360g);
            }
            if (i2 == 5) {
                return f127360g;
            }
            bxxk bxxk = f127361i;
            if (bxxk == null) {
                synchronized (blql.class) {
                    bxxk = f127361i;
                    if (bxxk == null) {
                        bxxk = new bxve(f127360g);
                        f127361i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
