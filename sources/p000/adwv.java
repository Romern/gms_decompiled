package p000;

import android.accounts.Account;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: adwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adwv {

    /* renamed from: a */
    private static adwv f62850a = null;

    /* renamed from: b */
    private final RequestQueue f62851b = Volley.newRequestQueue(rpr.m34216b());

    private adwv() {
    }

    /* renamed from: a */
    public static synchronized adwv m51294a() {
        adwv adwv;
        synchronized (adwv.class) {
            if (f62850a == null) {
                f62850a = new adwv();
            }
            adwv = f62850a;
        }
        return adwv;
    }

    /* renamed from: a */
    public final synchronized bqgg mo33876a(String str) {
        bqgy c;
        try {
            String a = gie.m13187a(rpr.m34216b(), new Account(str, "com.google"), "oauth2:email https://www.googleapis.com/auth/firebase.messaging");
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/json");
            hashMap.put("X-GFE-SSL", "yes");
            String valueOf = String.valueOf(a);
            hashMap.put("Authorization", valueOf.length() == 0 ? new String("OAuth ") : "OAuth ".concat(valueOf));
            try {
                String a2 = addi.m50206a(rpr.m34216b()).mo33343a(ceqz.m138035d(), "GCM");
                String x = ceqz.f183340a.mo6606a().mo79684x();
                String d = ceqz.m138035d();
                StringBuilder sb = new StringBuilder(String.valueOf(x).length() + 5 + String.valueOf(d).length());
                sb.append(x);
                sb.append(d);
                sb.append("/rel/");
                String sb2 = sb.toString();
                String valueOf2 = String.valueOf(a2);
                String str2 = valueOf2.length() == 0 ? new String("?&subscriber_token=") : "?&subscriber_token=".concat(valueOf2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 6 + String.valueOf(str2).length());
                sb3.append(sb2);
                sb3.append("topics");
                sb3.append(str2);
                String sb4 = sb3.toString();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("public_topic_name", "ulp");
                    c = bqgy.m112818c();
                    this.f62851b.add(new adwu(hashMap, sb4, jSONObject, new adws(c), new adwt(c)));
                } catch (JSONException e) {
                    return bqga.m112777a((Throwable) e);
                }
            } catch (IOException e2) {
                return bqga.m112777a((Throwable) e2);
            }
        } catch (gid | IOException e3) {
            return bqga.m112777a(e3);
        }
        return c;
    }
}
