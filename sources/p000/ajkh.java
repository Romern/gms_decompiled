package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.OptInParams;

/* renamed from: ajkh */
final /* synthetic */ class ajkh implements Runnable {

    /* renamed from: a */
    private final ajmt f70791a;

    /* renamed from: b */
    private final OptInParams f70792b;

    public ajkh(ajmt ajmt, OptInParams optInParams) {
        this.f70791a = ajmt;
        this.f70792b = optInParams;
    }

    public final void run() {
        ajmt ajmt = this.f70791a;
        NearbySharingChimeraService.m67474a(ajmt.f70933a, "optIn", this.f70792b.f81097a, new ajly(ajmt));
    }
}
