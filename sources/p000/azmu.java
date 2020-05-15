package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: azmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azmu extends aeaa {

    /* renamed from: a */
    final /* synthetic */ azmx f99663a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azmu(azmx azmx, String str) {
        super(str);
        this.f99663a = azmx;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        azoj.m85933c("WebAppFragment", "Disconnected from GMS process", new Object[0]);
        azph.m85998a(this.f99663a.getActivity()).mo55152a(1904, (String) null, (String) null, (ConversationId) null);
        this.f99663a.f99678l = null;
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        azez azez;
        azph.m85998a(this.f99663a.getActivity()).mo55152a(1903, (String) null, (String) null, (ConversationId) null);
        if (cfgs.m139400f()) {
            azpk.m86089a(this.f99663a.getActivity()).mo55187e("Matchstick.Latency.Lighter.Aidl.OnCreateToServiceConnected.Time");
            azpy.m86121a().mo55205a(bopw.AIDL_SERVICE_CONNECTED, System.currentTimeMillis());
        }
        azmx azmx = this.f99663a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.matchstick.net.ILighterWebService");
            azez = queryLocalInterface instanceof azez ? (azez) queryLocalInterface : new azex(iBinder);
        } else {
            azez = null;
        }
        azmx.f99678l = azez;
        azmx azmx2 = this.f99663a;
        azmx2.f99679m = new azev(azmx2);
        try {
            azmx azmx3 = this.f99663a;
            azmx3.f99678l.mo54856a(azmx3.f99679m);
            azph.m85998a(this.f99663a.getActivity()).mo55152a(1905, (String) null, (String) null, (ConversationId) null);
        } catch (RemoteException e) {
            azoj.m85933c("WebAppFragment", "Service crashed before successfully registering listener", new Object[0]);
            if (this.f99663a.getActivity() != null) {
                azph.m85998a(this.f99663a.getActivity()).mo55126a(1906, 65);
            }
        }
    }
}
