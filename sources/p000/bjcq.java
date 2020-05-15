package p000;

import com.google.android.ulr.LatLng;

/* renamed from: bjcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjcq {
    /* renamed from: a */
    public static byen m103200a(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        bxvd da = byen.f165925d.mo74144da();
        if (latLng.mo71638b() != null) {
            int intValue = latLng.mo71638b().intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byen byen = (byen) da.f164949b;
            byen.f165927a |= 1;
            byen.f165928b = intValue;
        }
        if (latLng.mo71639c() != null) {
            int intValue2 = latLng.mo71639c().intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byen byen2 = (byen) da.f164949b;
            byen2.f165927a |= 2;
            byen2.f165929c = intValue2;
        }
        return (byen) da.mo74062i();
    }
}
