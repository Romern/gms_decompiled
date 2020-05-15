package p000;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: aphn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aphn {

    /* renamed from: a */
    public final PowerManager f84393a;

    public aphn(Context context) {
        int i = Build.VERSION.SDK_INT;
        this.f84393a = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: a */
    public final boolean mo47221a() {
        int i = Build.VERSION.SDK_INT;
        PowerManager powerManager = this.f84393a;
        return powerManager != null && powerManager.isDeviceIdleMode();
    }
}
