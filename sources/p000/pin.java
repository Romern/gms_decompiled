package p000;

import com.google.android.gms.cast.CastDevice;

/* renamed from: pin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pin {

    /* renamed from: a */
    public final piy f39237a;

    /* renamed from: b */
    public final pkc f39238b;

    /* renamed from: c */
    public final pmx f39239c;

    public pin(piy piy, pkc pkc, pmx pmx) {
        sdo.m34959a(piy);
        sdo.m34959a(pkc);
        sdo.m34959a(pmx);
        this.f39237a = piy;
        this.f39238b = pkc;
        this.f39239c = pmx;
    }

    /* renamed from: a */
    public static boolean m30484a(CastDevice castDevice, pim pim, pmx pmx) {
        if (!pie.f39205a || !pim.f39232a.equals("com.google.android.apps.chromecast.app") || pmx.mo23464c(castDevice.mo17494a()) == null) {
            return false;
        }
        return true;
    }
}
