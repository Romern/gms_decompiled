package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: affr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class affr extends dck implements affs {

    /* renamed from: a */
    final /* synthetic */ afcs f64229a;

    public affr() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        afei afei;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            afei = queryLocalInterface instanceof afei ? (afei) queryLocalInterface : new afeg(readStrongBinder);
        } else {
            afei = null;
        }
        this.f64229a.mo34763a(new afcn(afei));
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public affr(afcs afcs) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
        this.f64229a = afcs;
    }
}
