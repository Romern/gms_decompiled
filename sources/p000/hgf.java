package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: hgf */
final /* synthetic */ class hgf implements C1228nu {

    /* renamed from: a */
    private final hgj f19699a;

    public hgf(hgj hgj) {
        this.f19699a = hgj;
    }

    /* renamed from: a */
    public final void mo9443a(Object obj) {
        hgj hgj = this.f19699a;
        Throwable th = (Throwable) obj;
        Status b = adbe.m50109a(th).mo33302b();
        hgj.f19703a.mo25416d("Encountered an error {error code= %d, error message= %s}", Integer.valueOf(b.f30115i), bmxx.m108578b(b.f30116j));
        hgj.f19703a.mo25417e("Failure during the flow", th, new Object[0]);
        hgj.mo12455a(new hgk(b, bmvz.f131120a));
    }
}
