package p000;

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: affm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class affm extends dck implements affn {

    /* renamed from: a */
    final /* synthetic */ afcl f64228a;

    public affm() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        LatLng latLng = (LatLng) dcl.m8163a(parcel, LatLng.CREATOR);
        this.f64228a.mo34744b();
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public affm(afcl afcl) {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
        this.f64228a = afcl;
    }
}
