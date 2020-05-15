package p000;

import android.accounts.Account;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: sdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sdv implements sbg {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r4 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (p000.C1591sdu.m34980a((java.lang.String) p000.rsv.f43628q.mo25081c(), r3) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (p000.C1591sdu.m34980a((java.lang.String) p000.rsv.f43629r.mo25081c(), r3) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return com.google.android.gms.common.ConnectionResult.f30063a;
     */
    /* renamed from: a */
    public final ConnectionResult mo25330a(GetServiceRequest getServiceRequest, ConnectionInfo connectionInfo) {
        String str;
        Account a = getServiceRequest.mo17822a();
        if (a == null) {
            a = getServiceRequest.f30234h;
        }
        int i = getServiceRequest.f30228b;
        if (a != null) {
            str = a.type;
        } else {
            str = null;
        }
        if (str != null) {
            boolean a2 = soz.m35790a(a, "com.google");
            if (!"cn.google".equals(str)) {
            }
        }
        return new ConnectionResult(16);
    }
}
