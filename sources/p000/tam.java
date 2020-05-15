package p000;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: tam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tam {

    /* renamed from: a */
    public static final sek f45571a = tea.m36798a("jsbridge");

    /* renamed from: b */
    public final tbg f45572b;

    /* renamed from: c */
    public final tds f45573c = tds.m36774a(this.f45574d);

    /* renamed from: d */
    private final Context f45574d;

    /* renamed from: e */
    private final tdj f45575e = new tdj();

    /* renamed from: f */
    private final tdx f45576f;

    public tam(Context context, tbg tbg, tdx tdx) {
        this.f45574d = context;
        this.f45572b = tbg;
        this.f45576f = tdx;
    }

    /* renamed from: a */
    private static final tal[] m36708a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                tal tal = new tal();
                tal.f45569a = jSONObject.getString("key");
                tal.f45570b = jSONObject.getString("value");
                arrayList.add(tal);
            }
            return (tal[]) arrayList.toArray(new tal[arrayList.size()]);
        } catch (JSONException e) {
            f45571a.mo25416d("Error in parsing json of %s", str, e.getCause());
            return (tal[]) arrayList.toArray(new tal[arrayList.size()]);
        }
    }

    @JavascriptInterface
    public void clearData() {
        try {
            szr.m36692a();
            szr.m36695a(new ArrayList());
        } catch (tdw e) {
            this.f45573c.mo26406a(this.f45576f, 36);
            f45571a.mo25417e("Error deleting verifications", e, new Object[0]);
        }
    }

    @JavascriptInterface
    public void getDroidguardResult(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            this.f45572b.mo17983b("window.setDroidguardResult('');");
        }
        tal[] a = m36708a(str);
        int length = a.length;
        if (length == 0) {
            this.f45572b.mo17983b("window.setDroidguardResult('');");
        }
        HashMap hashMap = new HashMap();
        for (tal tal : a) {
            hashMap.put(tal.f45569a, tal.f45570b);
        }
        new taj(hashMap, str2, this.f45574d, this.f45575e, this.f45572b).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @JavascriptInterface
    public void getGaiaAccessTokens(String str) {
        getGaiaAccessTokens(str, null);
    }

    @JavascriptInterface
    public int getGmscoreVersion() {
        return srr.m36143a(201515033);
    }

    @JavascriptInterface
    public void getIidToken(String str) {
        getIidToken(str, "GCM", null);
    }

    @JavascriptInterface
    public String getVerifiedPhoneNumbers() {
        try {
            szr.m36692a();
            return new JSONArray((Collection) szr.m36698c().keySet()).toString();
        } catch (tdw e) {
            f45571a.mo25417e("Error reading verified numbers", e, new Object[0]);
            return "[]";
        }
    }

    @JavascriptInterface
    public void goBack() {
        this.f45572b.mo17984e();
    }

    @JavascriptInterface
    public void hideKeyboard() {
        this.f45572b.mo17986h();
    }

    @JavascriptInterface
    public void showKeyboard() {
        this.f45572b.mo17985g();
    }

    @JavascriptInterface
    public void sync() {
        sync(null, null);
    }

    @JavascriptInterface
    public void getGaiaAccessTokens(String str, String str2) {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str2)) {
            tal[] a = m36708a(str2);
            for (tal tal : a) {
                bundle.putString(tal.f45569a, tal.f45570b);
            }
        }
        new tai(str, bundle, this.f45575e, this.f45574d, this.f45572b).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @JavascriptInterface
    public void getIidToken(String str, String str2) {
        getIidToken(str, str2, null);
    }

    @JavascriptInterface
    public void sync(String str, String str2) {
        UUID randomUUID = UUID.randomUUID();
        sns sns = new sns(10);
        f45571a.mo25412b("Starting verification", new Object[0]);
        this.f45573c.mo26401a(randomUUID, 10);
        sxt.m36563a();
        sxt.m36568b(this.f45574d, randomUUID, 5, new tah(this, new snr(sns), str, randomUUID, str2));
    }

    @JavascriptInterface
    public void getIidToken(String str, String str2, String str3) {
        tal[] a;
        int length;
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str3) && (length = (a = m36708a(str3)).length) > 0) {
            for (int i = 0; i < length; i++) {
                tal tal = a[i];
                bundle.putString(tal.f45569a, tal.f45570b);
            }
        }
        new tak(str, str2, bundle, this.f45574d, this.f45576f, this.f45572b).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
