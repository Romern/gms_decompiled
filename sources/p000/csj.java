package p000;

import java.util.Arrays;

/* renamed from: csj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class csj extends C0914csi {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo8206a(String str, byte b, byte b2) {
        if (b == -33 && b2 > 0 && b2 <= 10) {
            return ctm.m7556a(b2 - 1);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final byte[] mo8209a(csn csn, String str) {
        boolean z;
        byte[] a = csn.mo8215a(str);
        boolean z2 = false;
        if (a == null || a.length < 3) {
            z = true;
        } else {
            z = false;
        }
        css.CONDITIONS_OF_USE_NOT_SATISFIED.mo8229a(!csn.mo8212a().mo8463a(czt.ENABLE_IDDT));
        if (z) {
            return null;
        }
        czw a2 = czy.m8061a(a[1]);
        css css = css.SECURITY_STATUS_NOT_SATISFIED;
        if ((csn instanceof csp) && a2.mo8463a(czy.BEFORE_GPO_REQUIRED)) {
            z2 = true;
        }
        css.mo8229a(z2);
        return Arrays.copyOfRange(a, 2, a.length);
    }
}
