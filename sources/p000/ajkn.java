package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SendParams;

/* renamed from: ajkn */
final /* synthetic */ class ajkn implements Runnable {

    /* renamed from: a */
    private final ajmt f70810a;

    /* renamed from: b */
    private final SendParams f70811b;

    public ajkn(ajmt ajmt, SendParams sendParams) {
        this.f70810a = ajmt;
        this.f70811b = sendParams;
    }

    public final void run() {
        ajmt ajmt = this.f70810a;
        SendParams sendParams = this.f70811b;
        NearbySharingChimeraService.m67474a(ajmt.f70933a, "send", sendParams.f81121c, new ajln(ajmt, sendParams));
    }
}
