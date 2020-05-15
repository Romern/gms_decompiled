package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: afer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afer extends dck implements afes {

    /* renamed from: a */
    private Context f64224a;

    public afer() {
        super("com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    /* renamed from: a */
    public final void mo34816a() {
    }

    /* renamed from: a */
    public final void mo34817a(affs affs) {
    }

    /* renamed from: a */
    public final void mo34818a(Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo34819b(Bundle bundle) {
    }

    /* renamed from: c */
    public final void mo34820c() {
    }

    /* renamed from: d */
    public final void mo34821d() {
    }

    /* renamed from: e */
    public final void mo34822e() {
    }

    /* renamed from: f */
    public final vzr mo34823f() {
        TextView textView = new TextView(this.f64224a);
        textView.setGravity(17);
        textView.setText(rfx.m33538b(this.f64224a).getString(C0126R.string.common_google_play_services_updating_title));
        return vzs.m41642a(textView);
    }

    public afer(Context context) {
        super("com.google.android.gms.maps.internal.IMapViewDelegate");
        this.f64224a = context;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                afeh afeh = new afeh();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, afeh);
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
                vzr f = mo34823f();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, f);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                    if (queryLocalInterface instanceof affs) {
                        affs affs = (affs) queryLocalInterface;
                    } else {
                        new affq(readStrongBinder);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 10:
                Bundle bundle2 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                return true;
            case 12:
                parcel2.writeNoException();
                return true;
            case 13:
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
