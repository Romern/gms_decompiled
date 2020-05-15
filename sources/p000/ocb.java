package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: ocb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ocb extends dck implements IInterface {

    /* renamed from: a */
    private final WeakReference f37145a;

    public ocb() {
        super("com.google.android.gms.car.lifetime.IProjectionLifetimeCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        boolean a = dcl.m8167a(parcel);
        if (Log.isLoggable("CAR.PROJECTION.PLSCM", 3)) {
            Log.d("CAR.PROJECTION.PLSCM", String.format("Binder:onProjectionLifetimeStateChanged(started:%b)", Boolean.valueOf(a)));
        }
        oci oci = (oci) this.f37145a.get();
        if (oci != null) {
            nuu.m27792a(new och(oci, a));
        }
        return true;
    }

    public ocb(oci oci) {
        super("com.google.android.gms.car.lifetime.IProjectionLifetimeCallback");
        this.f37145a = new WeakReference(oci);
    }
}
