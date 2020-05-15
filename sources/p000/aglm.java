package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: aglm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aglm implements ServiceConnection, sac, sad {

    /* renamed from: a */
    public volatile boolean f65883a;

    /* renamed from: b */
    public volatile aghv f65884b;

    /* renamed from: c */
    final /* synthetic */ agln f65885c;

    protected aglm(agln agln) {
        this.f65885c = agln;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        agho agho;
        sdo.m34967a("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f65883a = false;
                this.f65885c.mo35497E().f65564c.mo35435a("Service connected with null binder");
                return;
            }
            agho = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (!(queryLocalInterface instanceof aghq)) {
                        agho = new agho(iBinder);
                    } else {
                        agho = (aghq) queryLocalInterface;
                    }
                    try {
                        this.f65885c.mo35497E().f65572k.mo35435a("Bound to IMeasurementService interface");
                    } catch (RemoteException e) {
                    }
                } else {
                    this.f65885c.mo35497E().f65564c.mo35436a("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException e2) {
            }
            if (agho == null) {
                this.f65885c.mo35498F().mo35492a(new aglh(this, agho));
            } else {
                this.f65883a = false;
                try {
                    skh.m35531a().mo25689a(this.f65885c.mo35542z(), this.f65885c.f65886b);
                } catch (IllegalArgumentException e3) {
                }
            }
        }
        this.f65885c.mo35497E().f65564c.mo35435a("Service connect failed to get IMeasurementService");
        if (agho == null) {
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        sdo.m34967a("MeasurementServiceConnection.onServiceDisconnected");
        this.f65885c.mo35497E().f65571j.mo35435a("Service disconnected");
        this.f65885c.mo35498F().mo35492a(new agli(this, componentName));
    }

    /* renamed from: a */
    public final void mo6635a(int i) {
        sdo.m34967a("MeasurementServiceConnection.onConnectionSuspended");
        this.f65885c.mo35497E().f65571j.mo35435a("Service connection suspended");
        this.f65885c.mo35498F().mo35492a(new aglk(this));
    }

    /* renamed from: a */
    public final void mo6636a(Bundle bundle) {
        sdo.m34967a("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f65885c.mo35498F().mo35492a(new aglj(this, (aghq) this.f65884b.mo25289B()));
            } catch (DeadObjectException | IllegalStateException e) {
                this.f65884b = null;
                this.f65883a = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo6637a(ConnectionResult connectionResult) {
        agid agid;
        sdo.m34967a("MeasurementServiceConnection.onConnectionFailed");
        agje agje = this.f65885c.f65756y;
        agid agid2 = agje.f65693i;
        if (agid2 == null || !agid2.mo35543g()) {
            agid = null;
        } else {
            agid = agje.f65693i;
        }
        if (agid != null) {
            agid.f65567f.mo35436a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f65883a = false;
            this.f65884b = null;
        }
        this.f65885c.mo35498F().mo35492a(new agll(this));
    }
}
