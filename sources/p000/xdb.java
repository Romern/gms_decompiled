package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: xdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xdb implements bqfp {

    /* renamed from: a */
    final /* synthetic */ xdc f51981a;

    public xdb(xdc xdc) {
        this.f51981a = xdc;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        try {
            this.f51981a.f51985c.mo29956a(Status.f30107a, (List) obj);
        } catch (RemoteException e) {
            xdc.f51982b.mo25416d("Client died during ListKeysOperation", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        try {
            this.f51981a.f51985c.mo29956a(adbe.m50109a(th).mo33302b(), (List) null);
        } catch (RemoteException e) {
            xdc.f51982b.mo25416d("Client died during ListKeysOperation", new Object[0]);
        }
    }
}
