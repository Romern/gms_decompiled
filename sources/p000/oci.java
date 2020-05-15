package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.Collection;
import java.util.Set;

/* renamed from: oci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oci {

    /* renamed from: a */
    public final Context f37158a;

    /* renamed from: b */
    public final boolean f37159b;

    /* renamed from: c */
    public final boolean f37160c;

    /* renamed from: d */
    public final ServiceConnection f37161d = new ocg(this);

    /* renamed from: e */
    public final Set f37162e = new C1225nr();

    /* renamed from: f */
    boolean f37163f;

    /* renamed from: g */
    ocb f37164g;

    /* renamed from: h */
    oca f37165h;

    /* renamed from: i */
    private final boolean f37166i;

    public oci(Context context, boolean z, boolean z2, boolean z3) {
        this.f37158a = context;
        this.f37159b = z;
        this.f37166i = z2;
        this.f37160c = z3;
    }

    /* renamed from: a */
    public final void mo21961a() {
        if (Log.isLoggable("CAR.PROJECTION.PLSCM", 3)) {
            Log.d("CAR.PROJECTION.PLSCM", "unbindService()");
        }
        this.f37163f = false;
        this.f37165h = null;
        if (this.f37166i) {
            skh.m35531a().mo25693b(this.f37158a, this.f37161d);
        } else {
            skh.m35531a().mo25689a(this.f37158a, this.f37161d);
        }
    }

    /* renamed from: b */
    public final void mo21963b() {
        bmxy.m108601b(this.f37163f, "Lifetime service not bound.");
        if (this.f37165h == null) {
            throw new IllegalStateException("Lifetime service not bound.");
        } else if (this.f37164g == null) {
            ocb ocb = new ocb(this);
            this.f37164g = ocb;
            try {
                oca oca = this.f37165h;
                Parcel bj = oca.mo8529bj();
                dcl.m8164a(bj, ocb);
                oca.mo8528b(2, bj);
            } catch (RemoteException e) {
                if (Log.isLoggable("CAR.PROJECTION.PLSCM", 5)) {
                    Log.w("CAR.PROJECTION.PLSCM", "RemoteException calling registerProjectionLifetimeCallback. Removing callback and unbinding service.", e);
                }
                this.f37164g = null;
                mo21961a();
            }
        }
    }

    /* renamed from: a */
    public final void mo21962a(boolean z, boolean z2) {
        boolean z3;
        bmxy.m108600b(Looper.myLooper() == Looper.getMainLooper());
        bngx a = bngx.m109368a((Collection) this.f37162e);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            oce oce = (oce) a.get(i);
            bmxy.m108600b(Looper.myLooper() == Looper.getMainLooper());
            if (z) {
                if (Log.isLoggable("CAR.PROJECTION.PLSCM", 3)) {
                    Log.d("CAR.PROJECTION.PLSCM", String.format("Projection lifetime started. Running action. startedLifetimeVerified:%b", Boolean.valueOf(z2)));
                }
                oci oci = oce.f37152a;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                bmxy.m108600b(z3);
                if (Log.isLoggable("CAR.PROJECTION.PLSCM", 3)) {
                    Log.d("CAR.PROJECTION.PLSCM", "unregisterProjectionLifetimeCallback");
                }
                oci.f37162e.remove(oce);
                if (oci.f37162e.isEmpty()) {
                    if (oci.f37163f) {
                        oca oca = oci.f37165h;
                        if (oca != null) {
                            ocb ocb = oci.f37164g;
                            if (ocb != null) {
                                try {
                                    Parcel bj = oca.mo8529bj();
                                    dcl.m8164a(bj, ocb);
                                    oca.mo8528b(3, bj);
                                } catch (RemoteException e) {
                                    if (Log.isLoggable("CAR.PROJECTION.PLSCM", 5)) {
                                        Log.w("CAR.PROJECTION.PLSCM", "RemoteException calling unregisterProjectionLifetimeCallback. Unbinding service.", e);
                                    }
                                    oci.mo21961a();
                                }
                                oci.f37164g = null;
                            }
                        } else {
                            throw new IllegalStateException("Lifetime service not bound.");
                        }
                    }
                    oci.mo21961a();
                }
                occ occ = oce.f37153b;
                ocd ocd = occ.f37146a;
                ComponentName componentName = occ.f37147b;
                IBinder iBinder = occ.f37148c;
                ocd.f37150b.set(z2);
                ocd.f37149a.mo6501a(componentName, iBinder);
            }
        }
    }
}
