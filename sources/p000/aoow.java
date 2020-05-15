package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: aoow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoow {

    /* renamed from: a */
    public final rtj f78624a;

    public aoow(Context context) {
        this.f78624a = new rtj(context, "rcs_prefs", false);
    }

    /* renamed from: a */
    public final String mo43138a() {
        return this.f78624a.getString("package_name", null);
    }

    /* renamed from: b */
    public final String mo43139b() {
        return this.f78624a.getString("service_action", null);
    }

    /* renamed from: c */
    public final String mo43140c() {
        return this.f78624a.getString("token", "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo43141d() {
        SharedPreferences.Editor edit = this.f78624a.edit();
        edit.remove("binding_requested");
        edit.remove("package_name");
        edit.remove("service_action");
        edit.remove("token");
        edit.apply();
    }
}
