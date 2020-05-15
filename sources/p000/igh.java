package p000;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;

/* renamed from: igh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class igh {

    /* renamed from: a */
    private final KeyguardManager f20922a;

    public igh(Context context) {
        this.f20922a = (KeyguardManager) context.getSystemService("keyguard");
    }

    /* renamed from: a */
    public final boolean mo12993a() {
        int i = Build.VERSION.SDK_INT;
        return !this.f20922a.isDeviceLocked();
    }

    /* renamed from: b */
    public final boolean mo12994b() {
        int i = Build.VERSION.SDK_INT;
        return this.f20922a.isDeviceSecure();
    }
}
