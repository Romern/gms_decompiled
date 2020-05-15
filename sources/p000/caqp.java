package p000;

import java.util.Arrays;

/* renamed from: caqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caqp {

    /* renamed from: a */
    public static final byte[] f175585a = {8, 64};

    /* renamed from: b */
    public static final byte[] f175586b = {0, 0};

    /* renamed from: c */
    private static cara f175587c = null;

    /* renamed from: a */
    private static byte[] m126985a() {
        casb casb = f175587c.f175653o.f175729b;
        if (f175587c.f175642d.f175556h) {
            return casb.mo74804h().f175724b;
        }
        return casb.f175730a.f175742a.f175733b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (java.util.Arrays.equals(r2, p000.caqp.f175586b) != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        if (java.util.Arrays.equals(r7, new byte[r2]) == false) goto L_0x0071;
     */
    /* renamed from: a */
    public static synchronized byte[] m126986a(caoq caoq, cara cara) {
        byte[] a;
        synchronized (caqp.class) {
            f175587c = cara;
            cara.f175642d.f175558j = caoq.f175499d;
            try {
                byte[] a2 = m126985a();
                int length = m126985a().length;
                byte[] bArr = new byte[length];
                System.arraycopy(a2, 0, bArr, 0, length);
                byte[] bArr2 = caoq.f175498c;
                if (bArr2 != null) {
                    if (bArr2.length != 0) {
                        if (Arrays.equals(bArr2, f175585a)) {
                        }
                        boolean z = f175587c.f175649k;
                        casb casb = f175587c.f175653o.f175729b;
                        byte[] b = casb.mo74798b();
                        byte[] f = casb.mo74802f();
                        if (!(b == null || b.length == 0 || f == null || f.length == 0)) {
                            byte[] bArr3 = caoq.f175497b;
                            if (bArr3 != null) {
                                int length2 = bArr3.length;
                                if (length2 != 0) {
                                }
                            }
                            bArr[4] = (byte) (bArr[4] & 255);
                            bArr[5] = (byte) (bArr[5] & Byte.MAX_VALUE);
                        }
                    }
                }
                caqk caqk = f175587c.f175642d;
                byte[] bArr4 = new byte[2];
                System.arraycopy(bArr, 4, bArr4, 0, 2);
                caqk.f175557i = bArr4;
                a = caor.m126889a(bArr);
                cara.f175650l = new carb(cara.f175646h, cara);
                f175587c = null;
            } catch (capg | NullPointerException e) {
                f175587c = null;
                throw new capk("Invalid GPO Response");
            }
        }
        return a;
    }
}
