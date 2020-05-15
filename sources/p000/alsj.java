package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: alsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alsj {

    /* renamed from: b */
    private static alsj f74199b;

    /* renamed from: a */
    public final SharedPreferences f74200a;

    protected alsj() {
        this(null);
    }

    /* renamed from: a */
    public static synchronized alsj m61651a(Context context) {
        alsj alsj;
        synchronized (alsj.class) {
            if (f74199b == null) {
                f74199b = new alsj(context.getSharedPreferences("gms.people", 0));
            }
            alsj = f74199b;
        }
        return alsj;
    }

    /* renamed from: a */
    public static String m61654a(boolean z) {
        return !z ? "last_default_account_avatar_update_time" : "last_default_page_avatar_update_time";
    }

    /* renamed from: d */
    public static final String m61655d(String str, String str2) {
        String valueOf = String.valueOf(str2);
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }

    /* renamed from: b */
    public final int mo40686b(String str, String str2) {
        return this.f74200a.getInt(m61653a("sync_status_code_", str, str2), 0);
    }

    /* renamed from: c */
    public final int mo40693c() {
        return this.f74200a.getInt("show_sync_error_notification", 0);
    }

    /* renamed from: e */
    public final int mo40700e(String str) {
        SharedPreferences sharedPreferences = this.f74200a;
        String valueOf = String.valueOf(str);
        return sharedPreferences.getInt(valueOf.length() == 0 ? new String("sync_backoff_sec_") : "sync_backoff_sec_".concat(valueOf), 0);
    }

    /* renamed from: f */
    public final int mo40702f(String str) {
        SharedPreferences sharedPreferences = this.f74200a;
        String valueOf = String.valueOf(str);
        return sharedPreferences.getInt(valueOf.length() == 0 ? new String("sync_failures_") : "sync_failures_".concat(valueOf), 0);
    }

    /* renamed from: g */
    public final int mo40703g(String str) {
        SharedPreferences sharedPreferences = this.f74200a;
        String valueOf = String.valueOf(str);
        return sharedPreferences.getInt(valueOf.length() == 0 ? new String("focus_sync_failures_") : "focus_sync_failures_".concat(valueOf), 0);
    }

    /* renamed from: h */
    public final void mo40704h(String str) {
        sdo.m34973b((String) null);
        sdo.m34977c(str);
        String valueOf = String.valueOf(str);
        String lowerCase = (valueOf.length() == 0 ? new String("_") : "_".concat(valueOf)).toLowerCase();
        SharedPreferences.Editor edit = this.f74200a.edit();
        for (String str2 : this.f74200a.getAll().keySet()) {
            if (str2.toLowerCase().endsWith(lowerCase)) {
                edit.remove(str2);
            } else if (cfvx.m143256b()) {
                String valueOf2 = String.valueOf(lowerCase);
                String valueOf3 = String.valueOf(bmwb.m108442a("_com.android.contacts"));
                if (bmwb.m108442a(str2).endsWith(valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3))) {
                    edit.remove(str2);
                }
            }
        }
        edit.commit();
    }

    /* renamed from: i */
    public final void mo40705i(String str) {
        sdo.m34973b((String) null);
        SharedPreferences.Editor edit = this.f74200a.edit();
        String valueOf = String.valueOf(str);
        edit.remove(valueOf.length() == 0 ? new String("focus_first_full_sync_start_timestamp_") : "focus_first_full_sync_start_timestamp_".concat(valueOf)).commit();
    }

    /* renamed from: j */
    public final void mo40706j(String str) {
        sdo.m34973b((String) null);
        SharedPreferences.Editor edit = this.f74200a.edit();
        String valueOf = String.valueOf(str);
        edit.remove(valueOf.length() == 0 ? new String("focus_first_full_sync_finish_timestamp_") : "focus_first_full_sync_finish_timestamp_".concat(valueOf)).commit();
    }

    /* renamed from: k */
    public final int mo40707k(String str) {
        SharedPreferences sharedPreferences = this.f74200a;
        String valueOf = String.valueOf(str);
        return sharedPreferences.getInt(valueOf.length() == 0 ? new String("focus_first_full_sync_failed_times_") : "focus_first_full_sync_failed_times_".concat(valueOf), 0);
    }

    /* renamed from: l */
    public final boolean mo40708l(String str) {
        SharedPreferences sharedPreferences = this.f74200a;
        String valueOf = String.valueOf(str);
        return sharedPreferences.getBoolean(valueOf.length() == 0 ? new String("focus_progress_notification_dismissed_") : "focus_progress_notification_dismissed_".concat(valueOf), false);
    }

    /* renamed from: m */
    public final void mo40709m(String str) {
        sdo.m34967a((String) null);
        SharedPreferences.Editor edit = this.f74200a.edit();
        String valueOf = String.valueOf(str);
        edit.putBoolean(valueOf.length() == 0 ? new String("focus_progress_notification_dismissed_") : "focus_progress_notification_dismissed_".concat(valueOf), true).apply();
    }

    /* renamed from: n */
    public final boolean mo40710n(String str) {
        SharedPreferences sharedPreferences = this.f74200a;
        String valueOf = String.valueOf(str);
        return sharedPreferences.getBoolean(valueOf.length() == 0 ? new String("focus_seen_device_contacts_before_") : "focus_seen_device_contacts_before_".concat(valueOf), false);
    }

    /* renamed from: o */
    public final int mo40711o(String str) {
        SharedPreferences sharedPreferences = this.f74200a;
        String valueOf = String.valueOf(str);
        int a = amjm.m62974a(sharedPreferences.getInt(valueOf.length() == 0 ? new String("focus_first_full_sync_status_") : "focus_first_full_sync_status_".concat(valueOf), 0));
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public alsj(SharedPreferences sharedPreferences) {
        this.f74200a = sharedPreferences;
    }

    /* renamed from: a */
    public static final String m61652a(String str, String str2) {
        return String.format("last_sanity_check_%s_%s", ancm.m64011b(str2), ancm.m64011b(str));
    }

    /* renamed from: c */
    public final int mo40694c(String str) {
        SharedPreferences sharedPreferences = this.f74200a;
        String valueOf = String.valueOf(str);
        return sharedPreferences.getInt(valueOf.length() == 0 ? new String("focus_total_cancel_count_since_page_size_change_or_success_") : "focus_total_cancel_count_since_page_size_change_or_success_".concat(valueOf), 0);
    }

    /* renamed from: d */
    public final void mo40698d(String str) {
        sdo.m34973b((String) null);
        SharedPreferences.Editor edit = this.f74200a.edit();
        String valueOf = String.valueOf(str);
        edit.putInt(valueOf.length() == 0 ? new String("focus_total_cancel_count_since_page_size_change_or_success_") : "focus_total_cancel_count_since_page_size_change_or_success_".concat(valueOf), 0).commit();
    }

    /* renamed from: e */
    public final void mo40701e(String str, int i) {
        SharedPreferences.Editor edit = this.f74200a.edit();
        String valueOf = String.valueOf(str);
        edit.putInt(valueOf.length() == 0 ? new String("focus_last_device_contact_and_group_migrate_status_") : "focus_last_device_contact_and_group_migrate_status_".concat(valueOf), i - 1).apply();
    }

    /* renamed from: b */
    public final long mo40687b() {
        return this.f74200a.getLong("avatar_fetch_delay_until_sec", 0);
    }

    /* renamed from: c */
    public final String mo40695c(String str, String str2) {
        return this.f74200a.getString(m61653a("sync_status_message_", str, str2), "");
    }

    /* renamed from: a */
    private static final String m61653a(String str, String str2, String str3) {
        String d = m61655d(str, str2);
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 1 + String.valueOf(str3).length());
        sb.append(d);
        sb.append("_");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: b */
    public final long mo40688b(boolean z) {
        return this.f74200a.getLong(m61654a(z), 0);
    }

    /* renamed from: d */
    public final void mo40699d(String str, int i) {
        sdo.m34973b((String) null);
        SharedPreferences.Editor edit = this.f74200a.edit();
        String valueOf = String.valueOf(str);
        edit.putInt(valueOf.length() == 0 ? new String("focus_first_full_sync_status_") : "focus_first_full_sync_status_".concat(valueOf), i - 1).commit();
    }

    /* renamed from: b */
    public final void mo40689b(long j) {
        this.f74200a.edit().putLong("focus_sync_permission_denied_notify_time", j).commit();
    }

    /* renamed from: c */
    public final void mo40696c(String str, int i) {
        sdo.m34973b((String) null);
        SharedPreferences.Editor edit = this.f74200a.edit();
        String valueOf = String.valueOf(str);
        edit.putInt(valueOf.length() == 0 ? new String("focus_sync_backoff_sec_") : "focus_sync_backoff_sec_".concat(valueOf), i).commit();
    }

    /* renamed from: a */
    public final void mo40677a() {
        sdo.m34973b((String) null);
        this.f74200a.edit().putBoolean("is_first_sync", false).commit();
    }

    /* renamed from: b */
    public final void mo40690b(String str) {
        SharedPreferences.Editor edit = this.f74200a.edit();
        String valueOf = String.valueOf(str);
        edit.putInt(valueOf.length() == 0 ? new String("focus_continuous_cancel_count_since_page_size_change_") : "focus_continuous_cancel_count_since_page_size_change_".concat(valueOf), 0).commit();
    }

    /* renamed from: a */
    public final void mo40678a(int i) {
        sdo.m34973b((String) null);
        this.f74200a.edit().putInt("avatar_fetch_backoff_sec", i).commit();
    }

    /* renamed from: b */
    public final void mo40691b(String str, int i) {
        sdo.m34973b((String) null);
        SharedPreferences.Editor edit = this.f74200a.edit();
        String valueOf = String.valueOf(str);
        edit.putInt(valueOf.length() == 0 ? new String("sync_failures_") : "sync_failures_".concat(valueOf), i).commit();
    }

    /* renamed from: c */
    public final void mo40697c(boolean z) {
        sdo.m34973b((String) null);
        this.f74200a.edit().putBoolean("force_verbose_log", z).commit();
    }

    /* renamed from: a */
    public final void mo40679a(long j) {
        sdo.m34973b((String) null);
        this.f74200a.edit().putLong("avatar_fetch_delay_until_sec", j).commit();
    }

    /* renamed from: b */
    public final void mo40692b(boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, long j2) {
        sdo.m34973b((String) null);
        this.f74200a.edit().putBoolean("backup_and_sync_opt_in_validator_enabled", z).putLong("backup_and_sync_opt_in_validator_periodic_interval_seconds", j).putBoolean("backup_and_sync_opt_in_validator_requires_charging", z2).putBoolean("backup_and_sync_opt_in_validator_requires_device_idle", z3).putBoolean("backup_and_sync_opt_in_validator_persisted", z4).putBoolean("backup_and_sync_opt_in_validator_use_flex", z5).putLong("backup_and_sync_opt_in_validator_flex_seconds", j2).commit();
    }

    /* renamed from: a */
    public final void mo40680a(String str, int i) {
        sdo.m34973b((String) null);
        SharedPreferences.Editor edit = this.f74200a.edit();
        String valueOf = String.valueOf(str);
        edit.putInt(valueOf.length() == 0 ? new String("sync_backoff_sec_") : "sync_backoff_sec_".concat(valueOf), i).commit();
    }

    /* renamed from: a */
    public final void mo40681a(String str, long j) {
        SharedPreferences.Editor edit = this.f74200a.edit();
        String valueOf = String.valueOf(str);
        edit.putLong(valueOf.length() == 0 ? new String("focus_first_full_sync_failure_notification_last_show_timestamp_") : "focus_first_full_sync_failure_notification_last_show_timestamp_".concat(valueOf), j).apply();
    }

    /* renamed from: a */
    public final void mo40682a(String str, String str2, int i, String str3) {
        this.f74200a.edit().putInt(m61653a("sync_status_code_", str, str2), i).putString(m61653a("sync_status_message_", str, str2), str3).apply();
    }

    /* renamed from: a */
    public final void mo40683a(String str, boolean z) {
        sdo.m34973b((String) null);
        SharedPreferences.Editor edit = this.f74200a.edit();
        String valueOf = String.valueOf(str);
        edit.putBoolean(valueOf.length() == 0 ? new String("focus_sync_write_cp2_per_each_contact_") : "focus_sync_write_cp2_per_each_contact_".concat(valueOf), z).commit();
    }

    /* renamed from: a */
    public final void mo40684a(boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, long j2) {
        sdo.m34973b((String) null);
        this.f74200a.edit().putBoolean("deleted_null_contacts_cleanup_enabled", z).putLong("deleted_null_contacts_cleanup_periodic_interval_seconds", j).putBoolean("deleted_null_contacts_cleanup_requires_charging", z2).putBoolean("deleted_null_contacts_cleanup_requires_device_idle", z3).putBoolean("deleted_null_contacts_cleanup_persisted", z4).putBoolean("deleted_null_contacts_cleanup_use_flex", z5).putLong("deleted_null_contacts_cleanup_flex_seconds", j2).commit();
    }

    /* renamed from: a */
    public final boolean mo40685a(String str) {
        SharedPreferences sharedPreferences = this.f74200a;
        String valueOf = String.valueOf(str);
        return sharedPreferences.getBoolean(valueOf.length() == 0 ? new String("focus_conditionally_reduce_page_size_enabled_") : "focus_conditionally_reduce_page_size_enabled_".concat(valueOf), false);
    }
}
