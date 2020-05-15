package p000;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;

/* renamed from: afeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afeg extends dcj implements afei {
    public afeg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    /* renamed from: a */
    public final afia mo34796a(GroundOverlayOptions groundOverlayOptions) {
        afia afia;
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, groundOverlayOptions);
        Parcel a = mo8526a(12, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            afia = queryLocalInterface instanceof afia ? (afia) queryLocalInterface : new afhy(readStrongBinder);
        } else {
            afia = null;
        }
        a.recycle();
        return afia;
    }

    /* renamed from: b */
    public final void mo34808b(vzr vzr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        mo8528b(5, bj);
    }

    /* renamed from: c */
    public final void mo34809c() {
        mo8528b(14, mo8529bj());
    }

    /* renamed from: d */
    public final Location mo34810d() {
        Parcel a = mo8526a(23, mo8529bj());
        Location location = (Location) dcl.m8163a(a, Location.CREATOR);
        a.recycle();
        return location;
    }

    /* renamed from: e */
    public final afgs mo34811e() {
        afgs afgs;
        Parcel a = mo8526a(25, mo8529bj());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            afgs = queryLocalInterface instanceof afgs ? (afgs) queryLocalInterface : new afgq(readStrongBinder);
        } else {
            afgs = null;
        }
        a.recycle();
        return afgs;
    }

    /* renamed from: f */
    public final afgi mo34812f() {
        afgi afgi;
        Parcel a = mo8526a(26, mo8529bj());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            afgi = queryLocalInterface instanceof afgi ? (afgi) queryLocalInterface : new afgg(readStrongBinder);
        } else {
            afgi = null;
        }
        a.recycle();
        return afgi;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* renamed from: g */
    public final void mo34813g() {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, true);
        mo8528b(41, bj);
    }

    /* renamed from: h */
    public final void mo34814h() {
        Parcel bj = mo8529bj();
        bj.writeInt(0);
        bj.writeInt(0);
        bj.writeInt(0);
        bj.writeInt(0);
        mo8528b(39, bj);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* renamed from: i */
    public final void mo34815i() {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, true);
        Parcel a = mo8526a(20, bj);
        dcl.m8167a(a);
        a.recycle();
    }

    /* renamed from: a */
    public final afig mo34797a(MarkerOptions markerOptions) {
        afig afig;
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, markerOptions);
        Parcel a = mo8526a(11, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            afig = queryLocalInterface instanceof afig ? (afig) queryLocalInterface : new afie(readStrongBinder);
        } else {
            afig = null;
        }
        a.recycle();
        return afig;
    }

    /* renamed from: a */
    public final CameraPosition mo34798a() {
        Parcel a = mo8526a(1, mo8529bj());
        CameraPosition cameraPosition = (CameraPosition) dcl.m8163a(a, CameraPosition.CREATOR);
        a.recycle();
        return cameraPosition;
    }

    /* renamed from: a */
    public final void mo34799a(afem afem) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, afem);
        mo8528b(24, bj);
    }

    /* renamed from: a */
    public final void mo34800a(afev afev) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, afev);
        mo8528b(27, bj);
    }

    /* renamed from: a */
    public final void mo34801a(afey afey) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, afey);
        mo8528b(99, bj);
    }

    /* renamed from: a */
    public final void mo34802a(affd affd) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, affd);
        mo8528b(96, bj);
    }

    /* renamed from: a */
    public final void mo34803a(affn affn) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, affn);
        mo8528b(28, bj);
    }

    /* renamed from: a */
    public final void mo34804a(affv affv) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, affv);
        mo8528b(30, bj);
    }

    /* renamed from: a */
    public final void mo34805a(afga afga) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, afga);
        mo8528b(36, bj);
    }

    /* renamed from: a */
    public final void mo34806a(vzr vzr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo34807a(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8528b(22, bj);
    }
}
