package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: hqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hqt implements bqfp {

    /* renamed from: a */
    final /* synthetic */ hqu f20245a;

    public hqt(hqu hqu) {
        this.f20245a = hqu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        bmxv bmxv = (bmxv) obj;
        if (bmxv.mo66813a()) {
            this.f20245a.f20248c = ((Integer) bmxv.mo66814b()).intValue();
            this.f20245a.mo12681b();
            return;
        }
        this.f20245a.f20252g.mo12682a(Status.f30107a);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        Status b = adbe.m50109a(th).mo33302b();
        hqu.f20246a.mo25416d("Encountered an error {error code= %d, error message= %s}", Integer.valueOf(b.f30115i), bmxx.m108578b(b.f30116j));
        this.f20245a.f20252g.mo12682a(b);
    }
}
