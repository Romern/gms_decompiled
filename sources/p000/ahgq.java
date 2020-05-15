package p000;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.os.Build;

/* renamed from: ahgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahgq {

    /* renamed from: a */
    public final NsdManager f67180a;

    public ahgq(Context context) {
        int i = Build.VERSION.SDK_INT;
        this.f67180a = (NsdManager) context.getApplicationContext().getSystemService("servicediscovery");
    }
}
