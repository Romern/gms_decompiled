package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: nun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nun extends aeaa {

    /* renamed from: a */
    final /* synthetic */ nur f36550a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nun(nur nur) {
        super("car");
        this.f36550a = nur;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        nur nur = this.f36550a;
        bnsn bnsn = nur.f36554a;
        if (nur.f36561h && nur.f36562i == this) {
            bnsi d = nur.f36554a.mo68390d();
            d.mo68432a("nun", "a", 241, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("Disconnected from %s", componentName.toShortString());
            this.f36550a.f36564k = null;
            skh.m35531a().mo25689a(this.f36550a.f36558e, this);
            this.f36550a.mo21618b();
        }
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        String str;
        ntf ntf;
        bnsn bnsn = nur.f36554a;
        componentName.toShortString();
        try {
            str = iBinder.getInterfaceDescriptor();
        } catch (RemoteException e) {
            str = null;
        }
        if ("com.google.android.gms.car.IProjectionLifecycle".equals(str)) {
            nur nur = this.f36550a;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.IProjectionLifecycle");
                ntf = queryLocalInterface instanceof ntf ? (ntf) queryLocalInterface : new ntf(iBinder);
            } else {
                ntf = null;
            }
            nur.f36564k = ntf;
            try {
                nur nur2 = this.f36550a;
                ntf ntf2 = nur2.f36564k;
                nth nth = nur2.f36559f;
                nqu nqu = nur2.f36557d;
                Parcel bj = ntf2.mo8529bj();
                dcl.m8164a(bj, nth);
                dcl.m8164a(bj, nqu);
                ntf2.mo8530c(1, bj);
            } catch (RemoteException e2) {
                this.f36550a.f36564k = null;
            }
        }
    }
}
