package p000;

/* renamed from: cbml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbml extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbml f177642c;

    /* renamed from: d */
    private static volatile bxxk f177643d;

    /* renamed from: a */
    public int f177644a;

    /* renamed from: b */
    public ByteString f177645b = ByteString.f164797b;

    static {
        cbml cbml = new cbml();
        f177642c = cbml;
        GeneratedMessageLite.m124024a(cbml.class, cbml);
    }

    private cbml() {
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
            return GeneratedMessageLite.m124022a(f177642c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbml();
        } else {
            if (i2 == 4) {
                return new bxvd(f177642c);
            }
            if (i2 == 5) {
                return f177642c;
            }
            bxxk bxxk = f177643d;
            if (bxxk == null) {
                synchronized (cbml.class) {
                    bxxk = f177643d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177642c);
                        f177643d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
