package p000;

import android.content.Intent;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.SendParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: ajln */
final /* synthetic */ class ajln implements Callable {

    /* renamed from: a */
    private final ajmt f70862a;

    /* renamed from: b */
    private final SendParams f70863b;

    public ajln(ajmt ajmt, SendParams sendParams) {
        this.f70862a = ajmt;
        this.f70863b = sendParams;
    }

    public final Object call() {
        ajmt ajmt = this.f70862a;
        SendParams sendParams = this.f70863b;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        ShareTarget shareTarget = sendParams.f81119a;
        Intent intent = sendParams.f81120b;
        Charset charset = NearbySharingChimeraService.f80888a;
        return Integer.valueOf(nearbySharingChimeraService.mo44419a(shareTarget, intent));
    }
}
