package p000;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResponseParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;

/* renamed from: ahjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahjb extends aifx {

    /* renamed from: a */
    final /* synthetic */ aigl f67262a;

    /* renamed from: b */
    final /* synthetic */ aifv f67263b;

    /* renamed from: c */
    final /* synthetic */ aigb f67264c;

    public ahjb(aigl aigl, aifv aifv, aigb aigb) {
        this.f67262a = aigl;
        this.f67263b = aifv;
        this.f67264c = aigb;
    }

    /* renamed from: a */
    public final void mo36560a(OnBandwidthChangedParams onBandwidthChangedParams) {
    }

    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        super.linkToDeath(deathRecipient, i);
        try {
            this.f67263b.asBinder().linkToDeath(deathRecipient, i);
        } catch (RemoteException e) {
            ahkm.m55982a(e, "Exception calling linkToDeath on IConnectionEventListener", new Object[0]);
        }
    }

    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        this.f67263b.asBinder().unlinkToDeath(deathRecipient, i);
        return super.unlinkToDeath(deathRecipient, i);
    }

    /* renamed from: a */
    public final void mo36561a(OnConnectionInitiatedParams onConnectionInitiatedParams) {
        bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
        bnsl.mo68432a("ahjb", "a", 107, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Auto accepting the connection to endpoint %s, because I was the device that initiated it. This is a workaround for legacy clients.", onConnectionInitiatedParams.f80570a);
        aigl aigl = this.f67262a;
        aidg aidg = new aidg();
        aidg.mo37444a(new ahja());
        aidg.mo37445a(onConnectionInitiatedParams.f80570a);
        aidg.mo37442a(this.f67263b);
        aigl.mo36590a(aidg.f68797a);
    }

    /* renamed from: a */
    public final void mo36562a(OnConnectionResultParams onConnectionResultParams) {
        aigb aigb = this.f67264c;
        aihg aihg = new aihg();
        String str = onConnectionResultParams.f80584a;
        OnConnectionResponseParams onConnectionResponseParams = aihg.f68895a;
        onConnectionResponseParams.f80581a = str;
        onConnectionResponseParams.f80582b = onConnectionResultParams.f80585b;
        onConnectionResponseParams.f80583c = onConnectionResultParams.f80586c;
        aigb.mo37466a(onConnectionResponseParams);
    }

    /* renamed from: a */
    public final void mo36563a(OnDisconnectedParams onDisconnectedParams) {
        this.f67263b.mo36549a(onDisconnectedParams);
    }
}
