package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: ajlt */
final /* synthetic */ class ajlt implements Callable {

    /* renamed from: a */
    private final ajmt f70876a;

    /* renamed from: b */
    private final ajud f70877b;

    /* renamed from: c */
    private final ajsn f70878c;

    /* renamed from: d */
    private final int f70879d;

    public ajlt(ajmt ajmt, ajud ajud, ajsn ajsn, int i) {
        this.f70876a = ajmt;
        this.f70877b = ajud;
        this.f70878c = ajsn;
        this.f70879d = i;
    }

    public final Object call() {
        ajmt ajmt = this.f70876a;
        ajud ajud = this.f70877b;
        ajsn ajsn = this.f70878c;
        int i = this.f70879d;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        Charset charset = NearbySharingChimeraService.f80888a;
        return Integer.valueOf(nearbySharingChimeraService.mo44417a(ajud, ajsn, i));
    }
}
