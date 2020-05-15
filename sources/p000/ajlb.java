package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetVisibilityParams;

/* renamed from: ajlb */
final /* synthetic */ class ajlb implements Runnable {

    /* renamed from: a */
    private final ajmt f70838a;

    /* renamed from: b */
    private final SetVisibilityParams f70839b;

    public ajlb(ajmt ajmt, SetVisibilityParams setVisibilityParams) {
        this.f70838a = ajmt;
        this.f70839b = setVisibilityParams;
    }

    public final void run() {
        ajmt ajmt = this.f70838a;
        SetVisibilityParams setVisibilityParams = this.f70839b;
        NearbySharingChimeraService.m67474a(ajmt.f70933a, "setVisibility", setVisibilityParams.f81131b, new ajle(ajmt, setVisibilityParams));
    }
}
