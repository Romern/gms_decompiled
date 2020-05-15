package com.google.android.gms.ads.internal.config;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.C0633h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.config.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0358b extends C0362f {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6598a(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(this.f8167b, ((Integer) this.f8168c).intValue()));
    }

    public C0358b(String str, Integer num) {
        super(1, str, num);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6599a(Bundle bundle) {
        String valueOf = String.valueOf(this.f8167b);
        if (!bundle.containsKey(valueOf.length() == 0 ? new String("com.google.android.gms.ads.flag.") : "com.google.android.gms.ads.flag.".concat(valueOf))) {
            return (Integer) this.f8168c;
        }
        String valueOf2 = String.valueOf(this.f8167b);
        return Integer.valueOf(bundle.getInt(valueOf2.length() == 0 ? new String("com.google.android.gms.ads.flag.") : "com.google.android.gms.ads.flag.".concat(valueOf2)));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6600a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(this.f8167b, ((Integer) this.f8168c).intValue()));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6601a(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(this.f8167b, ((Integer) obj).intValue());
    }

    /* renamed from: a */
    public final void mo6602a(SharedPreferences.Editor editor, String str) {
        editor.putInt(this.f8167b, Integer.parseInt(str));
    }

    /* renamed from: a */
    public final void mo6603a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put(this.f8167b, Integer.parseInt(str, 10));
        } catch (JSONException e) {
            C0633h.m5666a(e);
        }
    }
}
