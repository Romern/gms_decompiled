package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: nlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nlo extends aeaa {

    /* renamed from: a */
    final /* synthetic */ nlq f35953a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nlo(nlq nlq, String str) {
        super(str);
        this.f35953a = nlq;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        bnsi b = nlq.f35955a.mo68387b();
        b.mo68432a("nlo", "a", 128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68405a("Input service disconnected.");
        nlq nlq = this.f35953a;
        nlq.f35961g = null;
        nlq.mo21058e();
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        obs obs;
        nlq nlq;
        String str;
        bnsn bnsn = nlq.f35955a;
        nlq nlq2 = this.f35953a;
        if (nlq2.f35957c == 1) {
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.input.ICarProjectionInputService");
                obs = queryLocalInterface instanceof obs ? (obs) queryLocalInterface : new obs(iBinder);
            } else {
                obs = null;
            }
            nlq2.f35961g = obs;
            try {
                nlq nlq3 = this.f35953a;
                obs obs2 = nlq3.f35961g;
                obt obt = nlq3.f35960f;
                Parcel bj = obs2.mo8529bj();
                dcl.m8164a(bj, obt);
                obs2.mo8530c(3, bj);
                try {
                    nlq nlq4 = this.f35953a;
                    nlq4.mo21057b(nlq4.f35962h, nlq4.f35958d, nlq4.f35959e);
                    this.f35953a.mo21059f();
                    this.f35953a.f35957c = 2;
                } catch (RemoteException e) {
                    e = e;
                    nlq = this.f35953a;
                    str = "Failed to notify input service of start";
                    nlq.mo21056a(str, e);
                }
            } catch (RemoteException e2) {
                e = e2;
                nlq = this.f35953a;
                str = "Unable to register input service callback";
                nlq.mo21056a(str, e);
            }
        }
    }
}
