package p000;

import com.google.android.gms.cast.CastDevice;

/* renamed from: pej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pej {

    /* renamed from: a */
    final CastDevice f38964a;

    /* renamed from: b */
    final pel f38965b;

    public pej(CastDevice castDevice, pel pel) {
        sdo.m34966a(castDevice, "CastDevice parameter cannot be null");
        sdo.m34966a(pel, "CastListener parameter cannot be null");
        this.f38964a = castDevice;
        this.f38965b = pel;
    }
}
