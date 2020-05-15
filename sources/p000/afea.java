package p000;

import android.os.Parcel;
import com.google.android.gms.maps.internal.CreatorImpl;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: afea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afea extends dck implements afeb {

    /* renamed from: a */
    public afeb f64220a;

    /* renamed from: b */
    final /* synthetic */ CreatorImpl f64221b;

    public afea() {
        super("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    /* renamed from: a */
    public final vzr mo34777a() {
        return this.f64221b.mo43852a(new afdn(this));
    }

    /* renamed from: b */
    public final vzr mo34786b(float f) {
        return this.f64221b.mo43852a(new afdr(this, f));
    }

    /* renamed from: c */
    public final vzr mo34787c() {
        return this.f64221b.mo43852a(new afdo(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afea(CreatorImpl creatorImpl) {
        super("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        this.f64221b = creatorImpl;
        this.f64220a = null;
    }

    /* renamed from: a */
    public final vzr mo34778a(float f) {
        return this.f64221b.mo43852a(new afdq(this, f));
    }

    /* renamed from: a */
    public final vzr mo34779a(float f, float f2) {
        return this.f64221b.mo43852a(new afdp(this, f, f2));
    }

    /* renamed from: a */
    public final vzr mo34780a(float f, int i, int i2) {
        return this.f64221b.mo43852a(new afds(this, f, i, i2));
    }

    /* renamed from: a */
    public final vzr mo34781a(CameraPosition cameraPosition) {
        return this.f64221b.mo43852a(new afdt(this, cameraPosition));
    }

    /* renamed from: a */
    public final vzr mo34782a(LatLng latLng) {
        return this.f64221b.mo43852a(new afdu(this, latLng));
    }

    /* renamed from: a */
    public final vzr mo34783a(LatLng latLng, float f) {
        return this.f64221b.mo43852a(new afdv(this, latLng, f));
    }

    /* renamed from: a */
    public final vzr mo34784a(LatLngBounds latLngBounds, int i) {
        return this.f64221b.mo43852a(new afdl(this, latLngBounds, i));
    }

    /* renamed from: a */
    public final vzr mo34785a(LatLngBounds latLngBounds, int i, int i2, int i3) {
        return this.f64221b.mo43852a(new afdm(this, latLngBounds, i, i2, i3));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                vzr a = mo34777a();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a);
                return true;
            case 2:
                vzr c = mo34787c();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, c);
                return true;
            case 3:
                vzr a2 = mo34779a(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a2);
                return true;
            case 4:
                vzr a3 = mo34778a(parcel.readFloat());
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a3);
                return true;
            case 5:
                vzr b = mo34786b(parcel.readFloat());
                parcel2.writeNoException();
                dcl.m8164a(parcel2, b);
                return true;
            case 6:
                vzr a4 = mo34780a(parcel.readFloat(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a4);
                return true;
            case 7:
                vzr a5 = mo34781a((CameraPosition) dcl.m8163a(parcel, CameraPosition.CREATOR));
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a5);
                return true;
            case 8:
                vzr a6 = mo34782a((LatLng) dcl.m8163a(parcel, LatLng.CREATOR));
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a6);
                return true;
            case 9:
                vzr a7 = mo34783a((LatLng) dcl.m8163a(parcel, LatLng.CREATOR), parcel.readFloat());
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a7);
                return true;
            case 10:
                vzr a8 = mo34784a((LatLngBounds) dcl.m8163a(parcel, LatLngBounds.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a8);
                return true;
            case 11:
                vzr a9 = mo34785a((LatLngBounds) dcl.m8163a(parcel, LatLngBounds.CREATOR), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a9);
                return true;
            default:
                return false;
        }
    }
}
