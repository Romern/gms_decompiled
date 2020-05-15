package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.CancelParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: ajlk */
final /* synthetic */ class ajlk implements Callable {

    /* renamed from: a */
    private final ajmt f70856a;

    /* renamed from: b */
    private final CancelParams f70857b;

    public ajlk(ajmt ajmt, CancelParams cancelParams) {
        this.f70856a = ajmt;
        this.f70857b = cancelParams;
    }

    public final Object call() {
        ajmt ajmt = this.f70856a;
        CancelParams cancelParams = this.f70857b;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        ShareTarget shareTarget = cancelParams.f81073a;
        Charset charset = NearbySharingChimeraService.f80888a;
        return Integer.valueOf(nearbySharingChimeraService.mo44429b(shareTarget));
    }
}
