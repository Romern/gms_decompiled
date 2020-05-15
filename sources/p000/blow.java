package p000;

/* renamed from: blow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blow extends bxvg implements bxvh {

    /* renamed from: a */
    public static final blow f127157a;

    /* renamed from: c */
    private static volatile bxxk f127158c;

    /* renamed from: b */
    private byte f127159b = 2;

    static {
        blow blow = new blow();
        f127157a = blow;
        bxvk.m124024a(blow.class, blow);
    }

    private blow() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127159b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f127159b = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127157a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new blow();
            }
            if (i2 == 4) {
                return new bxvf(f127157a);
            }
            if (i2 == 5) {
                return f127157a;
            }
            bxxk bxxk = f127158c;
            if (bxxk == null) {
                synchronized (blow.class) {
                    bxxk = f127158c;
                    if (bxxk == null) {
                        bxxk = new bxve(f127157a);
                        f127158c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
