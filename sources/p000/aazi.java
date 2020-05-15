package p000;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aazi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aazi extends aazm {

    /* renamed from: a */
    final /* synthetic */ HelpChimeraActivity f56888a;

    /* renamed from: b */
    final /* synthetic */ aasg f56889b;

    public aazi(HelpChimeraActivity helpChimeraActivity, aasg aasg) {
        this.f56888a = helpChimeraActivity;
        this.f56889b = aasg;
    }

    @JavascriptInterface
    public void prefetchResults(String str) {
        aasm a;
        aaxx aaxx = this.f56888a.f78965l;
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject.has("url")) {
                        String string = jSONObject.getString("url");
                        if (!TextUtils.isEmpty(string) && (a = aasm.m46882a(string, this.f56889b.mo31707d(), this.f56888a.f56986y)) != null) {
                            String a2 = aaxx.mo31883a(string);
                            if (!TextUtils.isEmpty(a2)) {
                                a.f56504n = a2;
                            }
                            arrayList.add(a);
                        }
                    }
                } catch (JSONException e) {
                    StringBuilder sb = new StringBuilder(84);
                    sb.append("Couldn't parse the JSON for a search results (rank: ");
                    sb.append(i);
                    sb.append("). Can't prefetch it.");
                    Log.e("gH_HelpContentFragment", sb.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                HelpChimeraActivity helpChimeraActivity = this.f56888a;
                abhd.m47713a(helpChimeraActivity.f78957d, helpChimeraActivity, aaxx, arrayList);
            }
        } catch (JSONException e2) {
            Log.e("gH_HelpContentFragment", "Couldn't parse the search results JSON. Can't prefetch");
        }
    }
}
