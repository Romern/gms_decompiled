package p000;

import android.os.Bundle;
import android.util.Log;

/* renamed from: amah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amah extends alzl {

    /* renamed from: a */
    private final rod f74571a;

    /* renamed from: a */
    public final void mo41074a() {
        this.f74571a.mo24967a();
    }

    public amah(rod rod) {
        this.f74571a = rod;
    }

    /* renamed from: a */
    public final void mo40528a(int i, Bundle bundle, Bundle bundle2) {
        if (i == 0) {
            rod rod = this.f74571a;
            bundle2.getString("account");
            bundle2.getString("pagegaiaid");
            bundle2.getInt("scope");
            rod.mo24968a(new alzv());
            return;
        }
        Log.w("PeopleClient", "Non-success data changed callback received.");
    }
}
