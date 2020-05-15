package p000;

import android.os.IInterface;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* renamed from: afef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface afef extends IInterface {
    void init(vzr vzr);

    void initV2(vzr vzr, int i);

    afhu newBitmapDescriptorFactoryDelegate();

    afeb newCameraUpdateFactoryDelegate();

    afep newMapFragmentDelegate(vzr vzr);

    afes newMapViewDelegate(vzr vzr, GoogleMapOptions googleMapOptions);

    afgm newStreetViewPanoramaFragmentDelegate(vzr vzr);

    afgp newStreetViewPanoramaViewDelegate(vzr vzr, StreetViewPanoramaOptions streetViewPanoramaOptions);
}
