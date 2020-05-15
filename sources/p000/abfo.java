package p000;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.common.HelpConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: abfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abfo {

    /* renamed from: f */
    private static final bnic f57349f = bnic.m109491a(0, 1, 2);

    /* renamed from: a */
    public final int f57350a;

    /* renamed from: b */
    public final String f57351b;

    /* renamed from: c */
    public final String f57352c;

    /* renamed from: d */
    public final String f57353d;

    /* renamed from: e */
    public final String f57354e;

    public abfo(int i, String str, String str2, String str3, String str4) {
        this.f57350a = !f57349f.contains(Integer.valueOf(i)) ? -1 : i;
        this.f57351b = str;
        this.f57352c = str2;
        this.f57353d = str3;
        this.f57354e = str4;
    }

    /* renamed from: a */
    private static final boolean m47628a(JSONArray jSONArray, String str) {
        if (jSONArray.getInt(1) != 79 || !jSONArray.getJSONObject(3).getString("t").equals(str)) {
            return false;
        }
        return true;
    }

    public abfo(String str) {
        this.f57350a = 0;
        this.f57351b = str;
        String obj = !TextUtils.isEmpty(str) ? Html.fromHtml(str).toString() : "";
        this.f57352c = obj;
        this.f57353d = obj;
        this.f57354e = null;
    }

    public abfo(JSONArray jSONArray, Context context, HelpConfig helpConfig) {
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray2.getInt(1) == 0) {
            this.f57350a = 0;
            String string = jSONArray2.getString(0);
            this.f57351b = string;
            String obj = Html.fromHtml(string).toString();
            this.f57352c = obj;
            this.f57353d = obj;
            this.f57354e = null;
        } else if (m47628a(jSONArray2, "HELP_ARTICLE")) {
            JSONObject jSONObject = jSONArray2.getJSONObject(3);
            this.f57350a = 1;
            this.f57351b = jSONArray2.getString(0);
            JSONObject jSONObject2 = jSONObject.getJSONObject("p");
            this.f57353d = jSONObject2.getString("url");
            this.f57354e = null;
            this.f57352c = jSONObject2.has("query") ? jSONObject2.getString("query") : jSONObject.getString("l");
        } else if (helpConfig != null && m47628a(jSONArray2, "HELP_ACTION")) {
            JSONObject jSONObject3 = jSONArray2.getJSONObject(3).getJSONObject("p");
            String string2 = jSONObject3.getString("result");
            Boolean valueOf = Boolean.valueOf(Boolean.parseBoolean(jSONObject3.getString("experimental")));
            aasm b = aasm.m46897b(string2, "");
            if (b != null && (!valueOf.booleanValue() || ceem.f182551a.mo6606a().mo79035a())) {
                String[] split = TextUtils.split(jSONObject3.getString("clients"), "\\|");
                int length = split.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (!TextUtils.equals(split[i], "ANDROID_GMH")) {
                        i++;
                    } else if (new aasq(context).mo31746a(b) && (b.mo31732o() || b.mo31731n() || b.mo31730m())) {
                        this.f57350a = 2;
                        this.f57351b = jSONArray2.getString(0);
                        this.f57352c = jSONArray2.getJSONObject(3).getString("l");
                        this.f57353d = jSONObject3.getString("url");
                        this.f57354e = string2;
                        return;
                    }
                }
            }
            this.f57350a = -1;
            this.f57351b = null;
            this.f57352c = null;
            this.f57353d = null;
            this.f57354e = null;
        } else {
            this.f57350a = -1;
            this.f57351b = null;
            this.f57352c = null;
            this.f57353d = null;
            this.f57354e = null;
        }
    }
}
