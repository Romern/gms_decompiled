package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: szq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class szq {

    /* renamed from: a */
    public static final bnhe f45523a = bnhe.m109409a(cbnw.RCS, "raster_consent", cbnw.CONSTELLATION, "constellation_consent");

    /* renamed from: c */
    private static WeakReference f45524c = new WeakReference(null);

    /* renamed from: b */
    public final rtj f45525b;

    private szq(Context context) {
        boolean z = true;
        if (!cdfz.m133088b() && !cdfz.m133089c()) {
            z = false;
        }
        this.f45525b = new rtj(context, "constellation_prefs", z, false);
    }

    /* renamed from: a */
    public static synchronized szq m36667a(Context context) {
        szq szq;
        synchronized (szq.class) {
            szq = (szq) f45524c.get();
            if (szq == null) {
                szq = new szq(context);
                f45524c = new WeakReference(szq);
            }
        }
        return szq;
    }

    /* renamed from: b */
    public final void mo26288b() {
        SharedPreferences.Editor edit = this.f45525b.edit();
        edit.remove("private_key");
        edit.apply();
    }

    /* renamed from: c */
    public final boolean mo26292c() {
        return this.f45525b.getBoolean("device_consent", false);
    }

    /* renamed from: d */
    public final long mo26293d() {
        return this.f45525b.getLong("last_consent_checked_timestamp_for_trigger_millis", -1);
    }

    /* renamed from: e */
    public final long mo26294e() {
        return this.f45525b.getLong("last_sync_with_server_time_millis", -1);
    }

    /* renamed from: f */
    public final long mo26295f() {
        return this.f45525b.getLong("last_client_state_check_timestamp_millis", -1);
    }

    /* renamed from: g */
    public final long mo26296g() {
        return this.f45525b.getLong("next_sync_timestamp_in_millis", -1);
    }

    /* renamed from: h */
    public final Pair mo26297h() {
        String string = this.f45525b.getString("next_sync_retry_timestamp_and_index_in_millis", "");
        tdz.m36796a();
        List a = tdz.m36795a(string);
        if (a.size() < 2) {
            return new Pair(-1L, 0);
        }
        return new Pair((Long) a.get(0), Integer.valueOf(((Long) a.get(1)).intValue()));
    }

    /* renamed from: i */
    public final void mo26298i() {
        SharedPreferences.Editor edit = this.f45525b.edit();
        edit.remove("next_sync_retry_timestamp_and_index_in_millis");
        edit.apply();
    }

    /* renamed from: j */
    public final void mo26299j() {
        SharedPreferences.Editor edit = this.f45525b.edit();
        edit.remove("sync_retry_scheduling_frozen_timestamp_in_millis");
        edit.apply();
    }

    /* renamed from: k */
    public final boolean mo26300k() {
        return this.f45525b.getBoolean("automatic_cost_setting", false);
    }

    /* renamed from: l */
    public final boolean mo26301l() {
        return this.f45525b.getBoolean("checkers_active", false);
    }

    /* renamed from: b */
    public final void mo26289b(long j) {
        SharedPreferences.Editor edit = this.f45525b.edit();
        edit.putLong("next_sync_timestamp_in_millis", j);
        edit.apply();
    }

    /* renamed from: a */
    public final String mo26282a(String str, String str2) {
        return this.f45525b.getString(str, str2);
    }

    /* renamed from: b */
    public final void mo26290b(String str, String str2) {
        SharedPreferences.Editor edit = this.f45525b.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo26283a() {
        SharedPreferences.Editor edit = this.f45525b.edit();
        edit.remove("public_key");
        edit.apply();
    }

    /* renamed from: b */
    public final void mo26291b(boolean z) {
        SharedPreferences.Editor edit = this.f45525b.edit();
        edit.putBoolean("is_public_key_acked", z);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo26284a(long j) {
        SharedPreferences.Editor edit = this.f45525b.edit();
        edit.putLong("last_consent_checked_timestamp_for_trigger_millis", j);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo26285a(long j, int i) {
        StringBuilder sb = new StringBuilder(32);
        sb.append(j);
        sb.append(",");
        sb.append(i);
        String sb2 = sb.toString();
        SharedPreferences.Editor edit = this.f45525b.edit();
        edit.putString("next_sync_retry_timestamp_and_index_in_millis", sb2);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo26286a(Boolean bool) {
        SharedPreferences.Editor edit = this.f45525b.edit();
        edit.putBoolean("automatic_cost_setting", bool.booleanValue());
        edit.apply();
    }

    /* renamed from: a */
    public final void mo26287a(boolean z) {
        SharedPreferences.Editor edit = this.f45525b.edit();
        edit.putBoolean("device_consent", z);
        edit.apply();
    }
}
