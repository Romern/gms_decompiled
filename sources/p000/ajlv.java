package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: ajlv */
final /* synthetic */ class ajlv implements Callable {

    /* renamed from: a */
    private final ajmt f70882a;

    /* renamed from: b */
    private final akcb f70883b;

    /* renamed from: c */
    private final String f70884c;

    public ajlv(ajmt ajmt, akcb akcb, String str) {
        this.f70882a = ajmt;
        this.f70883b = akcb;
        this.f70884c = str;
    }

    public final Object call() {
        ajmt ajmt = this.f70882a;
        akcb akcb = this.f70883b;
        String str = this.f70884c;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        ajmv ajmv = new ajmv(str, ajmt.f70933a);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.f80911w.mo38801a(akcb, ajmv);
        srn srn = ajvp.f71371a;
        return 0;
    }
}
