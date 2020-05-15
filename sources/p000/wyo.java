package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: wyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wyo extends aayk {

    /* renamed from: a */
    private final aasm f51578a;

    /* renamed from: l */
    private final String f51579l;

    public wyo(Context context, HelpConfig helpConfig, bqgj bqgj, aasm aasm, String str) {
        super(context, helpConfig, bqgj);
        this.f51578a = aasm;
        this.f51579l = str.charAt(0) == '/' ? str.substring(1) : str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c A[Catch:{ UnsupportedEncodingException | JSONException -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057 A[Catch:{ UnsupportedEncodingException | JSONException -> 0x005d }] */
    /* renamed from: a */
    public static Pair m42472a(Context context, HelpConfig helpConfig, bqgj bqgj, aasm aasm, String str) {
        aasm aasm2;
        sdo.m34973b("Must be called from a worker thread.");
        wyo wyo = new wyo(context, helpConfig, bqgj, aasm, str);
        try {
            aays k = wyo.mo31910k();
            if (!wyo.mo31909a(k)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(k.f56844c, aata.m46958a(k.f56843b)));
                if (jSONObject.has("validation_error")) {
                    if (jSONObject.getJSONArray("validation_error").length() > 0) {
                        aasm2 = null;
                        if (aasm2 == null) {
                            return Pair.create(wyo.f51578a.mo31735r(), aasm2);
                        }
                        Log.e("gF_URApiSuggestionCReq", "Unsupported/empty response received");
                        return null;
                    }
                }
                aasm2 = aasm.m46891a(jSONObject, wyo.f51578a);
                if (aasm2 == null) {
                }
            } catch (UnsupportedEncodingException | JSONException e) {
                Log.e("gF_URApiSuggestionCReq", "Parsing suggestion response data failed.", e);
                return null;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e("gF_URApiSuggestionCReq", "Fetching suggestion failed.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo29520b() {
        String valueOf = String.valueOf(ceeg.m136421z());
        String valueOf2 = String.valueOf(String.format(ceeg.m136395A(), this.f51579l));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo29523e() {
        return (int) TimeUnit.SECONDS.convert(cdtr.m134949k(), TimeUnit.MILLISECONDS);
    }

    public final void onPreNetworkDispatch() {
        shr.m35316b(3074);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final byte[] mo29522d() {
        bxvd da = bzpk.f170916n.mo74144da();
        String uri = (aayi.m47270b() && aayi.m47271b(this.f56830c, C0126R.attr.gf_isInDarkMode)) ? Uri.parse(this.f51578a.f56497g).buildUpon().appendQueryParameter("dark", "1").build().toString() : this.f51578a.f56497g;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzpk bzpk = (bzpk) da.f164949b;
        uri.getClass();
        bzpk.f170918a |= 1;
        bzpk.f170919b = uri;
        String a = aasw.m46952a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzpk bzpk2 = (bzpk) da.f164949b;
        a.getClass();
        int i = bzpk2.f170918a | 16;
        bzpk2.f170918a = i;
        bzpk2.f170924g = a;
        bzpk2.f170921d = 1;
        bzpk2.f170918a = i | 4;
        return ((bzpk) da.mo74062i()).serializeToBytes();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29518a() {
        return aayq.m47281a(cdtu.f181751a.mo6606a().mo78331c());
    }
}
