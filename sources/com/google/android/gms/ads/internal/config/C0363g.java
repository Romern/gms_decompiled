package com.google.android.gms.ads.internal.config;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.flag.C0412y;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.config.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0363g implements C0412y {

    /* renamed from: a */
    final /* synthetic */ SharedPreferences.Editor f8169a;

    /* renamed from: b */
    final /* synthetic */ JSONObject f8170b;

    public C0363g(SharedPreferences.Editor editor, JSONObject jSONObject) {
        this.f8169a = editor;
        this.f8170b = jSONObject;
    }

    /* renamed from: a */
    public final void mo6437a(String str, double d) {
        this.f8169a.putFloat(str, (float) this.f8170b.optDouble(str, d));
    }

    /* renamed from: a */
    public final void mo6438a(String str, long j) {
        this.f8169a.putLong(str, this.f8170b.optLong(str, j));
    }

    /* renamed from: a */
    public final void mo6439a(String str, String str2) {
        this.f8169a.putString(str, this.f8170b.optString(str, str2));
    }

    /* renamed from: a */
    public final void mo6440a(String str, boolean z) {
        this.f8169a.putBoolean(str, this.f8170b.optBoolean(str, z));
    }
}
