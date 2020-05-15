package p000;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.chimera.Activity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bjtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjtr implements bjth {

    /* renamed from: a */
    private final Activity f123308a;

    /* renamed from: b */
    private final RequestQueue f123309b;

    public bjtr(Activity activity, RequestQueue requestQueue) {
        this.f123308a = activity;
        this.f123309b = requestQueue;
    }

    /* renamed from: a */
    static String m104593a(char c) {
        if (c == '1') {
            return "geocode";
        }
        if (c == 'C') {
            return "(cities)";
        }
        if (c != 'S') {
            return null;
        }
        return "(regions)";
    }

    /* renamed from: b */
    private final Location m104597b() {
        Activity activity = this.f123308a;
        if (!bjzc.m104959a((Context) activity) || !bjzc.m104958a().mo65653b(activity, bjzc.m104958a().mo52114a(activity))) {
            return null;
        }
        return ((LocationManager) this.f123308a.getSystemService("location")).getLastKnownLocation("network");
    }

    /* renamed from: a */
    public final String mo65523a() {
        return "GooglePlacesAddressSource";
    }

    /* renamed from: a */
    private final JSONObject m104594a(String str) {
        try {
            RequestFuture newFuture = RequestFuture.newFuture();
            this.f123309b.add(new bjua(str, Collections.singletonMap("User-Agent", bjtx.f123321a), newFuture, newFuture));
            return (JSONObject) newFuture.get(5000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            Log.w("GooglePlacesAddressSour", "TimeoutException while retrieving addresses from GooglePlaces", e);
            return null;
        } catch (InterruptedException e2) {
            Log.w("GooglePlacesAddressSour", "InterruptedException while retrieving addresses from GooglePlaces", e2);
            return null;
        } catch (ExecutionException e3) {
            Log.w("GooglePlacesAddressSour", "ExecutionException while retrieving addresses from GooglePlaces", e3);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m104595a(int i) {
        return ((String) bjwc.f123458a.mo54082a()).contains(bjtv.m104615a(i));
    }

    /* renamed from: a */
    private static boolean m104596a(JSONObject jSONObject, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("types");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (str.equalsIgnoreCase(jSONArray.getString(i))) {
                        return true;
                    }
                }
                return false;
            } catch (JSONException e) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final btwp mo65522a(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri.Builder buildUpon = Uri.parse("https://maps.googleapis.com/maps/api/place/details/json").buildUpon();
        buildUpon.appendQueryParameter("placeid", str);
        buildUpon.appendQueryParameter("sensor", m104597b() == null ? "false" : "true");
        buildUpon.appendQueryParameter("key", "AIzaSyCgACP5TTubzmLhxFL5ONXq6B5l2eH_EXc");
        if (!TextUtils.isEmpty(str2)) {
            buildUpon.appendQueryParameter("language", str2);
        }
        JSONObject a = m104594a(buildUpon.build().toString());
        if (a == null) {
            return null;
        }
        String optString = a.optString("status");
        if (!"OK".equalsIgnoreCase(optString)) {
            String valueOf = String.valueOf(optString);
            Log.w("GooglePlacesAddressSour", valueOf.length() == 0 ? new String("Response has invalid status: ") : "Response has invalid status: ".concat(valueOf));
            return null;
        }
        try {
            JSONArray jSONArray = a.getJSONObject("result").getJSONArray("address_components");
            C1245ok okVar = new C1245ok();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (!m104596a(jSONObject, "postal_code_prefix")) {
                        if (m104596a(jSONObject, "administrative_area_level_1") || m104596a(jSONObject, "country")) {
                            str7 = "short_name";
                        } else {
                            str7 = "long_name";
                        }
                        String string = jSONObject.getString(str7);
                        JSONArray jSONArray2 = jSONObject.getJSONArray("types");
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            okVar.put(jSONArray2.getString(i2), string);
                        }
                    }
                } catch (JSONException e) {
                }
            }
            btwo btwo = (btwo) btwp.f152728s.mo74144da();
            if (okVar.containsKey("street_number") || okVar.containsKey("route")) {
                String str8 = (String) okVar.get("street_number");
                String str9 = (String) okVar.get("route");
                if (TextUtils.isEmpty(str8)) {
                    btwo.mo72447a(str9);
                } else if (TextUtils.isEmpty(str9)) {
                    btwo.mo72447a(str8);
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(str8).length() + 1 + String.valueOf(str9).length());
                    sb.append(str8);
                    sb.append(" ");
                    sb.append(str9);
                    btwo.mo72447a(sb.toString());
                }
            }
            if (okVar.containsKey("locality") && (str6 = (String) okVar.get("locality")) != null) {
                if (btwo.f164950c) {
                    btwo.mo74035c();
                    btwo.f164950c = false;
                }
                btwp btwp = (btwp) btwo.f164949b;
                str6.getClass();
                btwp.f152730a |= 64;
                btwp.f152736g = str6;
            }
            if (okVar.containsKey("administrative_area_level_1") && (str5 = (String) okVar.get("administrative_area_level_1")) != null) {
                if (btwo.f164950c) {
                    btwo.mo74035c();
                    btwo.f164950c = false;
                }
                btwp btwp2 = (btwp) btwo.f164949b;
                str5.getClass();
                btwp2.f152730a |= 16;
                btwp2.f152734e = str5;
            }
            if (okVar.containsKey("postal_code") && (str4 = (String) okVar.get("postal_code")) != null) {
                if (btwo.f164950c) {
                    btwo.mo74035c();
                    btwo.f164950c = false;
                }
                btwp btwp3 = (btwp) btwo.f164949b;
                str4.getClass();
                btwp3.f152730a |= 2048;
                btwp3.f152740k = str4;
            }
            if (okVar.containsKey("country") && (str3 = (String) okVar.get("country")) != null) {
                if (btwo.f164950c) {
                    btwo.mo74035c();
                    btwo.f164950c = false;
                }
                btwp btwp4 = (btwp) btwo.f164949b;
                str3.getClass();
                btwp4.f152730a |= 1;
                btwp4.f152731b = str3;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (btwo.f164950c) {
                    btwo.mo74035c();
                    btwo.f164950c = false;
                }
                btwp btwp5 = (btwp) btwo.f164949b;
                str2.getClass();
                btwp5.f152730a |= 8;
                btwp5.f152733d = str2;
            }
            return (btwp) btwo.mo74062i();
        } catch (JSONException e2) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r5 = r6.getString("value");
     */
    /* renamed from: a */
    public final List mo65524a(CharSequence charSequence, char c, char[] cArr, int i, String str) {
        int i2;
        String str2;
        JSONArray jSONArray;
        String str3;
        char c2 = c;
        int length = charSequence.length();
        char c3 = '1';
        if (c2 != '1') {
            i2 = ((Integer) bjwc.f123460c.mo54082a()).intValue();
        } else {
            i2 = ((Integer) bjwc.f123459b.mo54082a()).intValue();
        }
        if (length < i2 || !m104595a(i) || m104593a(c) == null) {
            return null;
        }
        Uri.Builder buildUpon = Uri.parse("https://maps.googleapis.com/maps/api/place/autocomplete/json").buildUpon();
        buildUpon.appendQueryParameter("input", charSequence.toString());
        buildUpon.appendQueryParameter("key", "AIzaSyCgACP5TTubzmLhxFL5ONXq6B5l2eH_EXc");
        buildUpon.appendQueryParameter("types", m104593a(c));
        Location b = m104597b();
        if (b != null) {
            double latitude = b.getLatitude();
            double longitude = b.getLongitude();
            StringBuilder sb = new StringBuilder(49);
            sb.append(latitude);
            sb.append(",");
            sb.append(longitude);
            buildUpon.appendQueryParameter("location", sb.toString());
            buildUpon.appendQueryParameter("radius", "80000");
        }
        if (b == null) {
            str2 = "false";
        } else {
            str2 = "true";
        }
        buildUpon.appendQueryParameter("sensor", str2);
        String valueOf = String.valueOf(bjtv.m104615a(i).toLowerCase(Locale.US));
        buildUpon.appendQueryParameter("components", valueOf.length() == 0 ? new String("country:") : "country:".concat(valueOf));
        if (!TextUtils.isEmpty(str)) {
            buildUpon.appendQueryParameter("language", str);
        }
        JSONObject a = m104594a(buildUpon.build().toString());
        if (a == null) {
            return null;
        }
        String optString = a.optString("status");
        if (!"OK".equalsIgnoreCase(optString)) {
            String valueOf2 = String.valueOf(optString);
            Log.w("GooglePlacesAddressSour", valueOf2.length() == 0 ? new String("Response has invalid status: ") : "Response has invalid status: ".concat(valueOf2));
            return null;
        }
        try {
            JSONArray jSONArray2 = a.getJSONArray("predictions");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray2.length();
            int i3 = 0;
            int i4 = 0;
            while (i4 < length2) {
                try {
                    JSONObject jSONObject = jSONArray2.getJSONObject(i4);
                    CharSequence string = jSONObject.getString("description");
                    if (!TextUtils.isEmpty(string)) {
                        String string2 = jSONObject.getString("place_id");
                        if (TextUtils.isEmpty(string2)) {
                            jSONArray = jSONArray2;
                        } else {
                            String str4 = "locality";
                            if (c2 == c3) {
                                str4 = "geocode";
                            } else if (c2 != 'C') {
                                if (c2 == 'S') {
                                    str4 = "administrative_area_level_1";
                                } else if (c2 != 'Z') {
                                    str4 = null;
                                }
                            }
                            if (m104596a(jSONObject, str4)) {
                                int i5 = jSONObject.getJSONArray("matched_substrings").getJSONObject(i3).getInt("offset");
                                JSONArray jSONArray3 = jSONObject.getJSONArray("terms");
                                int length3 = jSONArray3.length();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= length3) {
                                        jSONArray = jSONArray2;
                                        str3 = null;
                                        break;
                                    }
                                    JSONObject jSONObject2 = jSONArray3.getJSONObject(i6);
                                    jSONArray = jSONArray2;
                                    if (i5 >= jSONObject2.getInt("offset") + jSONObject2.getString("value").length()) {
                                        i6++;
                                        jSONArray2 = jSONArray;
                                    } else {
                                        try {
                                            break;
                                        } catch (JSONException e) {
                                        }
                                    }
                                }
                                if (str3 != null && (c2 == '1' || c2 == 'C' || str3.toLowerCase(Locale.getDefault()).startsWith(charSequence.toString().toLowerCase(Locale.getDefault())))) {
                                    ArrayList arrayList2 = new ArrayList();
                                    try {
                                        JSONArray jSONArray4 = jSONObject.getJSONArray("matched_substrings");
                                        int length4 = jSONArray4.length();
                                        for (int i7 = 0; i7 < length4; i7++) {
                                            JSONObject jSONObject3 = jSONArray4.getJSONObject(i7);
                                            arrayList2.add(Pair.create(Integer.valueOf(jSONObject3.getInt("offset")), Integer.valueOf(jSONObject3.getInt("length"))));
                                        }
                                    } catch (JSONException e2) {
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        string = bjtw.m104618a(arrayList2, string);
                                    }
                                    arrayList.add(new bjtj(str3, string, "GooglePlacesAddressSource", string2));
                                }
                            } else {
                                jSONArray = jSONArray2;
                            }
                        }
                    } else {
                        jSONArray = jSONArray2;
                    }
                } catch (JSONException e3) {
                    jSONArray = jSONArray2;
                }
                i4++;
                jSONArray2 = jSONArray;
                c3 = '1';
                i3 = 0;
            }
            return arrayList;
        } catch (JSONException e4) {
            Log.w("GooglePlacesAddressSour", "Response does not contain predictions");
            return null;
        }
    }
}
