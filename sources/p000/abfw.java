package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: abfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abfw extends aayq {

    /* renamed from: a */
    private final String f57373a;

    public abfw(Context context, HelpConfig helpConfig, bqgj bqgj, abcr abcr, String str) {
        super(context, helpConfig, bqgj, abcr, 181);
        Uri.Builder encodedPath = Uri.parse(ceeg.f182447a.mo6606a().mo79010e()).buildUpon().encodedPath(ceeg.f182447a.mo6606a().mo78947O());
        String a = helpConfig.mo43216a(aars.f56391o);
        try {
            a = URLEncoder.encode(a, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            String valueOf = String.valueOf(a);
            Log.e("gH_GetQSuggestionsCRq", valueOf.length() == 0 ? new String("Failed to encode ") : "Failed to encode ".concat(valueOf));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 26 + String.valueOf(a).length() + String.valueOf(a).length());
        sb.append("client=");
        sb.append(a);
        sb.append("&gs_ri=");
        sb.append(a);
        sb.append("&ds=");
        sb.append(a);
        sb.append("&hjson=t");
        Uri.Builder appendQueryParameter = encodedPath.encodedQuery(sb.toString()).appendQueryParameter("hl", Locale.getDefault().getLanguage());
        int i = helpConfig.mo43234i();
        StringBuilder sb2 = new StringBuilder(21);
        sb2.append("productId:");
        sb2.append(i);
        this.f57373a = appendQueryParameter.appendQueryParameter("requiredfields", sb2.toString()).appendQueryParameter("q", str).build().toString();
    }

    /* renamed from: a */
    public static List m47634a(Context context, HelpConfig helpConfig, bqgj bqgj, abcr abcr, String str) {
        sdo.m34973b("Must be called from a worker thread.");
        abfw abfw = new abfw(context, helpConfig, bqgj, abcr, str);
        try {
            aays k = abfw.mo31910k();
            if (!abfw.mo31909a(k)) {
                Log.e("gH_GetQSuggestionsCRq", String.format("No data returned for autocomplete suggestions. Got %d status code", Integer.valueOf(k.f56842a)));
                return Collections.emptyList();
            }
            try {
                String str2 = new String(k.f56844c, aata.m46958a(k.f56843b));
                Context context2 = abfw.f56830c;
                HelpConfig helpConfig2 = abfw.f56831d;
                JSONArray jSONArray = new JSONArray(str2).getJSONArray(1);
                ArrayList arrayList = new ArrayList(jSONArray.length());
                for (int i = 0; i < jSONArray.length(); i++) {
                    abfo abfo = new abfo(jSONArray.getJSONArray(i), context2, helpConfig2);
                    if (abfo.f57350a != -1) {
                        arrayList.add(abfo);
                    }
                }
                return arrayList;
            } catch (UnsupportedEncodingException | JSONException e) {
                Log.e("gH_GetQSuggestionsCRq", "Parsing autocomplete suggestions failed.", e);
                return Collections.emptyList();
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e("gH_GetQSuggestionsCRq", "Fetching query suggestions failed.", e2);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo29520b() {
        return this.f57373a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo31906h() {
        return "GET";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29518a() {
        return aayq.m47281a(ceev.f182568a.mo6606a().mo79050b());
    }
}
