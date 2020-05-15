package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.Cap;

/* renamed from: afgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afgz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Cap[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        vzr vzr;
        int b = sed.m35001b(parcel);
        afgv afgv = null;
        int i = 0;
        IBinder iBinder = null;
        Float f = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                f = sed.m35016m(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof vzr) {
                vzr = (vzr) queryLocalInterface;
            } else {
                vzr = new vzp(iBinder);
            }
            afgv = new afgv(vzr);
        }
        return new Cap(i, afgv, f);
    }
}
