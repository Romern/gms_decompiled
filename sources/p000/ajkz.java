package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetDataUsageParams;

/* renamed from: ajkz */
final /* synthetic */ class ajkz implements Runnable {

    /* renamed from: a */
    private final ajmt f70834a;

    /* renamed from: b */
    private final SetDataUsageParams f70835b;

    public ajkz(ajmt ajmt, SetDataUsageParams setDataUsageParams) {
        this.f70834a = ajmt;
        this.f70835b = setDataUsageParams;
    }

    public final void run() {
        ajmt ajmt = this.f70834a;
        SetDataUsageParams setDataUsageParams = this.f70835b;
        NearbySharingChimeraService.m67474a(ajmt.f70933a, "setDataUsage", setDataUsageParams.f81125b, new ajlf(ajmt, setDataUsageParams));
    }
}
