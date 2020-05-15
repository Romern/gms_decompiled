package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: aqfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqfw {

    /* renamed from: a */
    public final SharedPreferences f86016a;

    public aqfw(Context context) {
        this.f86016a = context.getSharedPreferences("com.google.android.gms.snet", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo47848a() {
        return this.f86016a.getLong("snet_event_log_last_timestamp", -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo47854b() {
        return this.f86016a.getLong("snet_last_idle_run_timestamp", -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo47857c() {
        cgkr.m145927c();
        return this.f86016a.getBoolean("is_blocked_bal_collection_enabled_for_device", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47849a(long j) {
        mo47851a("snet_event_log_last_timestamp", j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo47855b(long j) {
        mo47851a("snet_last_idle_run_timestamp", j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47850a(String str) {
        SharedPreferences.Editor edit = this.f86016a.edit();
        edit.putString("snet_jpeg_filename", str);
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo47856b(boolean z) {
        mo47852a("snet_jpeg_previously_tampered", z);
    }

    /* renamed from: a */
    public final void mo47851a(String str, long j) {
        SharedPreferences.Editor edit = this.f86016a.edit();
        edit.putLong(str, j);
        edit.commit();
    }

    /* renamed from: a */
    public final void mo47852a(String str, boolean z) {
        SharedPreferences.Editor edit = this.f86016a.edit();
        edit.putBoolean(str, z);
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47853a(boolean z) {
        mo47852a("snet_jpeg_written_to_sdcard", z);
    }
}
