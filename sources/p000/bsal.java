package p000;

/* renamed from: bsal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsal extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bsal f143866d;

    /* renamed from: f */
    private static volatile bxxk f143867f;

    /* renamed from: a */
    public int f143868a;

    /* renamed from: b */
    public int f143869b;

    /* renamed from: c */
    public int f143870c;

    /* renamed from: e */
    private byte f143871e = 2;

    static {
        bsal bsal = new bsal();
        f143866d = bsal;
        GeneratedMessageLite.m124024a(bsal.class, bsal);
    }

    private bsal() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f143871e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f143871e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f143866d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔆ\u0000\u0002ᔆ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bsal();
        } else {
            if (i2 == 4) {
                return new bxvd(f143866d);
            }
            if (i2 == 5) {
                return f143866d;
            }
            bxxk bxxk = f143867f;
            if (bxxk == null) {
                synchronized (bsal.class) {
                    bxxk = f143867f;
                    if (bxxk == null) {
                        bxxk = new bxve(f143866d);
                        f143867f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
