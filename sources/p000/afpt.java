package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: afpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afpt implements bqfp {

    /* renamed from: a */
    final /* synthetic */ afpu f64526a;

    /* renamed from: b */
    final /* synthetic */ bxvd f64527b;

    public afpt(afpu afpu, bxvd bxvd) {
        this.f64526a = afpu;
        this.f64527b = bxvd;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        try {
            if (!((Boolean) obj).booleanValue()) {
                bxvd bxvd = this.f64527b;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpxn bpxn = (bpxn) bxvd.f164949b;
                bpxn bpxn2 = bpxn.f139738g;
                bpxn.f139743d = bpzz.m112457a(11);
                bpxn.f139740a |= 8;
                this.f64526a.f64528i.mo11797a(new Status(8, "SetFileGroupActivationOperation : Failed to set activation status", null));
                return;
            }
            bxvd bxvd2 = this.f64527b;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bpxn bpxn3 = (bpxn) bxvd2.f164949b;
            bpxn bpxn4 = bpxn.f139738g;
            bpxn3.f139743d = bpzz.m112457a(3);
            bpxn3.f139740a = 8 | bpxn3.f139740a;
            this.f64526a.f64528i.mo11797a(Status.f30107a);
        } catch (RemoteException e) {
            bbev.m87911b(e, "Client died during SetFileGroupActivationOperation.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bbev.m87907a(th, "SetFileGroupActivationOperation failed.");
        try {
            Status status = Status.f30109c;
            if (th instanceof aaaj) {
                status = ((aaaj) th).f27843a;
            }
            this.f64526a.f64528i.mo11797a(status);
        } catch (RemoteException e) {
            bbev.m87911b(e, "Client died during SetFileGroupActivationOperation.", new Object[0]);
        }
    }
}
