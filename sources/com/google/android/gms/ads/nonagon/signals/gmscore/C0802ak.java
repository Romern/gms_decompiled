package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.location.Location;
import com.google.android.gms.ads.nonagon.signals.C0786c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.ak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0802ak implements C0786c {

    /* renamed from: a */
    private final Location f9246a;

    public C0802ak(Location location) {
        this.f9246a = location;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7056a(Object obj) {
        try {
            if (this.f9246a != null) {
                JSONObject jSONObject = new JSONObject();
                Float valueOf = Float.valueOf(this.f9246a.getAccuracy() * 1000.0f);
                Long valueOf2 = Long.valueOf(this.f9246a.getTime() * 1000);
                Long valueOf3 = Long.valueOf((long) (this.f9246a.getLatitude() * 1.0E7d));
                Long valueOf4 = Long.valueOf((long) (this.f9246a.getLongitude() * 1.0E7d));
                jSONObject.put("radius", valueOf);
                jSONObject.put("lat", valueOf3);
                jSONObject.put("long", valueOf4);
                jSONObject.put("time", valueOf2);
                ((JSONObject) obj).put("uule", jSONObject);
            }
        } catch (JSONException e) {
        }
    }
}
