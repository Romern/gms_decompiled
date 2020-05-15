package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: auly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auly extends aeaa {

    /* renamed from: a */
    final /* synthetic */ aulz f92061a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected auly(aulz aulz) {
        super("trustagent");
        this.f92061a = aulz;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f92061a.f92066d = null;
        this.f92061a.mo50663a(false);
        this.f92061a.mo50664b(false);
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        aulw aulw;
        if (auma.m77295a(rpr.m34216b(), componentName)) {
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.trustagent.api.state.ITrustStateService");
                aulw = queryLocalInterface instanceof aulw ? (aulw) queryLocalInterface : new aulw(iBinder);
            } else {
                aulw = null;
            }
            try {
                aulz aulz = this.f92061a;
                Parcel bj = aulw.mo8529bj();
                dcl.m8164a(bj, aulz);
                aulw.mo8530c(1, bj);
                this.f92061a.f92066d = aulw;
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("Coffee-RemoteTrustState", valueOf.length() == 0 ? new String("Cannot receive trust updates: ") : "Cannot receive trust updates: ".concat(valueOf));
                this.f92061a.mo50663a(false);
                this.f92061a.mo50664b(false);
            }
        } else {
            Log.e("Coffee-RemoteTrustState", "Connected to an invalid trust state service.");
            this.f92061a.mo50663a(false);
            this.f92061a.mo50664b(false);
            skh.m35531a().mo25689a(rpr.m34216b(), this);
        }
    }
}
