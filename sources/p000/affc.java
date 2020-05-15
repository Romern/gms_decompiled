package p000;

import android.os.Parcel;

/* renamed from: affc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class affc extends dck implements affd {

    /* renamed from: a */
    final /* synthetic */ biml f64227a;

    public affc() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        parcel.readInt();
        this.f64227a.f120908a.f120912a.f120938e.mo64767b(false);
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public affc(biml biml) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
        this.f64227a = biml;
    }
}
