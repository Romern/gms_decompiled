package p000;

/* renamed from: boro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boro extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final boro f134462h;

    /* renamed from: i */
    private static volatile bxxk f134463i;

    /* renamed from: a */
    public int f134464a;

    /* renamed from: b */
    public String f134465b = "";

    /* renamed from: c */
    public String f134466c = "";

    /* renamed from: d */
    public int f134467d;

    /* renamed from: e */
    public int f134468e;

    /* renamed from: f */
    public int f134469f;

    /* renamed from: g */
    public boolean f134470g;

    static {
        boro boro = new boro();
        f134462h = boro;
        GeneratedMessageLite.m124024a(boro.class, boro);
    }

    private boro() {
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
            return GeneratedMessageLite.m124022a(f134462h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0005\u0006င\u0004", new Object[]{"a", "b", "c", "d", "e", "g", "f"});
        } else if (i2 == 3) {
            return new boro();
        } else {
            if (i2 == 4) {
                return new bxvd(f134462h);
            }
            if (i2 == 5) {
                return f134462h;
            }
            bxxk bxxk = f134463i;
            if (bxxk == null) {
                synchronized (boro.class) {
                    bxxk = f134463i;
                    if (bxxk == null) {
                        bxxk = new bxve(f134462h);
                        f134463i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
