package p000;

/* renamed from: vvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vvy extends bxvk implements bxxd {

    /* renamed from: b */
    public static final vvy f50097b;

    /* renamed from: c */
    private static volatile bxxk f50098c;

    /* renamed from: a */
    public bxwc f50099a = bxxn.f165040b;

    static {
        vvy vvy = new vvy();
        f50097b = vvy;
        bxvk.m124024a(vvy.class, vvy);
    }

    private vvy() {
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
            return bxvk.m124022a(f50097b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", vvx.class});
        } else if (i2 == 3) {
            return new vvy();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f50097b;
            }
            bxxk bxxk = f50098c;
            if (bxxk == null) {
                synchronized (vvy.class) {
                    bxxk = f50098c;
                    if (bxxk == null) {
                        bxxk = new bxve(f50097b);
                        f50098c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo28908a() {
        if (!this.f50099a.mo73666a()) {
            this.f50099a = bxvk.m124021a(this.f50099a);
        }
    }
}
