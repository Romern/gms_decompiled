package p000;

/* renamed from: cbdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbdr extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cbdr f176775f;

    /* renamed from: g */
    private static volatile bxxk f176776g;

    /* renamed from: a */
    public ByteString f176777a = ByteString.f164797b;

    /* renamed from: b */
    public int f176778b;

    /* renamed from: c */
    public int f176779c;

    /* renamed from: d */
    public bzrt f176780d;

    /* renamed from: e */
    public String f176781e = "";

    static {
        cbdr cbdr = new cbdr();
        f176775f = cbdr;
        GeneratedMessageLite.m124024a(cbdr.class, cbdr);
    }

    private cbdr() {
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
            return GeneratedMessageLite.m124022a(f176775f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\u0004\u0004\t\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cbdr();
        } else {
            if (i2 == 4) {
                return new bxvd(f176775f);
            }
            if (i2 == 5) {
                return f176775f;
            }
            bxxk bxxk = f176776g;
            if (bxxk == null) {
                synchronized (cbdr.class) {
                    bxxk = f176776g;
                    if (bxxk == null) {
                        bxxk = new bxve(f176775f);
                        f176776g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
