package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.Fragment;
import com.google.android.gms.maps.MapView;

/* renamed from: bilv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bilv extends Fragment {

    /* renamed from: a */
    private MapView f120864a;

    /* renamed from: b */
    private boolean f120865b = false;

    /* renamed from: c */
    private boolean f120866c = false;

    /* renamed from: d */
    private Bundle f120867d = null;

    /* renamed from: a */
    public final void mo64749a(MapView mapView) {
        MapView mapView2 = this.f120864a;
        if (mapView2 != null) {
            if (this.f120866c) {
                mapView2.mo43846b();
            }
            if (this.f120865b) {
                this.f120864a.mo43848c();
            }
        }
        this.f120864a = mapView;
        if (mapView != null) {
            if (this.f120865b) {
                try {
                    mapView.mo43845a(this.f120867d);
                } catch (NullPointerException e) {
                    Log.wtf("Places", "MapView threw NPE. This should only happen in tests.", e);
                }
            }
            if (this.f120866c) {
                this.f120864a.mo43843a();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f120865b = true;
        if (bundle != null) {
            bundle2 = bundle.getBundle("MapViewBundleKey");
        } else {
            bundle2 = null;
        }
        this.f120867d = bundle2;
        MapView mapView = this.f120864a;
        if (mapView != null) {
            try {
                mapView.mo43845a(bundle2);
            } catch (NullPointerException e) {
            }
        }
    }

    public final void onDestroy() {
        this.f120865b = false;
        MapView mapView = this.f120864a;
        if (mapView != null) {
            mapView.mo43848c();
        }
        super.onDestroy();
    }

    public final void onPause() {
        this.f120866c = false;
        MapView mapView = this.f120864a;
        if (mapView != null) {
            mapView.mo43846b();
        }
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.f120866c = true;
        MapView mapView = this.f120864a;
        if (mapView != null) {
            mapView.mo43843a();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f120864a != null) {
            Bundle bundle2 = bundle.getBundle("MapViewBundleKey");
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle("MapViewBundleKey", bundle2);
            }
            this.f120864a.mo43847b(bundle2);
        }
    }
}
