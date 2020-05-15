package p000;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: aejn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aejn {
    /* renamed from: a */
    public static final Location m51936a(rkb rkb) {
        try {
            return aeie.m51875a(rkb).mo34247a((String) null);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static final void m51937a(rkb rkb, LocationRequestInternal locationRequestInternal, aehz aehz, Looper looper) {
        rkb.mo24795b(new aejh(rkb, locationRequestInternal, aehz, looper));
    }
}
