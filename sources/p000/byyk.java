package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: byyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyk extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byyk f168943e;

    /* renamed from: f */
    private static volatile bxxk f168944f;

    /* renamed from: a */
    public int f168945a;

    /* renamed from: b */
    public long f168946b = 172800000;

    /* renamed from: c */
    public long f168947c = 86400000;

    /* renamed from: d */
    public int f168948d = BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;

    static {
        byyk byyk = new byyk();
        f168943e = byyk;
        GeneratedMessageLite.m124024a(byyk.class, byyk);
    }

    private byyk() {
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
            return GeneratedMessageLite.m124022a(f168943e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new byyk();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f168943e;
            }
            bxxk bxxk = f168944f;
            if (bxxk == null) {
                synchronized (byyk.class) {
                    bxxk = f168944f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168943e);
                        f168944f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
