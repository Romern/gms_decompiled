package p000;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;

/* renamed from: aric */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aric extends adzt {

    /* renamed from: a */
    final /* synthetic */ arig f87770a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aric(arig arig, Looper looper) {
        super(looper);
        this.f87770a = arig;
    }

    public final void handleMessage(Message message) {
        try {
            int i = message.what;
            if (i == 0) {
                aqzp aqzp = this.f87770a.f87776a;
                List list = (List) message.obj;
                ((arie) aqzp).f87774c.mo48610b(((arie) aqzp).f87773b, ((arie) aqzp).f87775d);
                aqzp aqzp2 = ((arie) aqzp).f87772a;
                mji.f33827a.mo25409a("onCompleted", new Object[0]);
                ((mji) aqzp2).f33829c.execute(new mjg((mji) aqzp2));
            } else if (i == 1) {
                aqzp aqzp3 = ((arie) this.f87770a.f87776a).f87772a;
                mji.f33827a.mo25409a("onShowUi", new Object[0]);
                ((mji) aqzp3).f33829c.execute(new mjf((mji) aqzp3, (PendingIntent) message.obj));
            } else if (i == 2) {
                aqzp aqzp4 = this.f87770a.f87776a;
                int i2 = message.arg1;
                ((arie) aqzp4).f87774c.mo48610b(((arie) aqzp4).f87773b, ((arie) aqzp4).f87775d);
                aqzp aqzp5 = ((arie) aqzp4).f87772a;
                mji.f33827a.mo25409a("onError %d", Integer.valueOf(i2));
                ((mji) aqzp5).f33829c.execute(new mjh((mji) aqzp5, i2, (String) message.obj));
            } else {
                int i3 = message.what;
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unrecognized message: ");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (RemoteException e) {
            Log.e("DirectTransferLisHand", "Error invoking ISourceBootstrapListener.", e);
        }
    }
}
