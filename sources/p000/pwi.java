package p000;

import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pwi extends aky {

    /* renamed from: a */
    public final qav f40471a = new qav("MultizoneMemberRC");

    /* renamed from: b */
    public final String f40472b;

    /* renamed from: c */
    public final String f40473c;

    /* renamed from: d */
    public final pvv f40474d;

    /* renamed from: e */
    public double f40475e;

    /* renamed from: f */
    public pjc f40476f;

    /* renamed from: g */
    private final Executor f40477g;

    public pwi(String str, String str2, pvv pvv, Executor executor) {
        this.f40472b = str;
        this.f40473c = str2;
        this.f40474d = pvv;
        this.f40477g = executor;
    }

    /* renamed from: a */
    public final pjc mo23766a() {
        pjc pjc = this.f40476f;
        if (pjc == null || !pjc.mo23211b()) {
            return null;
        }
        return this.f40476f;
    }

    /* renamed from: b */
    public final void mo940b(int i) {
        this.f40477g.execute(new pwg(this, i));
    }

    /* renamed from: c */
    public final void mo942c(int i) {
        this.f40477g.execute(new pwh(this, i));
    }

    /* renamed from: d */
    public final void mo943d() {
        this.f40477g.execute(new pwf(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final void mo23767a(double d) {
        try {
            pjc pjc = this.f40476f;
            String str = this.f40472b;
            pjc.f39316e.mo23677d("setMultizoneMemberVolumeInternal; deviceId:%s, volume:%f", str, Double.valueOf(d));
            prb prb = pjc.f39318g;
            if (prb != null) {
                sdo.m34969a(str, (Object) "deviceID cannot be null or empty");
                if (d < 0.0d) {
                    d = 0.0d;
                } else if (d > 1.0d) {
                    d = 1.0d;
                }
                long c = prb.mo23633c();
                prb.f40096d.mo23689a(c, (pue) null);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("requestId", c);
                    jSONObject.put("type", "SET_DEVICE_VOLUME");
                    jSONObject.put("deviceId", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("level", d);
                    jSONObject.put("volume", jSONObject2);
                } catch (JSONException e) {
                }
                prb.mo23632b(jSONObject.toString(), c, prb.f40097e);
            }
        } catch (IllegalStateException e2) {
            this.f40471a.mo23677d("Unable to set volume: %s", e2.getMessage());
        }
    }
}
