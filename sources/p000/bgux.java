package p000;

import android.content.Context;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.VolleyError;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.List;

/* renamed from: bgux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgux {

    /* renamed from: a */
    public static bguw f117614a;

    /* renamed from: b */
    private static final int[] f117615b = {13, 6, 20, 11, 8, 12, 5, 15, 16, 9, 4, 14, 19, 10, 18, 7, 17};

    /* renamed from: a */
    private static int m100086a(int i) {
        if (i == 0) {
            bgur.m100025c("GCoreUlr", "Received RPC response error but status code is OK.");
        }
        if (i < 0 || i > 16) {
            return 1;
        }
        return f117615b[i];
    }

    /* renamed from: b */
    public static void m100097b(long j) {
        StringBuilder sb = new StringBuilder(64);
        sb.append("UlrClearcutEvents.logGetSettingsRPCRequest(");
        sb.append(j);
        sb.append(")");
        sb.toString();
        if (m100096a()) {
            f117614a.mo63248b(j);
        }
    }

    /* renamed from: c */
    public static void m100103c(long j) {
        StringBuilder sb = new StringBuilder(64);
        sb.append("UlrClearcutEvents.logSetSettingsRPCRequest(");
        sb.append(j);
        sb.append(")");
        sb.toString();
        if (m100096a()) {
            f117614a.mo63251c(j);
        }
    }

    /* renamed from: d */
    public static void m100108d(long j) {
        StringBuilder sb = new StringBuilder(68);
        sb.append("UlrClearcutEvents.logGetUserSettingsRPCRequest(");
        sb.append(j);
        sb.append(")");
        sb.toString();
        if (m100096a()) {
            f117614a.mo63254d(j);
        }
    }

    /* renamed from: e */
    public static void m100113e(long j) {
        StringBuilder sb = new StringBuilder(76);
        sb.append("UlrClearcutEvents.logSetRemoteDeviceSettingsRPCRequest(");
        sb.append(j);
        sb.append(")");
        sb.toString();
        if (m100096a()) {
            f117614a.mo63257e(j);
        }
    }

    /* renamed from: f */
    public static void m100117f(Throwable th) {
        if (m100107c()) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("UlrClearcutEvents.logSetSettingsRPCResponse(false, ");
            sb.append(valueOf);
            sb.append(")");
            sb.toString();
            f117614a.mo63259f(m100119g(th));
        }
    }

    /* renamed from: g */
    private static int m100119g(Throwable th) {
        NetworkResponse networkResponse;
        String str;
        if (th instanceof gid) {
            return 21;
        }
        if (chcp.f188340a.mo6606a().mo85004f() && (th instanceof chuw)) {
            return m100086a(((chuw) th).f189236a.f189233s.f189211r);
        }
        if (th instanceof NoConnectionError) {
            return 2;
        }
        if (th instanceof NetworkError) {
            return 3;
        }
        if (!(!(th instanceof VolleyError) || (networkResponse = ((VolleyError) th).networkResponse) == null || (str = (String) networkResponse.headers.get("RPC-Canonical-Code")) == null)) {
            try {
                return m100086a(Integer.parseInt(str));
            } catch (NumberFormatException e) {
            }
        }
        return 1;
    }

    /* renamed from: a */
    static int m100087a(Boolean bool) {
        return bool.booleanValue() ? 2 : 3;
    }

    /* renamed from: b */
    public static void m100098b(Boolean bool, List list) {
        String valueOf = String.valueOf(bool);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("UlrClearcutEvents.logAirplaneModeChange(");
        sb.append(valueOf);
        sb.append(")");
        sb.toString();
        if (m100112d()) {
            bxvd da = bvql.f157381l.mo74144da();
            boolean booleanValue = bool.booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvql bvql = (bvql) da.f164949b;
            bvql.f157383a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bvql.f157392j = booleanValue;
            f117614a.mo63241a((bvql) da.mo74062i(), !bool.booleanValue() ? bvzk.AIRPLANE_MODE_OFF : bvzk.AIRPLANE_MODE_ON, list);
        }
    }

    /* renamed from: c */
    public static void m100104c(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 62 + String.valueOf(str2).length());
        sb.append("UlrClearcutEvents.logApiCallTryOptInRequest('");
        sb.append(str);
        sb.append("', '");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        sb.toString();
        if (m100096a() && m100102b()) {
            f117614a.mo63243a(bvyy.AC_TRY_OPT_IN_REQUEST, str, str2, i);
        }
    }

    /* renamed from: d */
    public static void m100109d(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 66 + String.valueOf(str2).length());
        sb.append("UlrClearcutEvents.logApiCallCancelUploadRequest('");
        sb.append(str);
        sb.append("', '");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        sb.toString();
        if (m100096a() && m100102b()) {
            f117614a.mo63243a(bvyy.AC_CANCEL_UPLOAD, str, str2, i);
        }
    }

    /* renamed from: e */
    public static void m100114e(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + String.valueOf(str2).length());
        sb.append("UlrClearcutEvents.logApiCallSendData('");
        sb.append(str);
        sb.append("', '");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        sb.toString();
        if (m100096a() && m100102b()) {
            f117614a.mo63243a(bvyy.AC_SEND_DATA, str, str2, i);
        }
    }

    /* renamed from: f */
    public static void m100118f(boolean z) {
        StringBuilder sb = new StringBuilder(62);
        sb.append("UlrClearcutEvents.logSetRemoteDeviceSettingsRPCResponse(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        if (m100096a()) {
            f117614a.mo63260f(z);
        }
    }

    /* renamed from: a */
    public static void m100088a(long j) {
        StringBuilder sb = new StringBuilder(68);
        sb.append("UlrClearcutEvents.logDeleteLocationsRPCRequest(");
        sb.append(j);
        sb.append(")");
        sb.toString();
        if (m100096a()) {
            f117614a.mo63239a(j);
        }
    }

    /* renamed from: a */
    public static void m100089a(long j, long j2, long j3, long j4) {
        StringBuilder sb = new StringBuilder(134);
        sb.append("UlrClearcutEvents.logReportLocationsRPCRequest(");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(")");
        sb.toString();
        if (m100096a()) {
            f117614a.mo63240a(j, j2, j3, j4);
        }
    }

    /* renamed from: c */
    public static void m100105c(Throwable th) {
        if (m100107c()) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
            sb.append("UlrClearcutEvents.logGetUserSettingsRPCResponse(false, ");
            sb.append(valueOf);
            sb.append(")");
            sb.toString();
            f117614a.mo63250c(m100119g(th));
        }
    }

    /* renamed from: d */
    public static void m100110d(Throwable th) {
        if (m100107c()) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
            sb.append("UlrClearcutEvents.logReportLocationsRPCResponse(false, ");
            sb.append(valueOf);
            sb.append(")");
            sb.toString();
            f117614a.mo63253d(m100119g(th));
        }
    }

    /* renamed from: e */
    public static void m100115e(Throwable th) {
        if (m100107c()) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
            sb.append("UlrClearcutEvents.logSetRemoteDeviceSettingsRPCResponse(false, ");
            sb.append(valueOf);
            sb.append(")");
            sb.toString();
            f117614a.mo63256e(m100119g(th));
        }
    }

    /* renamed from: c */
    public static void m100106c(boolean z) {
        StringBuilder sb = new StringBuilder(50);
        sb.append("UlrClearcutEvents.logGetSettingsRPCResponse(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        if (m100096a()) {
            f117614a.mo63252c(z);
        }
    }

    /* renamed from: d */
    public static void m100111d(boolean z) {
        StringBuilder sb = new StringBuilder(50);
        sb.append("UlrClearcutEvents.logSetSettingsRPCResponse(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        if (m100096a()) {
            f117614a.mo63255d(z);
        }
    }

    /* renamed from: a */
    public static synchronized void m100090a(Context context) {
        synchronized (bgux.class) {
            if (f117614a == null) {
                f117614a = new bguw(context);
            }
        }
    }

    /* renamed from: e */
    public static void m100116e(boolean z) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("UlrClearcutEvents.logGetUserSettingsRPCResponse(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        if (m100096a()) {
            f117614a.mo63258e(z);
        }
    }

    /* renamed from: b */
    public static void m100099b(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + String.valueOf(str2).length());
        sb.append("UlrClearcutEvents.logApiCallTryOptIn('");
        sb.append(str);
        sb.append("', '");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        sb.toString();
        if (m100096a() && m100102b()) {
            f117614a.mo63243a(bvyy.AC_TRY_OPT_IN, str, str2, i);
        }
    }

    /* renamed from: c */
    public static boolean m100107c() {
        return f117614a != null && chcy.m148488d();
    }

    /* renamed from: d */
    public static boolean m100112d() {
        return f117614a != null && chcd.m148153b();
    }

    /* renamed from: a */
    public static void m100091a(Boolean bool, List list) {
        String valueOf = String.valueOf(bool);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("UlrClearcutEvents.logWifiEnabledChange(");
        sb.append(valueOf);
        sb.append(")");
        sb.toString();
        if (m100112d()) {
            bxvd da = bvql.f157381l.mo74144da();
            boolean booleanValue = bool.booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvql bvql = (bvql) da.f164949b;
            bvql.f157383a |= 64;
            bvql.f157390h = booleanValue;
            f117614a.mo63241a((bvql) da.mo74062i(), !bool.booleanValue() ? bvzk.WIFI_DISABLED : bvzk.WIFI_ENABLED, list);
        }
    }

    /* renamed from: b */
    public static void m100100b(Throwable th) {
        if (!m100107c()) {
            return;
        }
        if (th != null) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("UlrClearcutEvents.logGetSettingsRPCResponse(false, ");
            sb.append(valueOf);
            sb.append(")");
            sb.toString();
            f117614a.mo63247b(m100119g(th));
            return;
        }
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append("UlrClearcutEvents.logGetSettingsRPCResponse(false, null)");
        sb2.toString();
        f117614a.mo63247b(1);
    }

    /* renamed from: b */
    public static void m100101b(boolean z) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("UlrClearcutEvents.logDeleteLocationsRPCResponse(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        if (m100096a()) {
            f117614a.mo63249b(z);
        }
    }

    /* renamed from: a */
    public static void m100092a(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65 + String.valueOf(str2).length());
        sb.append("UlrClearcutEvents.logApiCallGetReportingState('");
        sb.append(str);
        sb.append("', '");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        sb.append(")");
        sb.toString();
        if (m100096a() && m100102b()) {
            f117614a.mo63243a(bvyy.AC_GET_REPORTING_STATE_SAFE, str, str2, i);
        }
    }

    /* renamed from: b */
    public static boolean m100102b() {
        return f117614a != null && chcs.m148232d();
    }

    /* renamed from: a */
    public static void m100093a(String str, String str2, UploadRequest uploadRequest, UploadRequestResult uploadRequestResult) {
        String valueOf = String.valueOf(uploadRequest);
        String valueOf2 = String.valueOf(uploadRequestResult);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 55 + length2 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("UlrClearcutEvents.logApiCallRequestUpload('");
        sb.append(str);
        sb.append("', '");
        sb.append(str2);
        sb.append(", <");
        sb.append(valueOf);
        sb.append(">, <");
        sb.append(valueOf2);
        sb.append(">");
        sb.toString();
        if (m100096a() && m100102b()) {
            f117614a.mo63244a(bvyy.AC_REQUEST_UPLOAD, str, str2, uploadRequest, uploadRequestResult);
        }
    }

    /* renamed from: a */
    public static void m100094a(Throwable th) {
        if (m100107c()) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
            sb.append("UlrClearcutEvents.logDeleteLocationsRPCResponse(false, ");
            sb.append(valueOf);
            sb.append(")");
            sb.toString();
            f117614a.mo63237a(m100119g(th));
        }
    }

    /* renamed from: a */
    public static void m100095a(boolean z) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("UlrClearcutEvents.logReportLocationsRPCResponse(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        if (m100096a()) {
            f117614a.mo63246a(z);
        }
    }

    /* renamed from: a */
    public static boolean m100096a() {
        return f117614a != null && chcs.f188354a.mo6606a().mo85121x();
    }
}
