package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ihc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ihc {

    /* renamed from: b */
    public static final sek f21003b = new sek("ScreenlockStateHistoryManager");

    /* renamed from: a */
    public final SharedPreferences f21004a;

    public ihc(Context context) {
        this.f21004a = context.getSharedPreferences("com.google.android.gms.auth.authzen.cryptauth.DeviceStateSyncManager", 0);
    }

    /* renamed from: a */
    public final void mo13005a() {
        this.f21004a.edit().putString("screenlock_state_history", "[]").apply();
    }

    /* renamed from: b */
    public final List mo13006b() {
        ihb ihb;
        try {
            JSONArray jSONArray = new JSONArray(this.f21004a.getString("screenlock_state_history", "[]"));
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                try {
                    ihb = new ihb(jSONObject.getLong("timestamp_millis"), jSONObject.getBoolean("is_secure"), jSONObject.getInt("count"));
                } catch (JSONException e) {
                    f21003b.mo25417e("Invalid JSON", e, new Object[0]);
                    ihb = null;
                }
                if (ihb != null) {
                    arrayList.add(ihb);
                    i++;
                } else {
                    throw new JSONException("Failed to parse entry.");
                }
            }
            return arrayList;
        } catch (JSONException e2) {
            f21003b.mo25417e("Invalid JSON for screenlock history.", e2, new Object[0]);
            mo13005a();
            return Arrays.asList(new ihb[0]);
        }
    }
}
