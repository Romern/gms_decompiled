package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: afhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afhy extends dcj implements afia {
    public afhy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    /* renamed from: a */
    public final void mo34882a() {
        mo8528b(1, mo8529bj());
    }

    /* renamed from: c */
    public final int mo34886c() {
        Parcel a = mo8526a(20, mo8529bj());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: a */
    public final void mo34883a(LatLng latLng) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, latLng);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo34884a(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8528b(15, bj);
    }

    /* renamed from: a */
    public final boolean mo34885a(afia afia) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, afia);
        Parcel a = mo8526a(19, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }
}
