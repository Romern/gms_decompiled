package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetAccountParams;

/* renamed from: ajkx */
final /* synthetic */ class ajkx implements Runnable {

    /* renamed from: a */
    private final ajmt f70830a;

    /* renamed from: b */
    private final SetAccountParams f70831b;

    public ajkx(ajmt ajmt, SetAccountParams setAccountParams) {
        this.f70830a = ajmt;
        this.f70831b = setAccountParams;
    }

    public final void run() {
        ajmt ajmt = this.f70830a;
        SetAccountParams setAccountParams = this.f70831b;
        NearbySharingChimeraService.m67474a(ajmt.f70933a, "setAccount", setAccountParams.f81123b, new ajlg(ajmt, setAccountParams));
    }
}
