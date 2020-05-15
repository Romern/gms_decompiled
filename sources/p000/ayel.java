package p000;

/* renamed from: ayel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayel extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final ayel f97321e;

    /* renamed from: f */
    private static volatile bxxk f97322f;

    /* renamed from: a */
    public int f97323a;

    /* renamed from: b */
    public ayek f97324b;

    /* renamed from: c */
    public ByteString f97325c = ByteString.f164797b;

    /* renamed from: d */
    public boolean f97326d;

    static {
        ayel ayel = new ayel();
        f97321e = ayel;
        GeneratedMessageLite.m124024a(ayel.class, ayel);
    }

    private ayel() {
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
            return GeneratedMessageLite.m124022a(f97321e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new ayel();
        } else {
            if (i2 == 4) {
                return new bxvd(f97321e);
            }
            if (i2 == 5) {
                return f97321e;
            }
            bxxk bxxk = f97322f;
            if (bxxk == null) {
                synchronized (ayel.class) {
                    bxxk = f97322f;
                    if (bxxk == null) {
                        bxxk = new bxve(f97321e);
                        f97322f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
