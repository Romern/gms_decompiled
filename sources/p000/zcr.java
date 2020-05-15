package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.GetStoredDataSourcesRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;

/* renamed from: zcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zcr extends zak {
    public zcr(rkb rkb) {
        super(rkb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((zbt) ((zam) rjd).mo25289B()).mo30915a(new GetStoredDataSourcesRequest((zba) new yzv(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        sdo.m34974b(!status.mo17710c());
        return DataSourcesResult.m23716a(status);
    }
}
