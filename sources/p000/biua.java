package p000;

/* renamed from: biua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biua extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final biua f121757e;

    /* renamed from: h */
    private static volatile bxxk f121758h;

    /* renamed from: a */
    public int f121759a;

    /* renamed from: b */
    public int f121760b;

    /* renamed from: c */
    public int f121761c;

    /* renamed from: d */
    public biue f121762d;

    /* renamed from: f */
    private biqx f121763f;

    /* renamed from: g */
    private byte f121764g = 2;

    static {
        biua biua = new biua();
        f121757e = biua;
        GeneratedMessageLite.m124024a(biua.class, biua);
    }

    private biua() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121764g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121764g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121757e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", "c", "d", "f"});
        } else if (i2 == 3) {
            return new biua();
        } else {
            if (i2 == 4) {
                return new bxvd(f121757e);
            }
            if (i2 == 5) {
                return f121757e;
            }
            bxxk bxxk = f121758h;
            if (bxxk == null) {
                synchronized (biua.class) {
                    bxxk = f121758h;
                    if (bxxk == null) {
                        bxxk = new bxve(f121757e);
                        f121758h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
