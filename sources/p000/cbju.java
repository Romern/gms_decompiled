package p000;

/* renamed from: cbju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbju extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbju f177369a;

    /* renamed from: b */
    private static volatile bxxk f177370b;

    static {
        cbju cbju = new cbju();
        f177369a = cbju;
        GeneratedMessageLite.m124024a(cbju.class, cbju);
    }

    private cbju() {
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
            return GeneratedMessageLite.m124022a(f177369a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbju();
        }
        if (i2 == 4) {
            return new bxvd(f177369a);
        }
        if (i2 == 5) {
            return f177369a;
        }
        bxxk bxxk = f177370b;
        if (bxxk == null) {
            synchronized (cbju.class) {
                bxxk = f177370b;
                if (bxxk == null) {
                    bxxk = new bxve(f177369a);
                    f177370b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
