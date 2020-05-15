package p000;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;

/* renamed from: ahjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahjj extends aifx {

    /* renamed from: a */
    public aifv f67272a;

    /* renamed from: b */
    public aigr f67273b;

    /* renamed from: c */
    private final aifs f67274c;

    public ahjj(aifs aifs) {
        this.f67274c = aifs;
    }

    /* renamed from: a */
    public final void mo36560a(OnBandwidthChangedParams onBandwidthChangedParams) {
    }

    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        super.linkToDeath(deathRecipient, i);
        aifv aifv = this.f67272a;
        if (aifv != null) {
            try {
                aifv.asBinder().linkToDeath(deathRecipient, i);
            } catch (RemoteException e) {
                ahkm.m55982a(e, "Exception calling linkToDeath on IConnectionEventListener", new Object[0]);
            }
        }
    }

    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        aifv aifv = this.f67272a;
        if (aifv != null) {
            aifv.asBinder().unlinkToDeath(deathRecipient, i);
        }
        return super.unlinkToDeath(deathRecipient, i);
    }

    /* renamed from: a */
    public final void mo36561a(OnConnectionInitiatedParams onConnectionInitiatedParams) {
        aifs aifs = this.f67274c;
        aihe aihe = new aihe();
        String str = onConnectionInitiatedParams.f80570a;
        OnConnectionRequestParams onConnectionRequestParams = aihe.f68894a;
        onConnectionRequestParams.f80578a = str;
        onConnectionRequestParams.f80579b = onConnectionInitiatedParams.f80571b;
        onConnectionRequestParams.f80580c = onConnectionInitiatedParams.f80574e;
        aifs.mo36570a(onConnectionRequestParams);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String, java.lang.Integer, int]
     candidates:
      bnsi.a(java.lang.String, java.lang.String, int, java.lang.String):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public final void mo36562a(OnConnectionResultParams onConnectionResultParams) {
        if (onConnectionResultParams.f80585b != 0) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahjj", "a", 447, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("ApiCompat.AdvertiserConnectionLifecycleListener has rewritten the connection result to endpoint %s from %d to %d so that legacy clients will understand it.", (Object) onConnectionResultParams.f80584a, (Object) Integer.valueOf(onConnectionResultParams.f80585b), (Object) 13);
            this.f67273b.mo36548a(13);
            return;
        }
        this.f67273b.mo36548a(0);
    }

    /* renamed from: a */
    public final void mo36563a(OnDisconnectedParams onDisconnectedParams) {
        aifv aifv = this.f67272a;
        if (aifv == null) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
            bnsl.mo68432a("ahjj", "a", 465, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("AdvertiserConnectionLifecycleListener.onDisconnected was called for endpoint %s, but a ConnectionEventListener has not been set yet.", onDisconnectedParams.f80587a);
            return;
        }
        aifv.mo36549a(onDisconnectedParams);
    }
}
