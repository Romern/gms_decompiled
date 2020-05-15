package com.google.android.gms.ads.internal.config;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.C0633h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.config.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0359c extends C0362f {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6598a(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(this.f8167b, ((Long) this.f8168c).longValue()));
    }

    public C0359c(String str, Long l) {
        super(1, str, l);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6599a(Bundle bundle) {
        String valueOf = String.valueOf(this.f8167b);
        if (!bundle.containsKey(valueOf.length() == 0 ? new String("com.google.android.gms.ads.flag.") : "com.google.android.gms.ads.flag.".concat(valueOf))) {
            return (Long) this.f8168c;
        }
        String valueOf2 = String.valueOf(this.f8167b);
        return Long.valueOf(bundle.getLong(valueOf2.length() == 0 ? new String("com.google.android.gms.ads.flag.") : "com.google.android.gms.ads.flag.".concat(valueOf2)));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6600a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(this.f8167b, ((Long) this.f8168c).longValue()));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6601a(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(this.f8167b, ((Long) obj).longValue());
    }

    /* renamed from: a */
    public final void mo6602a(SharedPreferences.Editor editor, String str) {
        editor.putLong(this.f8167b, Long.parseLong(str));
    }

    /* renamed from: a */
    public final void mo6603a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put(this.f8167b, Long.parseLong(str, 10));
        } catch (JSONException e) {
            C0633h.m5666a(e);
        }
    }
}
