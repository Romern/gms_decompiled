package p000;

import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.UnmarkContactAsSelectedParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: ajlh */
final /* synthetic */ class ajlh implements Callable {

    /* renamed from: a */
    private final ajmt f70850a;

    /* renamed from: b */
    private final UnmarkContactAsSelectedParams f70851b;

    public ajlh(ajmt ajmt, UnmarkContactAsSelectedParams unmarkContactAsSelectedParams) {
        this.f70850a = ajmt;
        this.f70851b = unmarkContactAsSelectedParams;
    }

    public final Object call() {
        ajmt ajmt = this.f70850a;
        UnmarkContactAsSelectedParams unmarkContactAsSelectedParams = this.f70851b;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        Contact contact = unmarkContactAsSelectedParams.f81132a;
        Charset charset = NearbySharingChimeraService.f80888a;
        return Integer.valueOf(nearbySharingChimeraService.f80898b.mo38787b(contact));
    }
}
