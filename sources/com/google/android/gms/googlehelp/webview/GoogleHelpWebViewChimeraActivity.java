package com.google.android.gms.googlehelp.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebViewClient;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleHelpWebViewChimeraActivity extends rid implements aasf {

    /* renamed from: a */
    private HelpConfig f79017a;

    /* renamed from: b */
    private abcr f79018b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final WebViewClient mo17698a() {
        return abht.m47722a((aasf) this);
    }

    /* renamed from: g */
    public final HelpConfig mo18626g() {
        return this.f79017a;
    }

    /* renamed from: h */
    public final abcr mo18627h() {
        return this.f79018b;
    }

    /* renamed from: i */
    public final aaxx mo18628i() {
        throw null;
    }

    /* renamed from: j */
    public final aatc mo18629j() {
        throw null;
    }

    /* renamed from: k */
    public final Context mo18630k() {
        return this;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abhp.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      abhp.a(android.net.Uri, boolean):boolean
      abhp.a(java.lang.String, boolean):boolean */
    public final void onCreate(Bundle bundle) {
        String str;
        Uri uri;
        this.f79017a = HelpConfig.m66349a(this, bundle, getIntent());
        this.f79018b = new abcr(this);
        Intent intent = getIntent();
        abhp abhp = new abhp(this);
        if (bundle != null) {
            intent = new Intent();
            String string = bundle.getString("saved_instance_state_key_url");
            if (!TextUtils.isEmpty(string)) {
                intent.setData(Uri.parse(string));
            }
            Log.w("gH_WebViewActivity", "URL not whitelisted or Intent not processable.");
            getIntent().setData(null);
            super.onCreate(null);
            setResult(0);
            finish();
            return;
        }
        if (intent != null) {
            uri = intent.getData();
            str = uri != null ? uri.toString() : "";
        } else {
            uri = null;
            str = null;
        }
        if (!abhp.m47719b(uri) || !abhp.m47718a(uri.toString(), true)) {
            if (!TextUtils.isEmpty(str)) {
                abhp.m47715a(this, uri, abhp.f57504a);
            }
            Log.w("gH_WebViewActivity", "URL not whitelisted or Intent not processable.");
            getIntent().setData(null);
            super.onCreate(null);
            setResult(0);
            finish();
            return;
        }
        super.onCreate(bundle);
    }

    public final void onDestroy() {
        abcr abcr = this.f79018b;
        if (abcr != null) {
            abcr.close();
        }
        super.onDestroy();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        if (!(getIntent() == null || getIntent().getData() == null)) {
            bundle.putParcelable("EXTRA_HELP_CONFIG", this.f79017a);
            bundle.putString("saved_instance_state_key_url", getIntent().getData().toString());
        }
        super.onSaveInstanceState(bundle);
    }
}
