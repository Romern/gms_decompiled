package p000;

/* renamed from: ayua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayua extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final ayua f98489c;

    /* renamed from: d */
    private static volatile bxxk f98490d;

    /* renamed from: a */
    public int f98491a;

    /* renamed from: b */
    public String f98492b = "";

    static {
        ayua ayua = new ayua();
        f98489c = ayua;
        GeneratedMessageLite.m124024a(ayua.class, ayua);
    }

    private ayua() {
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
            return GeneratedMessageLite.m124022a(f98489c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new ayua();
        } else {
            if (i2 == 4) {
                return new bxvd(f98489c);
            }
            if (i2 == 5) {
                return f98489c;
            }
            bxxk bxxk = f98490d;
            if (bxxk == null) {
                synchronized (ayua.class) {
                    bxxk = f98490d;
                    if (bxxk == null) {
                        bxxk = new bxve(f98489c);
                        f98490d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
