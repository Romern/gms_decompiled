package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: afgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afgo extends dck implements afgp {

    /* renamed from: a */
    private Context f64233a;

    public afgo() {
        super("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
    }

    public afgo(Context context) {
        super("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
        this.f64233a = context;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                dcl.m8164a(parcel2, (IInterface) null);
                return true;
            case 2:
                Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                return true;
            case 4:
                parcel2.writeNoException();
                return true;
            case 5:
                parcel2.writeNoException();
                return true;
            case 6:
                parcel2.writeNoException();
                return true;
            case 7:
                parcel2.writeNoException();
                dcl.m8169b(parcel2, (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                TextView textView = new TextView(this.f64233a);
                textView.setGravity(17);
                textView.setText(rfx.m33538b(this.f64233a).getString(C0126R.string.common_google_play_services_updating_title));
                vzr a = vzs.m41642a(textView);
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
                    if (queryLocalInterface instanceof afgf) {
                        afgf afgf = (afgf) queryLocalInterface;
                    } else {
                        new afgf(readStrongBinder);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
