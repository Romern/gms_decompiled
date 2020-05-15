package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: atkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atkm {

    /* renamed from: a */
    public static final srn f90418a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public static final Object f90419b = new Object();

    /* renamed from: c */
    public final SharedPreferences f90420c;

    public atkm(Context context) {
        this.f90420c = context.getSharedPreferences("com.google.android.gms.tapandpay.service.TapAndPayServiceStorage", 0);
    }

    /* renamed from: a */
    public final void mo50009a() {
        synchronized (f90419b) {
            this.f90420c.edit().putInt("lvt_taps_since_last_unlock", this.f90420c.getInt("lvt_taps_since_last_unlock", 0) + 1).apply();
        }
    }

    /* renamed from: b */
    public final void mo50015b(long j) {
        this.f90420c.edit().putLong("gms_core_rendered_notification_last_activated", j).apply();
    }

    /* renamed from: c */
    public final boolean mo50017c() {
        return mo50019e() == 0;
    }

    /* renamed from: d */
    public final int mo50018d() {
        return this.f90420c.getInt("lvt_taps_since_last_unlock", 0);
    }

    /* renamed from: e */
    public final int mo50019e() {
        return this.f90420c.getInt("inapp_transactions_since_last_unlock", 0);
    }

    /* renamed from: f */
    public final long mo50020f() {
        return this.f90420c.getLong("last_unlock", -1);
    }

    /* renamed from: g */
    public final boolean mo50021g() {
        return this.f90420c.getBoolean("tap_and_pay_enabled", false);
    }

    /* renamed from: h */
    public final boolean mo50022h() {
        return this.f90420c.getBoolean("gms_core_rendered_notifications_opt_out", false);
    }

    /* renamed from: i */
    public final Map mo50023i() {
        HashMap hashMap = new HashMap();
        String string = this.f90420c.getString("orphaned_account_counts", null);
        if (TextUtils.isEmpty(string)) {
            return hashMap;
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                hashMap.put(jSONObject.getString("account_id_or_name"), Integer.valueOf(jSONObject.getInt("count")));
            }
            return hashMap;
        } catch (JSONException e) {
            bnsl bnsl = (bnsl) f90418a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atkm", "i", 236, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unexpected error parsing orphaned accounts JSON");
            return new HashMap();
        }
    }

    /* renamed from: a */
    public final void mo50010a(int i, int i2) {
        this.f90420c.edit().putLong("quick_access_wallet_card_size", (((long) i2) & 4294967295L) | (((long) i) << 32)).apply();
    }

    /* renamed from: a */
    public final void mo50011a(long j) {
        synchronized (f90419b) {
            this.f90420c.edit().putLong("last_unlock", j).putInt("lvt_taps_since_last_unlock", 0).putInt("inapp_transactions_since_last_unlock", 0).putBoolean("remote_lock_hold", false).apply();
        }
    }

    /* renamed from: b */
    public final boolean mo50016b() {
        return mo50018d() == 0;
    }

    /* renamed from: a */
    public final void mo50012a(String str) {
        this.f90420c.edit().putString("dirty_hce_client_token_id", str).apply();
    }

    /* renamed from: a */
    public final void mo50013a(boolean z) {
        this.f90420c.edit().putBoolean("gms_core_rendered_notifications_opt_out", z).apply();
    }

    /* renamed from: a */
    public final void mo50014a(boolean z, long j) {
        this.f90420c.edit().putBoolean("last_attestation_result", z).putLong("last_attestation_result_time", j).apply();
    }
}
