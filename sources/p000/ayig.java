package p000;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.ChannelImpl;
import com.google.android.gms.wearable.internal.OpenChannelResponse;

/* renamed from: ayig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayig {

    /* renamed from: a */
    final /* synthetic */ axrs f97657a;

    public ayig(axrs axrs) {
        this.f97657a = axrs;
    }

    /* renamed from: a */
    public final void mo54015a(int i, axvz axvz, String str) {
        ChannelImpl channelImpl;
        boolean z;
        if (i != 0) {
            channelImpl = null;
        } else {
            if (axvz != null) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34975b(z, "Got null token with SUCCESS");
            sdo.m34975b(str != null, "Got null path with SUCCESS");
            channelImpl = new ChannelImpl(axvz.mo53654a(), axvz.f96539a, str);
        }
        try {
            this.f97657a.mo53457a(new OpenChannelResponse(i, channelImpl));
        } catch (RemoteException e) {
            Log.w("WearableService", String.format("Failed to set %s result on openChannel result", axpa.m82857a(i)));
        }
    }
}
