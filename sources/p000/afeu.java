package p000;

import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: afeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afeu extends dck implements afev {

    /* renamed from: a */
    final /* synthetic */ afck f64225a;

    public afeu() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) dcl.m8163a(parcel, CameraPosition.CREATOR);
        this.f64225a.mo34743a();
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afeu(afck afck) {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
        this.f64225a = afck;
    }
}
