package p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;

/* renamed from: ibr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ibr extends sji {

    /* renamed from: a */
    private final ClientContext f20690a;

    /* renamed from: d */
    private final hxq f20691d;

    public ibr(ClientContext clientContext, hxq hxq) {
        super(16, "GetSpatulaHeaderOperation");
        sdo.m34959a(clientContext);
        this.f20690a = clientContext;
        sdo.m34959a(hxq);
        this.f20691d = hxq;
    }

    /* renamed from: a */
    public final void mo11356a(Context context) {
        String str;
        try {
            str = new iei(context).mo12952a(this.f20690a.f30216f);
        } catch (gid | IOException e) {
            Log.w("AuthSpatulaProxy", "Exception while getting app cert is being ignored.");
            str = null;
        }
        try {
            this.f20691d.mo12789a(str);
        } catch (RemoteException e2) {
            Log.e("AuthSpatulaProxy", "RemoteException");
            Log.e("AuthSpatulaProxy", Log.getStackTraceString(e2));
        }
    }

    /* renamed from: a */
    public final void mo11357a(Status status) {
    }
}
