package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: ajlu */
final /* synthetic */ class ajlu implements Callable {

    /* renamed from: a */
    private final ajmt f70880a;

    /* renamed from: b */
    private final ajmq f70881b;

    public ajlu(ajmt ajmt, ajmq ajmq) {
        this.f70880a = ajmt;
        this.f70881b = ajmq;
    }

    public final Object call() {
        int i;
        ajmt ajmt = this.f70880a;
        ajmq ajmq = this.f70881b;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        akcb akcb = ajmq.f70927a;
        Charset charset = NearbySharingChimeraService.f80888a;
        if (nearbySharingChimeraService.f80911w.mo38798a(akcb) == null) {
            ((bnsl) ajvp.f71371a.mo68388c()).mo68420a("Failed to unregister %s", akcb);
            i = 13;
        } else {
            srn srn = ajvp.f71371a;
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
