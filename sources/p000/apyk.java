package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: apyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apyk {

    /* renamed from: a */
    public final SharedPreferences f85143a;

    /* renamed from: b */
    public final SharedPreferences f85144b;

    /* renamed from: c */
    public final PackageManager f85145c;

    public apyk(Context context) {
        this.f85143a = PreferenceManager.getDefaultSharedPreferences(context);
        this.f85144b = context.getSharedPreferences("com.google.android.gms.safetynet", 0);
        this.f85145c = context.getPackageManager();
    }

    /* renamed from: a */
    public static void m71178a(SharedPreferences sharedPreferences, String str, long j) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong(str, j);
        edit.commit();
    }

    /* renamed from: b */
    public static String m71180b(int i) {
        StringBuilder sb = new StringBuilder(50);
        sb.append("snet_safe_browsing_last_update_time_ms_");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: c */
    public final long mo47705c() {
        return this.f85143a.getLong("snet_safe_browsing_next_allowed_time_to_update_ms", 0);
    }

    /* renamed from: d */
    public final Set mo47707d() {
        return new HashSet(this.f85143a.getStringSet("snet_upload_requested_apks", Collections.emptySet()));
    }

    /* renamed from: a */
    protected static final void m71179a(SharedPreferences sharedPreferences, String str, String str2) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    /* renamed from: b */
    public final long mo47704b() {
        return this.f85143a.getLong("snet_safe_browsing_last_update_time_ms", 0);
    }

    /* renamed from: c */
    public final void mo47706c(int i) {
        mo47700a("snet_safe_browsing_num_consecutive_update_errors", i);
    }

    /* renamed from: a */
    public final long mo47697a(int i) {
        return this.f85143a.getLong(m71180b(i), 0);
    }

    /* renamed from: a */
    public final String mo47698a() {
        return this.f85143a.getString("snet_saved_package_url", "");
    }

    /* renamed from: a */
    public final void mo47699a(long j) {
        mo47701a("snet_safe_browsing_next_allowed_time_to_update_ms", j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47700a(String str, int i) {
        SharedPreferences.Editor edit = this.f85143a.edit();
        edit.putInt(str, i);
        edit.commit();
    }

    /* renamed from: a */
    public final void mo47701a(String str, long j) {
        m71178a(this.f85143a, str, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47702a(String str, String str2) {
        m71179a(this.f85143a, str, str2);
    }

    /* renamed from: a */
    public final void mo47703a(String str, Set set) {
        SharedPreferences.Editor edit = this.f85144b.edit();
        edit.putStringSet(str, set);
        edit.commit();
    }
}
