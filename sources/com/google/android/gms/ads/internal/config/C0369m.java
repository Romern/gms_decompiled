package com.google.android.gms.ads.internal.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.ads.internal.util.C0616an;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.config.m */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0369m implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public final Object f8178a = new Object();

    /* renamed from: b */
    public final ConditionVariable f8179b = new ConditionVariable();

    /* renamed from: c */
    public volatile boolean f8180c = false;

    /* renamed from: d */
    volatile boolean f8181d = false;

    /* renamed from: e */
    public SharedPreferences f8182e = null;

    /* renamed from: f */
    public Bundle f8183f = new Bundle();

    /* renamed from: g */
    public Context f8184g;

    /* renamed from: h */
    public JSONObject f8185h = new JSONObject();

    /* renamed from: a */
    public final void mo6607a() {
        if (this.f8182e != null) {
            try {
                this.f8185h = new JSONObject((String) C0616an.m5620a(new C0367k(this)));
            } catch (JSONException e) {
            }
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            mo6607a();
        }
    }
}
