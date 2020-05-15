package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.cmnctrl.net.DataParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bjym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjym {

    /* renamed from: a */
    final String f123646a;

    /* renamed from: b */
    final JSONArray f123647b;

    /* renamed from: c */
    private String f123648c;

    public bjym(String str, String str2) {
        JSONArray jSONArray;
        this.f123646a = str;
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONArray = new JSONArray(str2);
            } else {
                jSONArray = null;
            }
            this.f123647b = jSONArray;
        } catch (JSONException e) {
            throw new IllegalArgumentException("Could not parse json.", e);
        }
    }

    /* renamed from: a */
    public final String mo65639a() {
        String str;
        if (this.f123648c == null) {
            if (this.f123647b != null) {
                Uri.Builder builder = new Uri.Builder();
                int length = this.f123647b.length();
                for (int i = 0; i < length; i++) {
                    try {
                        JSONObject optJSONObject = this.f123647b.optJSONObject(i);
                        if (optJSONObject != null) {
                            builder.appendQueryParameter(optJSONObject.getString("name"), optJSONObject.getString("value"));
                        }
                    } catch (JSONException e) {
                        Log.e("HtmlFormContent", "Failed to parse JSON object", e);
                    }
                }
                str = builder.build().getEncodedQuery();
            } else {
                str = null;
            }
            this.f123648c = str;
        }
        return this.f123648c;
    }

    /* renamed from: b */
    public final boolean mo65640b() {
        return DataParser.CONNECT_TYPE_POST.equalsIgnoreCase(this.f123646a);
    }

    /* renamed from: c */
    public final boolean mo65641c() {
        if ("GET".equalsIgnoreCase(this.f123646a) || TextUtils.isEmpty(this.f123646a) || (mo65640b() && this.f123647b != null)) {
            return true;
        }
        return false;
    }
}
