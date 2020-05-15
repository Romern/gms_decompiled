package p000;

/* renamed from: btca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btca extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btca f148242b;

    /* renamed from: d */
    private static volatile bxxk f148243d;

    /* renamed from: a */
    public bxwc f148244a = bxxn.f165040b;

    /* renamed from: c */
    private byte f148245c = 2;

    static {
        btca btca = new btca();
        f148242b = btca;
        GeneratedMessageLite.m124024a(btca.class, btca);
    }

    private btca() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f148245c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f148245c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f148242b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", btbz.class});
        } else if (i2 == 3) {
            return new btca();
        } else {
            if (i2 == 4) {
                return new bxvd(f148242b);
            }
            if (i2 == 5) {
                return f148242b;
            }
            bxxk bxxk = f148243d;
            if (bxxk == null) {
                synchronized (btca.class) {
                    bxxk = f148243d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148242b);
                        f148243d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
