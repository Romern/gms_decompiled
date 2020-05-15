package p000;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: brsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brsb {

    /* renamed from: a */
    static final Map f143289a;

    static {
        HashMap hashMap = new HashMap();
        f143289a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        f143289a.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        f143289a.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        f143289a.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        f143289a.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    /* renamed from: a */
    public static Status m114520a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || !f143289a.containsKey(string)) {
                String valueOf = String.valueOf(str);
                return brrv.m114516a(valueOf.length() == 0 ? new String("WEB_INTERNAL_ERROR:") : "WEB_INTERNAL_ERROR:".concat(valueOf));
            }
            String str2 = (String) f143289a.get(string);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(string2).length());
            sb.append(str2);
            sb.append(":");
            sb.append(string2);
            return brrv.m114516a(sb.toString());
        } catch (JSONException e) {
            String localizedMessage = e.getLocalizedMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(localizedMessage).length());
            sb2.append("WEB_INTERNAL_ERROR:");
            sb2.append(str);
            sb2.append("[ ");
            sb2.append(localizedMessage);
            sb2.append(" ]");
            return brrv.m114516a(sb2.toString());
        }
    }

    /* renamed from: b */
    public static Status m114523b(Intent intent) {
        sdo.m34959a(intent);
        sdo.m34974b(m114522a(intent));
        return (Status) sef.m35067a(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    /* renamed from: a */
    public static void m114521a(Intent intent, Status status) {
        sef.m35071a(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    /* renamed from: a */
    public static boolean m114522a(Intent intent) {
        sdo.m34959a(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }
}
