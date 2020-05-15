package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: azmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azmt extends aeaa {

    /* renamed from: a */
    final /* synthetic */ azmx f99662a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azmt(azmx azmx, String str) {
        super(str);
        this.f99662a = azmx;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f99662a.f99677k = null;
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        azfc azfc;
        azmx azmx = this.f99662a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.matchstick.net.IMessagingService");
            azfc = queryLocalInterface instanceof azfc ? (azfc) queryLocalInterface : new azfa(iBinder);
        } else {
            azfc = null;
        }
        azmx.f99677k = azfc;
    }
}
