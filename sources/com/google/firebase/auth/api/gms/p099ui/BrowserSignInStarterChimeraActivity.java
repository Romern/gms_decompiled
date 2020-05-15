package com.google.firebase.auth.api.gms.p099ui;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.internal.FederatedSignInActivity;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.auth.api.gms.ui.BrowserSignInStarterChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BrowserSignInStarterChimeraActivity extends Activity implements brpo {

    /* renamed from: b */
    private final bqgj f152504b = new soc(1, 9);

    /* renamed from: a */
    public final Uri.Builder mo69768a(Intent intent, String str, String str2) {
        String str3;
        Intent intent2 = intent;
        String stringExtra = intent2.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent2.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent2.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent2.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str4 : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str4);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject.put(str4, string);
                    }
                }
            } catch (JSONException e) {
                f143138a.mo25418e("Unexpected JSON exception when serializing developer specified custom params", new Object[0]);
            }
            str3 = jSONObject.toString();
        } else {
            str3 = null;
        }
        String uuid = UUID.randomUUID().toString();
        String a = brpn.m114370a(UUID.randomUUID().toString());
        String stringExtra4 = intent2.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        String stringExtra5 = intent2.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        brru.m114515a(getApplicationContext(), str, uuid, a, stringExtra4, stringExtra2, stringExtra3);
        if (a == null) {
            return null;
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("eid", cdxz.f181891a.mo6606a().mo78432a()).appendQueryParameter("v", stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", a).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2);
        if (!TextUtils.isEmpty(join)) {
            appendQueryParameter.appendQueryParameter("scopes", join);
        }
        if (!TextUtils.isEmpty(str3)) {
            appendQueryParameter.appendQueryParameter("customParameters", str3);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            appendQueryParameter.appendQueryParameter("tid", stringExtra3);
        }
        return appendQueryParameter;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cdxz.m135247b()) {
            f143138a.mo25409a("Activity enabled. Continuing", new Object[0]);
            String a = spn.m35852a((Activity) this);
            if (TextUtils.isEmpty(a)) {
                f143138a.mo25420f("Could not identify calling package", new Object[0]);
                brpn.m114371a(this, a);
                return;
            }
            try {
                new brpm(a, spn.m35882e(this, a).toLowerCase(Locale.US), getIntent(), this).executeOnExecutor(this.f152504b, new Void[0]);
            } catch (PackageManager.NameNotFoundException e) {
                sek sek = f143138a;
                String valueOf = String.valueOf(a);
                sek.mo25420f(valueOf.length() == 0 ? new String("Could not get package signature: ") : "Could not get package signature: ".concat(valueOf), new Object[0]);
                brpn.m114371a(this, a);
            }
        } else {
            f143138a.mo25409a("Activity disabled. Finishing", new Object[0]);
            finish();
        }
    }

    /* renamed from: a */
    public final String mo69769a() {
        return cdxz.m135248c();
    }

    /* renamed from: a */
    public final HttpURLConnection mo69770a(URL url) {
        try {
            return (HttpURLConnection) stp.m36306a(url, 20480);
        } catch (IOException e) {
            f143138a.mo25418e("Error generating connection", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo69771a(Uri uri, String str) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        intent.setPackage("com.android.chrome");
        List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || !cdxz.f181891a.mo6606a().mo78442k()) {
            Intent intent2 = new Intent("android.intent.action.VIEW", uri);
            ResolveInfo resolveActivity = getPackageManager().resolveActivity(intent2, 0);
            intent2.addFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
            intent2.addFlags(268435456);
            if (resolveActivity != null) {
                startActivity(intent2);
                finish();
                return;
            }
            f143138a.mo25418e("SignInStartActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            brpn.m114371a(this, str);
            return;
        }
        ahk a = new ahj().mo703a();
        Intent intent3 = a.f545a;
        intent3.addFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
        intent3.addFlags(268435456);
        a.mo706a(this, uri);
        finish();
    }

    /* renamed from: a */
    public final void mo69772a(String str, Status status) {
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent(this, FederatedSignInActivity.class);
            intent.setPackage(str);
            intent.setClassName(str, FederatedSignInActivity.class.getName());
            intent.setAction("com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED");
            intent.addFlags(603979776);
            if (status != null) {
                brsb.m114521a(intent, status);
            }
            startActivity(intent);
        }
        finish();
    }
}
