package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.DeleteAllUserDataRequest;
import com.google.android.gms.fitness.request.GetStoredDataSourcesRequest;
import com.google.android.gms.fitness.request.PurgeDataSourcesRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: zno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zno implements ytv {

    /* renamed from: a */
    final /* synthetic */ znp f55564a;

    public zno(znp znp) {
        this.f55564a = znp;
    }

    /* renamed from: a */
    public final boolean mo30773a(int i, Object obj, ytt ytt) {
        if (i == 0) {
            znp znp = this.f55564a;
            zcl zcl = ((DeleteAllUserDataRequest) obj).f32255a;
            try {
                zuu zuu = znp.f55568g;
                if (zuu != null) {
                    zuu.mo30706a();
                }
                znp.f55566e.mo31379g();
                zcl.mo30933a(Status.f30107a);
            } catch (yqh e) {
                bnsl bnsl = (bnsl) znp.f55565d.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Deleting all data failed.");
                zcl.mo30933a(new Status(5008));
            }
            return true;
        } else if (i == 1) {
            znp znp2 = this.f55564a;
            PurgeDataSourcesRequest purgeDataSourcesRequest = (PurgeDataSourcesRequest) obj;
            zcl zcl2 = purgeDataSourcesRequest.f32267a;
            try {
                List list = purgeDataSourcesRequest.f32268b;
                zuu zuu2 = znp2.f55568g;
                if (zuu2 != null) {
                    zuu2.mo30707a((Collection) list);
                }
                bnrd a = znp2.f55567f.mo31396a().iterator();
                while (a.hasNext()) {
                    yqe yqe = (yqe) a.next();
                    caae caae = yqe.f54381b.f172720b;
                    if (caae == null) {
                        caae = caae.f172323i;
                    }
                    caah caah = caae.f172330f;
                    if (caah == null) {
                        caah = caah.f172333d;
                    }
                    if (list.contains(caah.f172336b)) {
                        znp2.f55567f.mo31401b(yqe);
                    }
                }
                bnia j = bnic.m109500j();
                bnic a2 = bnic.m109495a((Collection) list);
                for (caae caae2 : znp2.f55566e.mo31388h()) {
                    caah caah2 = caae2.f172330f;
                    if (caah2 == null) {
                        caah2 = caah.f172333d;
                    }
                    if (a2.contains(caah2.f172336b)) {
                        j.mo67629b(caae2.f172326b);
                    }
                }
                znp2.f55566e.mo31385b((Collection) j.mo67751a());
                zcl2.mo30933a(Status.f30107a);
            } catch (IOException | yqh e2) {
                bnsl bnsl2 = (bnsl) znp.f55565d.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68405a("Purging data sources failed.");
                zcl2.mo30933a(new Status(5008));
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            znp znp3 = this.f55564a;
            zba zba = ((GetStoredDataSourcesRequest) obj).f32258a;
            try {
                Set<caae> h = znp3.f55566e.mo31388h();
                bngs b = bngx.m109371b(h.size());
                for (caae caae3 : h) {
                    b.mo67668c(yvx.m44926a(caae3));
                }
                zba.mo30897a(new DataSourcesResult(b.mo67664a(), Status.f30107a));
            } catch (IOException e3) {
                bnsl bnsl3 = (bnsl) znp.f55565d.mo68387b();
                bnsl3.mo68437a(e3);
                bnsl3.mo68405a("Getting stored data sources failed.");
                zba.mo30897a(DataSourcesResult.m23716a(new Status(5008)));
            }
            return true;
        }
    }
}
