package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetVisibilityParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: ajle */
final /* synthetic */ class ajle implements Callable {

    /* renamed from: a */
    private final ajmt f70844a;

    /* renamed from: b */
    private final SetVisibilityParams f70845b;

    public ajle(ajmt ajmt, SetVisibilityParams setVisibilityParams) {
        this.f70844a = ajmt;
        this.f70845b = setVisibilityParams;
    }

    public final Object call() {
        ajmt ajmt = this.f70844a;
        SetVisibilityParams setVisibilityParams = this.f70845b;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        int i = setVisibilityParams.f81130a;
        Charset charset = NearbySharingChimeraService.f80888a;
        return Integer.valueOf(nearbySharingChimeraService.mo44416a(i));
    }
}
