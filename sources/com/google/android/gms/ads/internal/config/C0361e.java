package com.google.android.gms.ads.internal.config;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.C0633h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.config.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0361e extends C0362f {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6598a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.f8167b, (String) this.f8168c);
    }

    public C0361e(String str, String str2) {
        super(1, str, str2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6599a(Bundle bundle) {
        String valueOf = String.valueOf(this.f8167b);
        if (!bundle.containsKey(valueOf.length() == 0 ? new String("com.google.android.gms.ads.flag.") : "com.google.android.gms.ads.flag.".concat(valueOf))) {
            return (String) this.f8168c;
        }
        String valueOf2 = String.valueOf(this.f8167b);
        return bundle.getString(valueOf2.length() == 0 ? new String("com.google.android.gms.ads.flag.") : "com.google.android.gms.ads.flag.".concat(valueOf2));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6600a(JSONObject jSONObject) {
        return jSONObject.optString(this.f8167b, (String) this.f8168c);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6601a(SharedPreferences.Editor editor, Object obj) {
        editor.putString(this.f8167b, (String) obj);
    }

    /* renamed from: a */
    public final void mo6602a(SharedPreferences.Editor editor, String str) {
        editor.putString(this.f8167b, str);
    }

    /* renamed from: a */
    public final void mo6603a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put(this.f8167b, str);
        } catch (JSONException e) {
            C0633h.m5666a(e);
        }
    }
}
