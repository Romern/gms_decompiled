package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* renamed from: afgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afgl extends dck implements afgm {

    /* renamed from: a */
    private Context f64232a;

    public afgl() {
        super("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    public afgl(Context context) {
        super("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
        this.f64232a = context;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                dcl.m8164a(parcel2, (IInterface) null);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface instanceof vzr) {
                        vzr vzr = (vzr) queryLocalInterface;
                    } else {
                        new vzp(readStrongBinder);
                    }
                }
                StreetViewPanoramaOptions streetViewPanoramaOptions = (StreetViewPanoramaOptions) dcl.m8163a(parcel, StreetViewPanoramaOptions.CREATOR);
                Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                parcel2.writeNoException();
                return true;
            case 3:
                Bundle bundle2 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface2 instanceof vzr) {
                        vzr vzr2 = (vzr) queryLocalInterface2;
                    } else {
                        new vzp(readStrongBinder2);
                    }
                }
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface3 instanceof vzr) {
                        vzr vzr3 = (vzr) queryLocalInterface3;
                    } else {
                        new vzp(readStrongBinder3);
                    }
                }
                Bundle bundle3 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                TextView textView = new TextView(this.f64232a);
                textView.setGravity(17);
                textView.setText(rfx.m33538b(this.f64232a).getString(C0126R.string.common_google_play_services_updating_title));
                vzr a = vzs.m41642a(textView);
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a);
                return true;
            case 5:
                parcel2.writeNoException();
                return true;
            case 6:
                parcel2.writeNoException();
                return true;
            case 7:
                parcel2.writeNoException();
                return true;
            case 8:
                parcel2.writeNoException();
                return true;
            case 9:
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                dcl.m8169b(parcel2, (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                return true;
            case 11:
                parcel2.writeNoException();
                dcl.m8166a(parcel2, false);
                return true;
            case 12:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
                    if (queryLocalInterface4 instanceof afgf) {
                        afgf afgf = (afgf) queryLocalInterface4;
                    } else {
                        new afgf(readStrongBinder4);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 13:
                parcel2.writeNoException();
                return true;
            case 14:
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
