package p000;

import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: brqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brqr {
    /* renamed from: a */
    public static long m114478a(String str) {
        sdo.m34977c(str);
        List c = bmyx.m108640a('.').mo66925c((CharSequence) str);
        if (c.size() < 2) {
            String valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() == 0 ? new String("Invalid idToken ") : "Invalid idToken ".concat(valueOf));
        }
        try {
            String str2 = new String(sqd.m35971c((String) c.get(1)), "UTF-8");
            brqs brqs = new brqs();
            JSONObject jSONObject = new JSONObject(str2);
            jSONObject.optString("iss");
            jSONObject.optString("aud");
            jSONObject.optString("sub");
            brqs.f143197a = Long.valueOf(jSONObject.optLong("iat"));
            brqs.f143198b = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return brqs.f143198b.longValue() - brqs.f143197a.longValue();
        } catch (JSONException e) {
            String valueOf2 = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 41);
            sb.append("Failed to read JwtToken from JSONObject. ");
            sb.append(valueOf2);
            throw new UnsupportedEncodingException(sb.toString());
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("Unable to decode token", e2);
        }
    }
}
