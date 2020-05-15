package p000;

import android.content.Context;
import com.android.volley.DefaultRetryPolicy;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jlp {
    /* renamed from: a */
    public static bqgg m16887a(Context context, String str, String str2) {
        try {
            String a = gie.m13189a(context, str, "oauth2:email https://www.googleapis.com/auth/firebase.messaging");
            String c = cchx.m129771c();
            try {
                String a2 = addi.m50206a(context).mo33343a(c, "GCM");
                String e = cchx.f179022a.mo6606a().mo75994e();
                StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 29 + String.valueOf(c).length() + String.valueOf(a2).length());
                sb.append(e);
                sb.append(c);
                sb.append("/rel/topics?subscriber_token=");
                sb.append(a2);
                String sb2 = sb.toString();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("public_topic_name", str2);
                    bqgy c2 = bqgy.m112818c();
                    HashMap hashMap = new HashMap();
                    hashMap.put("Content-Type", "application/json");
                    hashMap.put("X-GFE-SSL", "yes");
                    String valueOf = String.valueOf(a);
                    hashMap.put("Authorization", valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf));
                    jlo jlo = new jlo(sb2, hashMap, jSONObject, new jlm(c2), new jln(c2));
                    jlo.setRetryPolicy(new DefaultRetryPolicy(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS, (int) cchx.m129770b(), 1.0f));
                    rpr.m34216b().getRequestQueue().add(jlo);
                    return c2;
                } catch (JSONException e2) {
                    return bqga.m112777a((Throwable) e2);
                }
            } catch (IOException e3) {
                return bqga.m112777a((Throwable) e3);
            }
        } catch (gid | IOException e4) {
            return bqga.m112777a(e4);
        }
    }
}
