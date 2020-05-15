package p000;

import android.os.Bundle;

/* renamed from: arzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arzc extends arze {

    /* renamed from: c */
    private static final sek f88506c = ascp.m73787a("Setup", "UI", "HeadlessLockScreenFragment");

    /* renamed from: b */
    private boolean f88507b = false;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f88506c.mo25409a("Created headless Lock Screen fragment", new Object[0]);
        if (bundle != null) {
            this.f88507b = bundle.getBoolean("deviceLocked", false);
        }
        if (!this.f88507b) {
            this.f88507b = true;
            f88506c.mo25412b("Locking device", new Object[0]);
            mo48964a();
            return;
        }
        f88506c.mo25412b("Device already locked", new Object[0]);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("deviceLocked", this.f88507b);
    }
}
