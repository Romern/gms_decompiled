package p000;

import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.MarkContactAsSelectedParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: ajli */
final /* synthetic */ class ajli implements Callable {

    /* renamed from: a */
    private final ajmt f70852a;

    /* renamed from: b */
    private final MarkContactAsSelectedParams f70853b;

    public ajli(ajmt ajmt, MarkContactAsSelectedParams markContactAsSelectedParams) {
        this.f70852a = ajmt;
        this.f70853b = markContactAsSelectedParams;
    }

    public final Object call() {
        ajmt ajmt = this.f70852a;
        MarkContactAsSelectedParams markContactAsSelectedParams = this.f70853b;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        Contact contact = markContactAsSelectedParams.f81087a;
        Charset charset = NearbySharingChimeraService.f80888a;
        return Integer.valueOf(nearbySharingChimeraService.f80898b.mo38779a(contact));
    }
}
