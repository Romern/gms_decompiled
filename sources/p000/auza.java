package p000;

import android.content.Context;
import android.net.Uri;
import com.android.volley.RequestQueue;
import com.google.android.gms.maps.model.LatLng;
import java.util.function.BiConsumer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: auza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auza {

    /* renamed from: c */
    private static final aunx f92811c = new aunx("TrustAgent.Tracker", "WsPlacesUtil");

    /* renamed from: a */
    public final RequestQueue f92812a = rpr.m34216b().getRequestQueue();

    /* renamed from: b */
    public final bebh f92813b;

    public auza(Context context) {
        this.f92813b = new bebh(context);
    }

    /* renamed from: a */
    public static auyw m78104a(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("result");
            String string = jSONObject2.getString("formatted_address");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("geometry").getJSONObject("location");
            return new auyw(str, string, new LatLng(jSONObject3.getDouble("lat"), jSONObject3.getDouble("lng")));
        } catch (JSONException e) {
            f92811c.mo50711a("Error parsing JSON object", new Object[0]).mo50709d();
            return null;
        }
    }

    /* renamed from: a */
    public static String m78105a(String str) {
        Uri.Builder buildUpon = Uri.parse("https://maps.googleapis.com/maps/api/place/details/json").buildUpon();
        buildUpon.appendQueryParameter("key", "AIzaSyDkkA7Rd40mSG5qby2j1898KTvZUvhbAv0");
        buildUpon.appendQueryParameter("place_id", str);
        buildUpon.appendQueryParameter("fields", "formatted_address,geometry/location");
        return buildUpon.toString();
    }

    /* renamed from: a */
    public final void mo51070a(String str, Boolean bool, BiConsumer biConsumer) {
        bnhe a = this.f92813b.mo58526a();
        aunx aunx = f92811c;
        String valueOf = String.valueOf(str);
        aunx.mo50711a(valueOf.length() == 0 ? new String("fetching: ") : "fetching: ".concat(valueOf), new Object[0]);
        this.f92812a.add(new auyz(m78105a(str), new auyy(str, biConsumer, bool), a));
    }
}
