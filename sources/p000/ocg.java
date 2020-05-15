package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: ocg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ocg extends aeaa {

    /* renamed from: a */
    final /* synthetic */ oci f37155a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ocg(oci oci) {
        super("car");
        this.f37155a = oci;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        if (this.f37155a.f37163f) {
            if (Log.isLoggable("CAR.PROJECTION.PLSCM", 3)) {
                Log.d("CAR.PROJECTION.PLSCM", String.format("Disconnected from %s. Unbinding service.", componentName.toShortString()));
            }
            this.f37155a.mo21961a();
        } else if (Log.isLoggable("CAR.PROJECTION.PLSCM", 3)) {
            Log.d("CAR.PROJECTION.PLSCM", "doServiceDisconnected called when not bound. Ignoring.");
        }
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        String str;
        if (Log.isLoggable("CAR.PROJECTION.PLSCM", 3)) {
            Log.d("CAR.PROJECTION.PLSCM", String.format("Connected to %s", componentName.toShortString()));
        }
        oca oca = null;
        try {
            str = iBinder.getInterfaceDescriptor();
        } catch (RemoteException e) {
            str = null;
        }
        if (this.f37155a.f37160c) {
            bmxy.m108600b("com.google.android.gms.car.lifetime.IProjectionLifetime".equals(str));
            oci oci = this.f37155a;
            oci.f37163f = true;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.lifetime.IProjectionLifetime");
                if (queryLocalInterface instanceof oca) {
                    oca = (oca) queryLocalInterface;
                } else {
                    oca = new oca(iBinder);
                }
            }
            oci.f37165h = oca;
            this.f37155a.mo21963b();
        } else if (!"com.google.android.gms.car.lifetime.IProjectionLifetime".equals(str)) {
            if (Log.isLoggable("CAR.PROJECTION.PLSCM", 5)) {
                Log.w("CAR.PROJECTION.PLSCM", "Lifetime service connected but unable to cast interface descriptor. Proceeding without lifetime verification.");
            }
            nuu.m27792a(new ocf(this));
        } else {
            oci oci2 = this.f37155a;
            oci2.f37163f = true;
            if (iBinder != null) {
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.car.lifetime.IProjectionLifetime");
                if (queryLocalInterface2 instanceof oca) {
                    oca = (oca) queryLocalInterface2;
                } else {
                    oca = new oca(iBinder);
                }
            }
            oci2.f37165h = oca;
            this.f37155a.mo21963b();
        }
    }
}
