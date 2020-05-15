package p000;

/* renamed from: btql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btql extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final btql f149970i;

    /* renamed from: j */
    private static volatile bxxk f149971j;

    /* renamed from: a */
    public String f149972a = "";

    /* renamed from: b */
    public String f149973b = "";

    /* renamed from: c */
    public String f149974c = "";

    /* renamed from: d */
    public int f149975d;

    /* renamed from: e */
    public String f149976e = "";

    /* renamed from: f */
    public String f149977f = "";

    /* renamed from: g */
    public int f149978g;

    /* renamed from: h */
    public String f149979h = "";

    static {
        btql btql = new btql();
        f149970i = btql;
        GeneratedMessageLite.m124024a(btql.class, btql);
    }

    private btql() {
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
            return GeneratedMessageLite.m124022a(f149970i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007\u0004\bȈ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new btql();
        } else {
            if (i2 == 4) {
                return new bxvd(f149970i);
            }
            if (i2 == 5) {
                return f149970i;
            }
            bxxk bxxk = f149971j;
            if (bxxk == null) {
                synchronized (btql.class) {
                    bxxk = f149971j;
                    if (bxxk == null) {
                        bxxk = new bxve(f149970i);
                        f149971j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
