package p000;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: afci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afci {

    /* renamed from: a */
    public static afeb f64179a;

    /* renamed from: a */
    public static afch m52839a(LatLng latLng) {
        try {
            return new afch(m52841a().mo34783a(latLng, 17.0f));
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    /* renamed from: a */
    public static afch m52840a(LatLngBounds latLngBounds, int i, int i2) {
        try {
            return new afch(m52841a().mo34785a(latLngBounds, i, i2, 0));
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    /* renamed from: a */
    public static afeb m52841a() {
        afeb afeb = f64179a;
        sdo.m34966a(afeb, "CameraUpdateFactory is not initialized");
        return afeb;
    }
}
