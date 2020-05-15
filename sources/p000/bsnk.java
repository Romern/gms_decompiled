package p000;

/* renamed from: bsnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsnk extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bsnk f146259f;

    /* renamed from: g */
    private static volatile bxxk f146260g;

    /* renamed from: a */
    public ByteString f146261a = ByteString.f164797b;

    /* renamed from: b */
    public boolean f146262b;

    /* renamed from: c */
    public String f146263c = "";

    /* renamed from: d */
    public long f146264d;

    /* renamed from: e */
    public String f146265e = "";

    static {
        bsnk bsnk = new bsnk();
        f146259f = bsnk;
        GeneratedMessageLite.m124024a(bsnk.class, bsnk);
    }

    private bsnk() {
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
            return GeneratedMessageLite.m124022a(f146259f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\u0007\u0003Ȉ\u0004\u0002\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bsnk();
        } else {
            if (i2 == 4) {
                return new bxvd(f146259f);
            }
            if (i2 == 5) {
                return f146259f;
            }
            bxxk bxxk = f146260g;
            if (bxxk == null) {
                synchronized (bsnk.class) {
                    bxxk = f146260g;
                    if (bxxk == null) {
                        bxxk = new bxve(f146259f);
                        f146260g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
