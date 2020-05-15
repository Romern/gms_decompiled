package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Looper;
import android.provider.Settings;

/* renamed from: sti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sti {

    /* renamed from: a */
    public volatile sth f45129a;

    /* renamed from: b */
    private final Context f45130b;

    /* renamed from: c */
    private final ContentObserver f45131c;

    public sti(Context context, Looper looper) {
        this.f45130b = context;
        this.f45131c = new stg(this, "location", "SettingsListener", new adzt(looper));
    }

    /* renamed from: a */
    public final void mo26072a() {
        this.f45130b.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("location_providers_allowed"), true, this.f45131c);
        mo26074c();
    }

    /* renamed from: b */
    public final void mo26073b() {
        this.f45130b.getContentResolver().unregisterContentObserver(this.f45131c);
    }

    /* renamed from: c */
    public final void mo26074c() {
        sth sth = this.f45129a;
        if (sth != null) {
            boolean isLocationProviderEnabled = Settings.Secure.isLocationProviderEnabled(this.f45130b.getContentResolver(), "gps");
            boolean z = true;
            if (!Settings.Secure.isLocationProviderEnabled(this.f45130b.getContentResolver(), "network") || aymk.m84257a(this.f45130b.getContentResolver(), "network_location_opt_in", -1) != 1) {
                z = false;
            }
            sth.mo26071a(isLocationProviderEnabled, z);
        }
    }
}
