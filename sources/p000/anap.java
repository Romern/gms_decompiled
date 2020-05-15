package p000;

import android.content.SharedPreferences;

/* renamed from: anap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anap {

    /* renamed from: a */
    public final alsj f76498a;

    /* renamed from: b */
    public final String f76499b;

    /* renamed from: a */
    public final void mo41602a(boolean z, long j) {
        alsj alsj = this.f76498a;
        String str = this.f76499b;
        sdo.m34973b((String) null);
        SharedPreferences.Editor edit = alsj.f74200a.edit();
        String valueOf = String.valueOf(str);
        edit.putBoolean(valueOf.length() == 0 ? new String("focus_conditionally_reduce_page_size_enabled_") : "focus_conditionally_reduce_page_size_enabled_".concat(valueOf), z).commit();
        this.f76498a.mo40690b(this.f76499b);
        if (cfvl.m143183b()) {
            this.f76498a.mo40698d(this.f76499b);
        }
        alsj alsj2 = this.f76498a;
        String str2 = this.f76499b;
        SharedPreferences.Editor edit2 = alsj2.f74200a.edit();
        String valueOf2 = String.valueOf(str2);
        edit2.putLong(valueOf2.length() == 0 ? new String("focus_timestamp_of_page_size_change_") : "focus_timestamp_of_page_size_change_".concat(valueOf2), j).commit();
    }

    public anap(alsj alsj, String str) {
        this.f76498a = alsj;
        this.f76499b = str;
    }
}
