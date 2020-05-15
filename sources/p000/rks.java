package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: rks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class rks extends rkr {

    /* renamed from: a */
    protected final aucf f43192a;

    public rks(int i, aucf aucf) {
        super(i);
        this.f43192a = aucf;
    }

    /* renamed from: a */
    public final void mo24834a(Status status) {
        this.f43192a.mo50392b((Exception) new rjp(status));
    }

    /* renamed from: a */
    public void mo24836a(rmc rmc, boolean z) {
    }

    /* renamed from: b */
    public final void mo24837b(rni rni) {
        try {
            mo24838c(rni);
        } catch (DeadObjectException e) {
            mo24834a(rkx.m33899a((RemoteException) e));
            throw e;
        } catch (RemoteException e2) {
            mo24834a(rkx.m33899a(e2));
        } catch (RuntimeException e3) {
            mo24835a(e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo24838c(rni rni);

    /* renamed from: a */
    public final void mo24835a(Exception exc) {
        this.f43192a.mo50392b(exc);
    }
}
