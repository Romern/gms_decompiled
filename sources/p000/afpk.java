package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: afpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afpk implements bqfp {

    /* renamed from: a */
    final /* synthetic */ afpl f64506a;

    public afpk(afpl afpl) {
        this.f64506a = afpl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        try {
            this.f64506a.f64507a.mo11797a(Status.f30107a);
        } catch (RemoteException e) {
            bbev.m87911b(e, "Client died during VerifyPendingGroupsOperation", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bbev.m87905a("%s: Failed VerifyPendingGroupsOperation.", "Service");
        try {
            this.f64506a.f64507a.mo11797a(Status.f30109c);
        } catch (RemoteException e) {
            bbev.m87911b(e, "Client died during VerifyPendingGroupsOperation", new Object[0]);
        }
    }
}
