package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: ajls */
final /* synthetic */ class ajls implements Callable {

    /* renamed from: a */
    private final ajmt f70873a;

    /* renamed from: b */
    private final ajud f70874b;

    /* renamed from: c */
    private final ajsn f70875c;

    public ajls(ajmt ajmt, ajud ajud, ajsn ajsn) {
        this.f70873a = ajmt;
        this.f70874b = ajud;
        this.f70875c = ajsn;
    }

    public final Object call() {
        ajmt ajmt = this.f70873a;
        ajud ajud = this.f70874b;
        ajsn ajsn = this.f70875c;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        Charset charset = NearbySharingChimeraService.f80888a;
        return Integer.valueOf(nearbySharingChimeraService.mo44417a(ajud, new ajjs(nearbySharingChimeraService, ajsn), 4));
    }
}
