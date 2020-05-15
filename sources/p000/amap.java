package p000;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

/* renamed from: amap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amap extends alzl {

    /* renamed from: a */
    private final rlf f74580a;

    /* renamed from: a */
    public final void mo40530a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
        Status a = amaz.m62474a(i, bundle);
        if (bundle2 != null) {
            bundle2.getBoolean("rewindable");
            bundle2.getInt("width");
            bundle2.getInt("height");
        }
        this.f74580a.mo9482a(new amav(a, parcelFileDescriptor));
    }

    public amap(rlf rlf) {
        this.f74580a = rlf;
    }
}
