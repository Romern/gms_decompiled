package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.util.client.C0633h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.util.h */
public final /* synthetic */ class C0650h implements Runnable {

    /* renamed from: a */
    private final C0652j f8980a;

    /* renamed from: b */
    private final Context f8981b;

    /* renamed from: c */
    private final String f8982c;

    public C0650h(C0652j jVar, Context context, String str) {
        this.f8980a = jVar;
        this.f8981b = context;
        this.f8982c = str;
    }

    public final void run() {
        C0652j jVar = this.f8980a;
        SharedPreferences sharedPreferences = this.f8981b.getSharedPreferences(this.f8982c, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (jVar.f8984a) {
            jVar.f8988e = sharedPreferences;
            jVar.f8989f = edit;
            int i = Build.VERSION.SDK_INT;
            NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            jVar.f8990g = jVar.f8988e.getBoolean("use_https", jVar.f8990g);
            jVar.f9002s = jVar.f8988e.getBoolean("content_url_opted_out", jVar.f9002s);
            jVar.f8991h = jVar.f8988e.getString("content_url_hashes", jVar.f8991h);
            jVar.f8993j = jVar.f8988e.getBoolean("auto_collect_location", jVar.f8993j);
            jVar.f9003t = jVar.f8988e.getBoolean("content_vertical_opted_out", jVar.f9003t);
            jVar.f8992i = jVar.f8988e.getString("content_vertical_hashes", jVar.f8992i);
            jVar.f8999p = jVar.f8988e.getInt("version_code", jVar.f8999p);
            jVar.f8994k = jVar.f8988e.getString("app_settings_json", jVar.f8994k);
            jVar.f8995l = jVar.f8988e.getLong("app_settings_last_update_ms", jVar.f8995l);
            jVar.f8996m = jVar.f8988e.getLong("app_last_background_time_ms", jVar.f8996m);
            jVar.f8998o = jVar.f8988e.getInt("request_in_session_count", jVar.f8998o);
            jVar.f8997n = jVar.f8988e.getLong("first_ad_req_time_ms", jVar.f8997n);
            jVar.f9000q = jVar.f8988e.getStringSet("never_pool_slots", jVar.f9000q);
            jVar.f9004u = jVar.f8988e.getString("display_cutout", jVar.f9004u);
            jVar.f9005v = jVar.f8988e.getInt("app_measurement_npa", jVar.f9005v);
            try {
                jVar.f9001r = new JSONObject(jVar.f8988e.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                C0633h.m5673d("Could not convert native advanced settings to json object", e);
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("listener_registration_bundle", true);
            synchronized (jVar.f8984a) {
                bundle.putBoolean("use_https", jVar.f8990g);
                bundle.putBoolean("content_url_opted_out", jVar.f9002s);
                bundle.putBoolean("content_vertical_opted_out", jVar.f9003t);
                bundle.putBoolean("auto_collect_location", jVar.f8993j);
                bundle.putInt("version_code", jVar.f8999p);
                bundle.putStringArray("never_pool_slots", (String[]) jVar.f9000q.toArray(new String[0]));
                bundle.putString("app_settings_json", jVar.f8994k);
                bundle.putLong("app_settings_last_update_ms", jVar.f8995l);
                bundle.putLong("app_last_background_time_ms", jVar.f8996m);
                bundle.putInt("request_in_session_count", jVar.f8998o);
                bundle.putLong("first_ad_req_time_ms", jVar.f8997n);
                bundle.putString("native_advanced_settings", jVar.f9001r.toString());
                bundle.putString("display_cutout", jVar.f9004u);
                bundle.putInt("app_measurement_npa", jVar.f9005v);
                String str = jVar.f8991h;
                if (str != null) {
                    bundle.putString("content_url_hashes", str);
                }
                String str2 = jVar.f8992i;
                if (str2 != null) {
                    bundle.putString("content_vertical_hashes", str2);
                }
            }
            jVar.mo6840b();
        }
    }
}
