package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupRequest;
import com.google.android.gms.mdd.FileGroupResponse;
import java.util.List;

/* renamed from: afpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afpp implements bqfp {

    /* renamed from: a */
    final /* synthetic */ List f64518a;

    /* renamed from: b */
    final /* synthetic */ afpq f64519b;

    /* renamed from: c */
    final /* synthetic */ bxvd f64520c;

    public afpp(afpq afpq, bxvd bxvd, List list) {
        this.f64519b = afpq;
        this.f64520c = bxvd;
        this.f64518a = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        bmxv bmxv = (bmxv) obj;
        try {
            if (!bmxv.mo66813a()) {
                bxvd bxvd = this.f64520c;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpxn bpxn = (bpxn) bxvd.f164949b;
                bpxn bpxn2 = bpxn.f139738g;
                bpxn.f139743d = bpzz.m112457a(5);
                bpxn.f139740a |= 8;
                afjj afjj = this.f64519b.f64521i;
                Status status = Status.f30107a;
                FileGroupRequest fileGroupRequest = this.f64519b.f64460c;
                afjj.mo34903a(status, new FileGroupResponse(fileGroupRequest.f79958a, fileGroupRequest.f79959b, 0, bngx.m109376e()));
                return;
            }
            bxvd bxvd2 = this.f64520c;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bpxn bpxn3 = (bpxn) bxvd2.f164949b;
            bpxn bpxn4 = bpxn.f139738g;
            bpxn3.f139743d = bpzz.m112457a(3);
            bpxn3.f139740a |= 8;
            afjj afjj2 = this.f64519b.f64521i;
            Status status2 = Status.f30107a;
            FileGroupRequest fileGroupRequest2 = this.f64519b.f64460c;
            afjj2.mo34903a(status2, new FileGroupResponse(fileGroupRequest2.f79958a, fileGroupRequest2.f79959b, ((bavd) bmxv.mo66814b()).f101875e, this.f64518a));
        } catch (RemoteException e) {
            bbev.m87911b(e, "Client died during GetFileGroupOperation.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bbev.m87907a(th, "GetFileGroupOperation failed.");
        try {
            Status status = Status.f30109c;
            if (th instanceof aaaj) {
                status = ((aaaj) th).f27843a;
            }
            this.f64519b.mo6503a(status);
        } catch (RemoteException e) {
            bbev.m87911b(e, "Client died during GetFileGroupOperation.", new Object[0]);
        }
    }
}
