package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: aomr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aomr implements rjz, rka, alll {

    /* renamed from: a */
    final /* synthetic */ aomu f78494a;

    public aomr(aomu aomu) {
        this.f78494a = aomu;
    }

    /* renamed from: a */
    private final void m66068a() {
        aomu aomu = this.f78494a;
        if (aomu.f78517o == null) {
            rjo rjo = allr.f73629a;
            amcp.m62614a(aomu.f78506d, aomu.f78512j, aomu.f78509g.mo43050b()).mo9458a(this.f78494a.f78528z);
        } else {
            aomu.mo43040a(Status.f30107a, this.f78494a.f78517o);
        }
        if (this.f78494a.f78509g.mo43051c() && !TextUtils.isEmpty(this.f78494a.f78509g.f78530b.f82550d)) {
            aomu aomu2 = this.f78494a;
            aomu2.f78519q = aomu2.f78509g.f78530b.f82550d;
        }
        if (TextUtils.isEmpty(this.f78494a.f78519q)) {
            rjo rjo2 = allr.f73629a;
            aomu aomu3 = this.f78494a;
            amcf.m62587a(aomu3.f78506d, aomu3.f78512j, aomu3.f78509g.mo43050b()).mo9458a(this.f78494a.f78498A);
        } else {
            aomu aomu4 = this.f78494a;
            if (aomu4.f78520r == null) {
                rjo rjo3 = allr.f73629a;
                amcy.m62630a(aomu4.f78506d, aomu4.f78519q, 1, 1).mo9458a(this.f78494a.f78499B);
            }
        }
        aomt aomt = this.f78494a.f78508f;
        if (aomt == null) {
            return;
        }
        if (!aomt.mo42998f().mo46773b()) {
            rjo rjo4 = allr.f73629a;
            aomu aomu5 = this.f78494a;
            rkb rkb = aomu5.f78506d;
            String str = aomu5.f78512j;
            String b = aomu5.f78509g.mo43050b();
            alkv alkv = new alkv();
            alkv.f73610b = null;
            alkv.f73611c = false;
            alkv.f73609a = -1;
            amcf.m62588a(rkb, str, b, alkv).mo9458a(this.f78494a.f78500C);
        } else if (this.f78494a.f78508f.mo42998f().mo46772a()) {
            this.f78494a.f78508f.mo43036a(Status.f30107a, this.f78494a.f78508f.mo42998f());
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
    }

    /* renamed from: b */
    public final void mo40489b() {
        m66068a();
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        rjo rjo = allr.f73629a;
        aomu aomu = this.f78494a;
        amdg.m62647a(aomu.f78506d, this, aomu.f78512j, aomu.f78509g.mo43050b(), 2);
        aomu aomu2 = this.f78494a;
        amdi.m62650a(aomu2.f78506d, aomu2.f78512j, aomu2.f78509g.mo43050b(), this.f78494a.f78527y);
        m66068a();
        aomu aomu3 = this.f78494a;
        if (aomu3.f78521s) {
            aomu3.f78521s = false;
            aomu aomu4 = this.f78494a;
            amcp.m62615a(aomu4.f78506d, aomu4.f78512j, aomu4.f78509g.mo43050b(), this.f78494a.f78522t).mo9458a(this.f78494a.f78501D);
        }
        aomu aomu5 = this.f78494a;
        if (aomu5.f78523u) {
            aomu5.f78523u = false;
            aomu5.mo43046b();
        }
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        aomt aomt;
        if (!TextUtils.isEmpty(this.f78494a.f78519q)) {
            aomu aomu = this.f78494a;
            if (aomu.f78520r != null && ((aomt = aomu.f78508f) == null || aomt.mo42998f().mo46773b())) {
                return;
            }
        }
        this.f78494a.f78506d.mo24801e();
    }
}
