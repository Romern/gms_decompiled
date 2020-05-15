package p000;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: affz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class affz extends dck implements afga {

    /* renamed from: a */
    final /* synthetic */ bihg f64231a;

    public affz() {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzr vzr;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr = null;
        }
        bihg bihg = this.f64231a;
        Location location = (Location) vzs.m41641a(vzr);
        if (bihg.f120596a.f120599b.isAdded()) {
            biht biht = bihg.f120596a.f120599b;
            if (!biht.f120614b) {
                biht.f120614b = true;
                bihr bihr = biht.f120632t;
                if (bihr != null) {
                    bihr.mo64612a(new LatLng(location.getLatitude(), location.getLongitude()));
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public affz(bihg bihg) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
        this.f64231a = bihg;
    }
}
