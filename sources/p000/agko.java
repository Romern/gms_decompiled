package p000;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: agko */
final /* synthetic */ class agko implements Runnable {

    /* renamed from: a */
    private final agkp f65813a;

    /* renamed from: b */
    private final int f65814b;

    /* renamed from: c */
    private final Exception f65815c;

    /* renamed from: d */
    private final byte[] f65816d;

    public agko(agkp agkp, int i, Exception exc, byte[] bArr) {
        this.f65813a = agkp;
        this.f65814b = i;
        this.f65815c = exc;
        this.f65816d = bArr;
    }

    public final void run() {
        List<ResolveInfo> queryIntentActivities;
        agkp agkp = this.f65813a;
        int i = this.f65814b;
        Exception exc = this.f65815c;
        byte[] bArr = this.f65816d;
        agje agje = agkp.f65818b.f65674a;
        if ((i == 200 || i == 204 || i == 304) && exc == null) {
            agje.mo35499a().f65635t.mo35456a(true);
            if (bArr.length == 0) {
                agje.mo35497E().f65571j.mo35435a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    agje.mo35497E().f65571j.mo35435a("Deferred Deep Link is empty.");
                    return;
                }
                agms f = agje.mo35502f();
                f.mo35242i();
                if (TextUtils.isEmpty(optString) || (queryIntentActivities = f.mo35542z().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                    agje.mo35497E().f65567f.mo35437a("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gclid", optString2);
                bundle.putString("_cis", "ddp");
                agje.f65697m.mo35570a("auto", "_cmp", bundle);
                agms f2 = agje.mo35502f();
                if (!TextUtils.isEmpty(optString)) {
                    try {
                        SharedPreferences.Editor edit = f2.mo35542z().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                        edit.putString("deeplink", optString);
                        edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                        if (edit.commit()) {
                            f2.mo35542z().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                        }
                    } catch (Exception e) {
                        f2.mo35497E().f65564c.mo35436a("Failed to persist Deferred Deep Link. exception", e);
                    }
                }
            } catch (JSONException e2) {
                agje.mo35497E().f65564c.mo35436a("Failed to parse the Deferred Deep Link response. exception", e2);
            }
        } else {
            agje.mo35497E().f65567f.mo35437a("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), exc);
        }
    }
}
