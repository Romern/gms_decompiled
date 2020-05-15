package p000;

import com.google.android.ulr.LatLngRect;

/* renamed from: bjcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjcr {
    /* renamed from: a */
    public static byeo m103201a(LatLngRect latLngRect) {
        if (latLngRect == null) {
            return null;
        }
        bxvd da = byeo.f165930d.mo74144da();
        if (latLngRect.getLo() != null) {
            byen a = bjcq.m103200a(latLngRect.getLo());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byeo byeo = (byeo) da.f164949b;
            a.getClass();
            byeo.f165933b = a;
            byeo.f165932a |= 1;
        }
        if (latLngRect.getHi() != null) {
            byen a2 = bjcq.m103200a(latLngRect.getHi());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byeo byeo2 = (byeo) da.f164949b;
            a2.getClass();
            byeo2.f165934c = a2;
            byeo2.f165932a |= 2;
        }
        return (byeo) da.mo74062i();
    }
}
