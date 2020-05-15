package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetEnabledParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: ajlx */
final /* synthetic */ class ajlx implements Callable {

    /* renamed from: a */
    private final ajmt f70887a;

    /* renamed from: b */
    private final SetEnabledParams f70888b;

    public ajlx(ajmt ajmt, SetEnabledParams setEnabledParams) {
        this.f70887a = ajmt;
        this.f70888b = setEnabledParams;
    }

    public final Object call() {
        ajmt ajmt = this.f70887a;
        SetEnabledParams setEnabledParams = this.f70888b;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        boolean z = setEnabledParams.f81128a;
        Charset charset = NearbySharingChimeraService.f80888a;
        return Integer.valueOf(nearbySharingChimeraService.mo44438d(z));
    }
}
