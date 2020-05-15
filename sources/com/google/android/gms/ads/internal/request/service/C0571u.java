package com.google.android.gms.ads.internal.request.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.flag.C0399l;
import com.google.android.gms.ads.internal.p012js.function.C0474b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.future.C0645d;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.request.service.u */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0571u {

    /* renamed from: a */
    public final Context f8856a;

    /* renamed from: b */
    public SharedPreferences f8857b;

    /* renamed from: c */
    private final Object f8858c;

    /* renamed from: d */
    private final C0474b f8859d;

    public C0571u() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: waq.a(android.content.Context, java.lang.String, boolean):int
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      waq.a(android.content.Context, wap, java.lang.String):waq
      waq.a(android.content.Context, java.lang.String, boolean):int */
    /* renamed from: a */
    public static JSONObject m5573a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", VersionInfoParcel.m5635a().f8949a);
            jSONObject.put("mf", C0399l.f8351a.mo6621a());
            jSONObject.put("cl", "306758586");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 20360);
            jSONObject.put("dynamite_local_version", (int) ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", waq.m41674a(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 201515033);
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public C0571u(Context context, C0474b bVar) {
        this.f8858c = new Object();
        this.f8856a = context.getApplicationContext();
        this.f8859d = bVar;
    }

    /* renamed from: a */
    public final bqgg mo6748a() {
        synchronized (this.f8858c) {
            if (this.f8857b == null) {
                this.f8857b = this.f8856a.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (C0387d.m5368f().mo20505a() - this.f8857b.getLong("js_last_update", 0) < ((Long) C0399l.f8352b.mo6621a()).longValue()) {
            return bqga.m112775a((Object) null);
        }
        return bqdx.m112673a(this.f8859d.mo6670b(m5573a(this.f8856a)), new C0569s(this), C0645d.f8977e);
    }
}
