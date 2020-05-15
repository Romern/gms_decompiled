package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ahzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahzm extends aeaa {

    /* renamed from: a */
    final /* synthetic */ bqgy f68475a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahzm(String str, bqgy bqgy) {
        super(str);
        this.f68475a = bqgy;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: Device detail service disconnected with DiscoveryService");
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        Object obj;
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: Device detail service connected with DiscoveryService");
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.location.nearby.common.fastpair.IDeviceStatusService");
            obj = queryLocalInterface instanceof burx ? (burx) queryLocalInterface : new burv(iBinder);
        } else {
            obj = null;
        }
        this.f68475a.mo69138b(obj);
    }
}
