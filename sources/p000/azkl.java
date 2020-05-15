package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;

/* renamed from: azkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azkl extends aeaa {

    /* renamed from: a */
    final /* synthetic */ CardChimeraActivity f99558a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azkl(CardChimeraActivity cardChimeraActivity, String str) {
        super(str);
        this.f99558a = cardChimeraActivity;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f99558a.f111218b = null;
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        azfc azfc;
        try {
            CardChimeraActivity cardChimeraActivity = this.f99558a;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.matchstick.net.IMessagingService");
                azfc = !(queryLocalInterface instanceof azfc) ? new azfa(iBinder) : (azfc) queryLocalInterface;
            } else {
                azfc = null;
            }
            cardChimeraActivity.f111218b = azfc;
            CardChimeraActivity cardChimeraActivity2 = this.f99558a;
            cardChimeraActivity2.f111218b.mo54858a(cardChimeraActivity2.f111219c.f99774a);
        } catch (RemoteException e) {
            azoj.m85931a("CardChimeraActivity", e, "Unable to set conversation id with the service.", new Object[0]);
            this.f99558a.f111218b = null;
        }
    }
}
