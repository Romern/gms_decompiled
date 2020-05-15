package p000;

import android.net.Uri;
import android.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: adad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adad {
    /* renamed from: a */
    public static bmxv m50067a(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        Uri uri;
        bmxy.m108581a(str);
        List c = bmyx.m108640a('.').mo66925c((CharSequence) str);
        if (c.size() < 3) {
            Log.w("IdTokenParser", "Malformed id token - incorrect number of parts");
            return bmvz.f131120a;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(boan.f132471e.mo68783a().mo68796b((CharSequence) c.get(1)), bmwy.f131158c));
                String string = jSONObject.getString("sub");
                Long l = null;
                if (jSONObject.has("name")) {
                    str2 = jSONObject.getString("name");
                } else {
                    str2 = null;
                }
                if (jSONObject.has("given_name")) {
                    str3 = jSONObject.getString("given_name");
                } else {
                    str3 = null;
                }
                if (jSONObject.has("family_name")) {
                    str4 = jSONObject.getString("family_name");
                } else {
                    str4 = null;
                }
                if (jSONObject.has("email")) {
                    str5 = jSONObject.getString("email");
                } else {
                    str5 = null;
                }
                if (jSONObject.has("picture")) {
                    uri = Uri.parse(jSONObject.getString("picture"));
                } else {
                    uri = null;
                }
                if (jSONObject.has("exp")) {
                    l = Long.valueOf(Long.parseLong(jSONObject.getString("exp")));
                }
                return bmxv.m108566b(new adac(string, bmxv.m108567c(str2), bmxv.m108567c(str3), bmxv.m108567c(str4), bmxv.m108567c(str5), bmxv.m108567c(uri), bmxv.m108567c(l)));
            } catch (JSONException e) {
                Log.e("IdTokenParser", "Malformed id token - could not decode payload from JSON");
                return bmvz.f131120a;
            }
        } catch (IllegalArgumentException e2) {
            Log.e("IdTokenParser", "Malformed id token - Base64URL decoding failed");
            return bmvz.f131120a;
        }
    }
}
