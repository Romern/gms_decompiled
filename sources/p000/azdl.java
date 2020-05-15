package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: azdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azdl {

    /* renamed from: c */
    private static azdl f99087c;

    /* renamed from: a */
    public final rtj f99088a;

    /* renamed from: b */
    public final Context f99089b;

    public azdl(Context context) {
        this.f99089b = context;
        this.f99088a = new rtj(context, "matchstick_prefs", true);
    }

    /* renamed from: a */
    public static synchronized azdl m85412a(Context context) {
        azdl azdl;
        synchronized (azdl.class) {
            if (f99087c == null) {
                f99087c = new azdl(context.getApplicationContext());
            }
            azdl = f99087c;
        }
        return azdl;
    }

    /* renamed from: b */
    public static final String m85414b(Context context) {
        return new rtj(context, "matchstick_prefs", false).getString("active_user_number", "");
    }

    /* renamed from: c */
    public static final String m85415c(Context context) {
        return new rtj(context, "matchstick_prefs", false).getString("default_gaia_user_id", "");
    }

    /* renamed from: d */
    public static final String m85416d(Context context) {
        return new rtj(context, "matchstick_prefs", false).getString("default_user_id", "");
    }

    /* renamed from: e */
    public static final int m85417e(Context context) {
        return new rtj(context, "matchstick_prefs", false).getInt("default_user_type", 0);
    }

    /* renamed from: f */
    public static final boolean m85418f(Context context) {
        rtj rtj = new rtj(context, "matchstick_prefs", false);
        if (!cfec.m138765b() || !rtj.getBoolean("tachyon_gaia_registration_status", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static final boolean m85419g(Context context) {
        rtj rtj = new rtj(context, "matchstick_prefs", false);
        if (rtj.getBoolean("tachyon_registration_status", false) || rtj.getBoolean("tachyon_gaia_registration_status", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m85420h(Context context) {
        return new rtj(context, "matchstick_prefs", false).getBoolean("tachyon_registration_status", false);
    }

    @Deprecated
    /* renamed from: A */
    public final boolean mo54727A() {
        return mo54804z() == null || this.f99088a.getLong("anonymous_registration_auth_expiration_timestamp_ms", -1) - cfeo.m138867X() < System.currentTimeMillis();
    }

    @Deprecated
    /* renamed from: B */
    public final byte[] mo54728B() {
        return mo54781h("anonymous_registration_private_key");
    }

    @Deprecated
    /* renamed from: C */
    public final byte[] mo54729C() {
        return mo54781h("anonymous_registration_public_key");
    }

    /* renamed from: D */
    public final long mo54730D() {
        return this.f99088a.getLong("check_registration_request_status", -1);
    }

    /* renamed from: E */
    public final boolean mo54731E() {
        return this.f99088a.getBoolean("user_unregistered_override", false);
    }

    /* renamed from: F */
    public final long mo54732F() {
        return this.f99088a.getLong("silent_register_retry_backoff_interval_millis", 0);
    }

    @Deprecated
    /* renamed from: G */
    public final boolean mo54733G() {
        return this.f99088a.getInt("tachyon_idkey_version", 0) != 1;
    }

    /* renamed from: H */
    public final boolean mo54734H() {
        return this.f99088a.getBoolean("is_removing_message_after_7_days", false);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0060, code lost:
        if (r1.getInt(r1.getColumnIndexOrThrow("type")) == 1) goto L_0x0066;
     */
    /* renamed from: I */
    public final boolean mo54735I() {
        azcw a = azcw.m85379a(this.f99089b);
        Cursor cursor = null;
        Boolean bool = false;
        if (!TextUtils.isEmpty("upgraded_to_lighter_registration_key")) {
            Executor executor = azox.f99803a;
            azcm a2 = azcm.m85300a(a.f99018a);
            if (!a2.mo54651a()) {
                a2.f98996b = azcl.m85289a(a2.f98995a).getReadableDatabase();
            }
            a2.f98996b.beginTransaction();
            try {
                Cursor query = a2.f98996b.query("sharedPreference", null, "key = ?", new String[]{"upgraded_to_lighter_registration_key"}, null, null, null);
                a2.f98996b.setTransactionSuccessful();
                a2.f98996b.endTransaction();
                if (query.moveToFirst()) {
                }
                cursor = query;
            } catch (Throwable th) {
                a2.f98996b.endTransaction();
                throw th;
            }
        }
        if (cursor != null && cursor.moveToFirst()) {
            try {
                bool = Boolean.valueOf(Boolean.parseBoolean(cursor.getString(cursor.getColumnIndexOrThrow("value"))));
            } catch (IllegalArgumentException e) {
                String valueOf = String.valueOf(e.getMessage());
                azoj.m85933c("MsDataManager", valueOf.length() == 0 ? new String("getBooleanForKey() e:") : "getBooleanForKey() e:".concat(valueOf), new Object[0]);
            } finally {
                cursor.close();
            }
        }
        return bool.booleanValue();
    }

    /* renamed from: J */
    public final boolean mo54736J() {
        return this.f99088a.getBoolean("tachystick_activated", false);
    }

    /* renamed from: K */
    public final synchronized void mo54737K() {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putInt("number_of_anonymous_chats", 0);
        edit.apply();
    }

    @Deprecated
    /* renamed from: i */
    public final long mo54782i() {
        return this.f99088a.getLong("periodic_token_refresh_interval_ms", 0);
    }

    /* renamed from: j */
    public final long mo54785j() {
        return this.f99088a.getLong("periodic_sync_interval_ms", 0);
    }

    /* renamed from: k */
    public final void mo54788k(long j) {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putLong("silent_register_retry_backoff_interval_millis", j);
        edit.apply();
    }

    @Deprecated
    /* renamed from: l */
    public final byte[] mo54790l() {
        return mo54781h("tachyon_private_key");
    }

    @Deprecated
    /* renamed from: m */
    public final String mo54791m() {
        return this.f99088a.getString("gcm_token_key", null);
    }

    @Deprecated
    /* renamed from: n */
    public final boolean mo54792n() {
        return mo54760c() == null;
    }

    @Deprecated
    /* renamed from: o */
    public final boolean mo54793o() {
        return mo54792n() || this.f99088a.getLong("tachyon_auth_expiration_timestamp_ms", -1) - cfeo.m138867X() < System.currentTimeMillis();
    }

    /* renamed from: p */
    public final boolean mo54794p() {
        long j = this.f99088a.getLong("last_gcm_tickle_time_for_bind_ms", 0);
        return j == 0 || j + TimeUnit.DAYS.toMillis(cfeo.f183719a.mo6606a().mo80984ar()) < System.currentTimeMillis();
    }

    /* renamed from: q */
    public final boolean mo54795q() {
        return !bmxi.m108538a(Long.valueOf(this.f99088a.getLong("current_registration_data_schema_version_key", -1)), 3L);
    }

    /* renamed from: r */
    public final void mo54796r() {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putLong("current_registration_data_schema_version_key", 3);
        edit.apply();
    }

    /* renamed from: s */
    public final long mo54797s() {
        return this.f99088a.getLong("last_silent_register_attempt_timestamp_key", 0);
    }

    /* renamed from: t */
    public final int mo54798t() {
        return this.f99088a.getInt("num_silent_register_attempts", 0);
    }

    /* renamed from: u */
    public final void mo54799u() {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putInt("num_silent_register_attempts", mo54798t() + 1);
        edit.apply();
    }

    /* renamed from: v */
    public final void mo54800v() {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.remove("num_silent_register_attempts");
        edit.apply();
    }

    /* renamed from: w */
    public final String mo54801w() {
        return this.f99088a.getString("user_register_phone_number", null);
    }

    /* renamed from: x */
    public final boolean mo54802x() {
        return this.f99088a.getBoolean("anonymous_registration_is_registered", false);
    }

    /* renamed from: y */
    public final boolean mo54803y() {
        return this.f99088a.getBoolean("client_status_report_scheduling_enabled", false);
    }

    /* renamed from: z */
    public final byte[] mo54804z() {
        return mo54781h("anonymous_registration_auth_token");
    }

    /* renamed from: a */
    private final void m85413a(String str, byte[] bArr) {
        if (bArr != null) {
            String encodeToString = Base64.encodeToString(bArr, 2);
            SharedPreferences.Editor edit = this.f99088a.edit();
            edit.putString(str, encodeToString);
            edit.apply();
            return;
        }
        SharedPreferences.Editor edit2 = this.f99088a.edit();
        edit2.remove(str);
        edit2.apply();
    }

    /* renamed from: b */
    public final String mo54748b() {
        return this.f99088a.getString("sim_serial_number", null);
    }

    /* renamed from: c */
    public final void mo54755c(long j) {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putLong("last_gcm_tickle_time_for_bind_ms", j);
        edit.apply();
    }

    /* renamed from: d */
    public final long mo54761d() {
        return this.f99088a.getLong("tachyon_auth_expiration_timestamp_ms", -1);
    }

    /* renamed from: e */
    public final void mo54766e(long j) {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putLong("anonymous_registration_status", j);
        edit.apply();
    }

    /* renamed from: i */
    public final void mo54783i(long j) {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putLong("verify_request_status", j);
        edit.apply();
    }

    /* renamed from: j */
    public final void mo54786j(long j) {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putLong("check_registration_request_status", j);
        edit.apply();
    }

    @Deprecated
    /* renamed from: k */
    public final byte[] mo54789k() {
        return mo54781h("tachyon_public_key");
    }

    @Deprecated
    /* renamed from: b */
    public final void mo54749b(int i) {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putInt("tachyon_idkey_version", i);
        edit.apply();
    }

    /* renamed from: c */
    public final void mo54756c(cblx cblx) {
        if (cblx != null && !cblx.f177577a.equals(ByteString.f164797b)) {
            SharedPreferences.Editor edit = this.f99088a.edit();
            edit.putString("user_register_response_auth_token", Base64.encodeToString(cblx.f177577a.getKey(), 2));
            edit.apply();
            return;
        }
        SharedPreferences.Editor edit2 = this.f99088a.edit();
        edit2.remove("user_register_response_auth_token");
        edit2.apply();
    }

    /* renamed from: d */
    public final void mo54762d(long j) {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putLong("last_silent_register_attempt_timestamp_key", j);
        edit.apply();
    }

    @Deprecated
    /* renamed from: e */
    public final void mo54767e(String str) {
        mo54743a("google_account_name_key", str);
    }

    @Deprecated
    /* renamed from: f */
    public final void mo54771f(long j) {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putLong("check_anonymous_registration_status", j);
        edit.apply();
    }

    /* renamed from: g */
    public final void mo54776g(long j) {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putLong("user_unregister_request_status", j);
        edit.apply();
    }

    @Deprecated
    /* renamed from: h */
    public final long mo54779h() {
        return this.f99088a.getLong("last_registration_check_on_token_refresh_ms_key", 0);
    }

    /* renamed from: i */
    public final void mo54784i(String str) {
        mo54743a("last_silent_register_attempt_outcome", str);
    }

    /* renamed from: j */
    public final void mo54787j(String str) {
        mo54743a("user_register_phone_number", str);
    }

    @Deprecated
    /* renamed from: b */
    public final void mo54750b(long j) {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putLong("last_successful_token_refresh_timestamp_millis", j);
        edit.apply();
    }

    @Deprecated
    /* renamed from: d */
    public final void mo54763d(String str) {
        mo54743a("active_user_number", str);
    }

    /* renamed from: e */
    public final void mo54768e(boolean z) {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putBoolean("registration_is_user_triggered", z);
        edit.apply();
    }

    /* renamed from: f */
    public final void mo54772f(String str) {
        mo54743a("sim_serial_number", str);
    }

    @Deprecated
    /* renamed from: g */
    public final void mo54777g(String str) {
        mo54743a("gcm_token_key", str);
    }

    /* renamed from: h */
    public final void mo54780h(long j) {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putLong("user_register_request_status", j);
        edit.apply();
    }

    @Deprecated
    /* renamed from: a */
    public final String mo54738a() {
        return this.f99088a.getString("active_user_number", null);
    }

    /* renamed from: b */
    public final void mo54751b(cblx cblx) {
        if (cblx != null && !cblx.f177577a.equals(ByteString.f164797b)) {
            SharedPreferences.Editor edit = this.f99088a.edit();
            edit.putString("anonymous_registration_auth_token", Base64.encodeToString(cblx.f177577a.getKey(), 2));
            edit.putLong("anonymous_registration_auth_expiration_timestamp_ms", System.currentTimeMillis() + TimeUnit.MICROSECONDS.toMillis(cblx.f177578b));
            edit.apply();
            return;
        }
        SharedPreferences.Editor edit2 = this.f99088a.edit();
        edit2.remove("anonymous_registration_auth_token");
        edit2.remove("anonymous_registration_auth_expiration_timestamp_ms");
        edit2.apply();
    }

    /* renamed from: d */
    public final void mo54764d(boolean z) {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putBoolean("user_unregistered_override", z);
        edit.apply();
    }

    /* renamed from: e */
    public final void mo54769e(byte[] bArr) {
        m85413a("user_register_public_key", bArr);
    }

    /* renamed from: f */
    public final void mo54773f(boolean z) {
        azcw.m85379a(this.f99089b).mo54708a("upgraded_to_lighter_registration_key", Boolean.toString(z), 1);
    }

    /* renamed from: g */
    public final boolean mo54778g() {
        return cfec.m138765b() && this.f99088a.getBoolean("tachyon_gaia_registration_status", false);
    }

    /* renamed from: h */
    public final byte[] mo54781h(String str) {
        String string = this.f99088a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            return Base64.decode(string, 0);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo54739a(int i) {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putInt("default_user_type", i);
        edit.apply();
    }

    @Deprecated
    /* renamed from: d */
    public final void mo54765d(byte[] bArr) {
        m85413a("anonymous_registration_public_key", bArr);
    }

    @Deprecated
    /* renamed from: e */
    public final boolean mo54770e() {
        return mo54775f() || mo54778g();
    }

    @Deprecated
    /* renamed from: a */
    public final void mo54740a(long j) {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putLong("last_registration_check_on_token_refresh_ms_key", j);
        edit.apply();
    }

    @Deprecated
    /* renamed from: a */
    public final void mo54741a(cblx cblx) {
        if (cblx != null && !cblx.f177577a.equals(ByteString.f164797b)) {
            SharedPreferences.Editor edit = this.f99088a.edit();
            edit.putString("tachyon_auth_token", Base64.encodeToString(cblx.f177577a.getKey(), 2));
            edit.putLong("tachyon_auth_expiration_timestamp_ms", System.currentTimeMillis() + TimeUnit.MICROSECONDS.toMillis(cblx.f177578b));
            edit.apply();
            return;
        }
        SharedPreferences.Editor edit2 = this.f99088a.edit();
        edit2.remove("tachyon_auth_token");
        edit2.remove("tachyon_auth_expiration_timestamp_ms");
        edit2.apply();
    }

    /* renamed from: f */
    public final void mo54774f(byte[] bArr) {
        m85413a("user_register_private_key", bArr);
    }

    /* renamed from: c */
    public final void mo54757c(String str) {
        mo54743a("default_gaia_user_id", str);
    }

    @Deprecated
    /* renamed from: f */
    public final boolean mo54775f() {
        return this.f99088a.getBoolean("tachyon_registration_status", false);
    }

    /* renamed from: c */
    public final void mo54758c(boolean z) {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putBoolean("client_status_report_scheduling_enabled", z);
        edit.apply();
    }

    @Deprecated
    /* renamed from: c */
    public final void mo54759c(byte[] bArr) {
        m85413a("anonymous_registration_private_key", bArr);
    }

    @Deprecated
    /* renamed from: c */
    public final byte[] mo54760c() {
        return mo54781h("tachyon_auth_token");
    }

    /* renamed from: b */
    public final void mo54752b(String str) {
        mo54743a("default_user_id", str);
    }

    /* renamed from: b */
    public final void mo54753b(boolean z) {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putBoolean("anonymous_registration_is_registered", z);
        edit.apply();
    }

    @Deprecated
    /* renamed from: b */
    public final void mo54754b(byte[] bArr) {
        m85413a("tachyon_private_key", bArr);
    }

    /* renamed from: a */
    public final void mo54742a(String str) {
        mo54743a("gcm_project", str);
    }

    /* renamed from: a */
    public final void mo54743a(String str, String str2) {
        if (str2 == null) {
            SharedPreferences.Editor edit = this.f99088a.edit();
            edit.remove(str);
            edit.apply();
            return;
        }
        SharedPreferences.Editor edit2 = this.f99088a.edit();
        edit2.putString(str, str2);
        edit2.apply();
    }

    /* renamed from: a */
    public final void mo54744a(Set set) {
        if (set == null) {
            SharedPreferences.Editor edit = this.f99088a.edit();
            edit.remove("sim_serial_numbers_set");
            edit.apply();
            return;
        }
        SharedPreferences.Editor edit2 = this.f99088a.edit();
        edit2.putStringSet("sim_serial_numbers_set", set);
        edit2.apply();
    }

    @Deprecated
    /* renamed from: a */
    public final void mo54745a(boolean z) {
        SharedPreferences.Editor edit = this.f99088a.edit();
        edit.putBoolean("tachyon_registration_status", z);
        edit.apply();
    }

    @Deprecated
    /* renamed from: a */
    public final void mo54746a(byte[] bArr) {
        m85413a("tachyon_public_key", bArr);
    }

    /* renamed from: a */
    public final void mo54747a(int[] iArr) {
        String str;
        if (iArr != null) {
            str = azpi.m86067a(iArr);
        } else {
            str = null;
        }
        mo54743a("capability_list_unique_string", str);
    }
}
