package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: affu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class affu extends dck implements affv {

    /* renamed from: a */
    final /* synthetic */ afcm f64230a;

    public affu() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        afig afig;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            afig = queryLocalInterface instanceof afig ? (afig) queryLocalInterface : new afie(readStrongBinder);
        } else {
            afig = null;
        }
        boolean a = this.f64230a.mo34745a(new afhg(afig));
        parcel2.writeNoException();
        dcl.m8166a(parcel2, a);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public affu(afcm afcm) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
        this.f64230a = afcm;
    }
}
