package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: rle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rle extends BasePendingResult implements rlf {

    /* renamed from: d */
    public final rje f43219d;

    /* renamed from: e */
    public final rjo f43220e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    protected rle(rje rje, rkb rkb) {
        super(rkb);
        sdo.m34966a(rkb, "GoogleApiClient must not be null");
        sdo.m34959a(rje);
        this.f43219d = rje;
        this.f43220e = null;
    }

    /* renamed from: a */
    private final void m33916a(RemoteException remoteException) {
        mo9481a(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo9482a(Object obj) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11186a(rjd rjd);

    /* renamed from: b */
    public final void mo24856b(rjd rjd) {
        if (rjd instanceof sdx) {
            rjn rjn = ((sdx) rjd).f44080a;
            rjd = null;
        }
        try {
            mo11186a(rjd);
        } catch (DeadObjectException e) {
            m33916a((RemoteException) e);
            throw e;
        } catch (RemoteException e2) {
            m33916a(e2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected rle(rjo rjo, rkb rkb) {
        super(rkb);
        sdo.m34966a(rkb, "GoogleApiClient must not be null");
        sdo.m34966a(rjo, "Api must not be null");
        this.f43219d = rjo.mo24653a();
        this.f43220e = rjo;
    }

    /* renamed from: a */
    public final void mo9481a(Status status) {
        sdo.m34975b(!status.mo17710c(), "Failed result must not be success");
        mo17716a(mo11187b(status));
    }
}
