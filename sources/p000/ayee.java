package p000;

/* renamed from: ayee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayee extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final ayee f97286c;

    /* renamed from: e */
    private static volatile bxxk f97287e;

    /* renamed from: a */
    public int f97288a;

    /* renamed from: b */
    public String f97289b;

    /* renamed from: d */
    private byte f97290d = 2;

    static {
        ayee ayee = new ayee();
        f97286c = ayee;
        GeneratedMessageLite.m124024a(ayee.class, ayee);
    }

    private ayee() {
        ByteString bxtx = bxtx.f164797b;
        this.f97289b = "";
        bxxn bxxn = bxxn.f165040b;
        bxwq bxwq = bxwq.f165002b;
        bxuz bxuz = bxuz.f164939b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f97290d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f97290d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f97286c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဈ\u0003", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new ayee();
        } else {
            if (i2 == 4) {
                return new bxvd(f97286c);
            }
            if (i2 == 5) {
                return f97286c;
            }
            bxxk bxxk = f97287e;
            if (bxxk == null) {
                synchronized (ayee.class) {
                    bxxk = f97287e;
                    if (bxxk == null) {
                        bxxk = new bxve(f97286c);
                        f97287e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
