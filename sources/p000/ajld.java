package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetEnabledParams;

/* renamed from: ajld */
final /* synthetic */ class ajld implements Runnable {

    /* renamed from: a */
    private final ajmt f70842a;

    /* renamed from: b */
    private final SetEnabledParams f70843b;

    public ajld(ajmt ajmt, SetEnabledParams setEnabledParams) {
        this.f70842a = ajmt;
        this.f70843b = setEnabledParams;
    }

    public final void run() {
        ajmt ajmt = this.f70842a;
        SetEnabledParams setEnabledParams = this.f70843b;
        NearbySharingChimeraService.m67474a(ajmt.f70933a, "setEnabled", setEnabledParams.f81129b, new ajlx(ajmt, setEnabledParams));
    }
}
