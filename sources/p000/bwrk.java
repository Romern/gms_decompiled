package p000;

/* renamed from: bwrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwrk extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bwrk f160769f;

    /* renamed from: g */
    private static volatile bxxk f160770g;

    /* renamed from: a */
    public int f160771a;

    /* renamed from: b */
    public bxvw f160772b = bxwq.f165002b;

    /* renamed from: c */
    public ByteString f160773c = ByteString.f164797b;

    /* renamed from: d */
    public int f160774d;

    /* renamed from: e */
    public bxvw f160775e = bxwq.f165002b;

    static {
        bwrk bwrk = new bwrk();
        f160769f = bwrk;
        GeneratedMessageLite.m124024a(bwrk.class, bwrk);
    }

    private bwrk() {
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
            return GeneratedMessageLite.m124022a(f160769f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0014\u0002ည\u0001\u0003ဌ\u0002\u0004\u0014", new Object[]{"a", "b", "c", "d", bwri.f160768a, "e"});
        } else if (i2 == 3) {
            return new bwrk();
        } else {
            if (i2 == 4) {
                return new bxvd(f160769f);
            }
            if (i2 == 5) {
                return f160769f;
            }
            bxxk bxxk = f160770g;
            if (bxxk == null) {
                synchronized (bwrk.class) {
                    bxxk = f160770g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160769f);
                        f160770g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
