package p000;

import java.util.Arrays;

/* renamed from: cyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cyj extends cyf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo8388a(String str, byte b, byte b2) {
        if (b == -33 && b2 > 0 && b2 <= 10) {
            return cyx.m7946b(b2 - 1);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final byte[] mo8391a(cyp cyp, String str) {
        boolean z;
        byte[] a = cyp.mo8399a(str);
        boolean z2 = false;
        if (a == null || a.length < 3) {
            z = true;
        } else {
            z = false;
        }
        cuu.CONDITIONS_OF_USE_NOT_SATISFIED.mo8315a(!cyp.mo8402c().mo8362a(cwj.ENABLE_IDDT));
        if (z) {
            return null;
        }
        cwm a2 = cwo.m7780a(a[1]);
        cuu cuu = cuu.SECURITY_STATUS_NOT_SATISFIED;
        if (!(cyp instanceof cyq) && a2.mo8362a(cwo.BEFORE_GPO_REQUIRED)) {
            z2 = true;
        }
        cuu.mo8315a(z2);
        return Arrays.copyOfRange(a, 2, a.length);
    }
}
