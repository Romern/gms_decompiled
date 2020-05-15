package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.sharebox.AddToCircleData;
import com.google.android.gms.plus.sharebox.Circle;
import java.util.ArrayList;

/* renamed from: aomm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aomm implements rkl {

    /* renamed from: a */
    final /* synthetic */ aomu f78481a;

    public aomm(aomu aomu) {
        this.f78481a = aomu;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        aomt aomt;
        alkw alkw = (alkw) rkk;
        if (alkw.mo7183bo().mo17710c() && alkw.mo40471b() != null) {
            ArrayList arrayList = new ArrayList();
            try {
                int a = alkw.mo40471b().mo24660a();
                for (int i = 0; i < a; i++) {
                    alzj b = alkw.mo40471b().mo24661a(i);
                    arrayList.add(new Circle(1, b.mo41056c(), b.mo41057d(), b.mo41060h()));
                }
                alkw.mo12460c();
                if (!arrayList.isEmpty() && (aomt = this.f78481a.f78508f) != null) {
                    aomt.mo42998f().f83436f = arrayList;
                    if (this.f78481a.f78508f.mo42998f().mo46772a()) {
                        this.f78481a.f78508f.mo43036a(Status.f30107a, this.f78481a.f78508f.mo42998f());
                    }
                }
            } catch (Throwable th) {
                alkw.mo12460c();
                throw th;
            }
        } else {
            aomt aomt2 = this.f78481a.f78508f;
            if (aomt2 != null) {
                aomt2.mo43036a(aomu.f78497a, (AddToCircleData) null);
            }
        }
    }
}
