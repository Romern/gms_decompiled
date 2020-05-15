package p000;

import android.content.Context;

/* renamed from: afaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afaq {

    /* renamed from: a */
    public final Context f64097a;

    public afaq(Context context) {
        this.f64097a = context;
    }

    /* renamed from: a */
    public final void mo34715a(boolean z) {
        this.f64097a.getSharedPreferences("com.google.android.gms.magictether.host.PROVISIONING_RESULT_PREFERENCE_FILE", 0).edit().putBoolean("com.google.android.gms.magictether.LAST_PROVISIONING_RESULT", z).commit();
    }
}
