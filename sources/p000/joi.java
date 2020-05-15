package p000;

import android.content.Context;

/* renamed from: joi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class joi {

    /* renamed from: a */
    public final Context f22937a;

    public joi(Context context) {
        this.f22937a = context;
    }

    /* renamed from: a */
    public final void mo13940a(String str) {
        this.f22937a.getSharedPreferences("com.google.android.gms.auth.proximity.firstparty.DEVICE_SYNC_CONFIG_PREFERENCE_FILE", 0).edit().remove(mo13943c(str)).apply();
    }

    /* renamed from: b */
    public abstract String mo13942b(String str);

    /* renamed from: c */
    public abstract String mo13943c(String str);

    /* renamed from: a */
    public final void mo13941a(String str, long j) {
        this.f22937a.getSharedPreferences("com.google.android.gms.auth.proximity.firstparty.DEVICE_SYNC_CONFIG_PREFERENCE_FILE", 0).edit().putLong(mo13943c(str), j).apply();
    }
}
