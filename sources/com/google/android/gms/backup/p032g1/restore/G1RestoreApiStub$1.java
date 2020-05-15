package com.google.android.gms.backup.p032g1.restore;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.backup.g1.restore.G1RestoreApiStub$1 */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class G1RestoreApiStub$1 extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ mou f29046a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public G1RestoreApiStub$1(Handler handler, mou mou) {
        super(handler);
        this.f29046a = mou;
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i != -1) {
            try {
                this.f29046a.mo20221a(Status.f30109c);
            } catch (RemoteException e) {
                mnv.f34062a.mo25417e("Unable to call back the client.", e, new Object[0]);
            }
        } else {
            this.f29046a.mo20221a(Status.f30107a);
        }
    }
}
