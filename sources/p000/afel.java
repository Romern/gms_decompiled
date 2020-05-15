package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: afel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afel extends dck implements afem {

    /* renamed from: a */
    final /* synthetic */ afcp f64222a;

    public afel() {
        super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        affk affk = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                if (queryLocalInterface instanceof affk) {
                    affk = (affk) queryLocalInterface;
                } else {
                    affk = new affk(readStrongBinder);
                }
            }
            ((bimo) this.f64222a).f120921j = new afcj(affk);
        } else if (i != 2) {
            return false;
        } else {
            ((bimo) this.f64222a).f120921j = null;
        }
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afel(afcp afcp) {
        super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
        this.f64222a = afcp;
    }
}
