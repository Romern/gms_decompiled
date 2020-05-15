package p000;

import android.content.Intent;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hde implements bqfp {

    /* renamed from: a */
    final /* synthetic */ hdf f19493a;

    public hde(hdf hdf) {
        this.f19493a = hdf;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        adak adak = (adak) obj;
        if (adak == null) {
            this.f19493a.f19500f.mo12408a(new hdh(Status.f30109c, bmvz.f131120a));
            return;
        }
        hdf hdf = this.f19493a;
        int i = adak.f61209a;
        Intent intent = adak.f61210b;
        if (i == -1 && intent.hasExtra(ConsentResult.f10615a)) {
            intent.setExtrasClassLoader(ConsentResult.class.getClassLoader());
            hdf.f19513s = (ConsentResult) intent.getParcelableExtra(ConsentResult.f10615a);
            hdf.f19501g.mo12425c();
            return;
        }
        hdf.f19501g.mo12426d();
        hdf.mo12405a(new hdh(Status.f30111e, bmvz.f131120a));
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        Status b = adbe.m50109a(th).mo33302b();
        hdf.f19494a.mo25416d("Encountered an error in native consent {error code= %d, error message= %s}", Integer.valueOf(b.f30115i), bmxx.m108578b(b.f30116j));
        this.f19493a.f19500f.mo12408a(new hdh(b, bmvz.f131120a));
    }
}
