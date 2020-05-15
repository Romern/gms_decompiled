package p000;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.constellation.p038ui.ConstellationWebSettingsChimeraActivity;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: tbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tbe extends AsyncTask {

    /* renamed from: a */
    private String f45601a;

    /* renamed from: b */
    private String f45602b;

    /* renamed from: c */
    private final WeakReference f45603c;

    /* renamed from: d */
    private final WeakReference f45604d;

    /* renamed from: e */
    private final tam f45605e;

    public tbe(Context context, WebView webView, tam tam) {
        this.f45603c = new WeakReference(context);
        this.f45604d = new WeakReference(webView);
        this.f45605e = tam;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        tdx tdx = new tdx(UUID.randomUUID().toString(), null);
        Context context = (Context) this.f45603c.get();
        if (context != null) {
            try {
                this.f45601a = addi.m50206a(context).mo33343a(cdfq.m133003c(), "GCM");
            } catch (IOException e) {
                tds.m36774a(context).mo26410a(tdx, 34, e);
                ConstellationWebSettingsChimeraActivity.f30567b.mo25417e("Error getting IidToken", e, new Object[0]);
                this.f45601a = "";
            }
        }
        this.f45601a = ConstellationWebSettingsChimeraActivity.m22811a(this.f45601a);
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            tdk.m36757a();
            Map a = tdk.m36756a(tdx, cdfq.m133002b(), context, new Bundle());
            try {
                for (String str : a.keySet()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str, a.get(str));
                    jSONArray.put(jSONObject);
                }
            } catch (JSONException e2) {
                ConstellationWebSettingsChimeraActivity.f30567b.mo25417e("error when creating json object.", e2.getCause(), new Object[0]);
            }
        }
        String jSONArray2 = jSONArray.toString();
        this.f45602b = jSONArray2;
        this.f45602b = ConstellationWebSettingsChimeraActivity.m22811a(jSONArray2);
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Void voidR = (Void) obj;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f45601a)) {
            sb.append("iidToken=");
            sb.append(this.f45601a);
            if (!TextUtils.isEmpty(this.f45602b)) {
                sb.append('&');
            }
        }
        if (!TextUtils.isEmpty(this.f45602b)) {
            sb.append("gaiaTokens=");
            sb.append(this.f45602b);
        }
        WebView webView = (WebView) this.f45604d.get();
        if (webView != null) {
            webView.postUrl(cdfz.f180729a.mo6606a().mo77476m(), sb.toString().getBytes());
            webView.addJavascriptInterface(this.f45605e, "android");
        }
    }
}
