package com.google.android.gms.backup.p032g1.backup;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.backup.g1.backup.G1BackupApiStub$1 */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class G1BackupApiStub$1 extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ mof f29044a;

    /* renamed from: b */
    final /* synthetic */ mnr f29045b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public G1BackupApiStub$1(mnr mnr, Handler handler, mof mof) {
        super(handler);
        this.f29045b = mnr;
        this.f29044a = mof;
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == -1) {
            try {
                this.f29044a.mo20214a(Status.f30107a);
                if (ccls.m130536o()) {
                    mnr mnr = this.f29045b;
                    Status status = Status.f30107a;
                    lvn lvn = mnr.f34049a;
                    mnr.mo20186a(status);
                }
            } catch (RemoteException e) {
                mnr.f34049a.mo25417e("Unable to call back the client.", e, new Object[0]);
            }
        } else if (i != 1000) {
            this.f29044a.mo20214a(Status.f30109c);
            if (ccls.m130536o()) {
                mnr mnr2 = this.f29045b;
                Status status2 = Status.f30109c;
                lvn lvn2 = mnr.f34049a;
                mnr2.mo20186a(status2);
            }
        } else if (ccls.m130536o()) {
            int i2 = bundle.getInt("totalMms", 0);
            int i3 = bundle.getInt("backedUpMms", 0);
            mnr mnr3 = this.f29045b;
            lvn lvn3 = mnr.f34049a;
            for (lua lua : mnr3.f34051c.values()) {
                try {
                    Parcel bj = lua.mo8529bj();
                    bj.writeInt(i2);
                    bj.writeInt(i3);
                    lua.mo8530c(2, bj);
                } catch (RemoteException e2) {
                    mnr.f34049a.mo25417e("Unable to call back the client.", e2, new Object[0]);
                }
            }
        }
    }
}
