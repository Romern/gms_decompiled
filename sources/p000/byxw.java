package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: byxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxw extends bxvk implements bxxd {

    /* renamed from: a */
    public static final byxw f168824a;

    /* renamed from: f */
    private static volatile bxxk f168825f;

    /* renamed from: b */
    private int f168826b;

    /* renamed from: c */
    private int f168827c;

    /* renamed from: d */
    private int f168828d = MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED;

    /* renamed from: e */
    private double f168829e = 1.5d;

    static {
        byxw byxw = new byxw();
        f168824a = byxw;
        bxvk.m124024a(byxw.class, byxw);
    }

    private byxw() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m125466a(byxw byxw) {
        byxw.f168826b |= 1;
        byxw.f168827c = 0;
    }

    /* renamed from: b */
    public static /* synthetic */ void m125467b(byxw byxw) {
        byxw.f168826b |= 2;
        byxw.f168828d = MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED;
    }

    /* renamed from: c */
    public static /* synthetic */ void m125468c(byxw byxw) {
        byxw.f168826b |= 4;
        byxw.f168829e = 1.5d;
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
            return bxvk.m124022a(f168824a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003က\u0002", new Object[]{"b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new byxw();
        } else {
            if (i2 == 4) {
                return new bxvd(f168824a);
            }
            if (i2 == 5) {
                return f168824a;
            }
            bxxk bxxk = f168825f;
            if (bxxk == null) {
                synchronized (byxw.class) {
                    bxxk = f168825f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168824a);
                        f168825f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
