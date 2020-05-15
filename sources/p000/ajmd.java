package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.UnregisterSharingProviderParams;

/* renamed from: ajmd */
final /* synthetic */ class ajmd implements Runnable {

    /* renamed from: a */
    private final ajmt f70900a;

    /* renamed from: b */
    private final UnregisterSharingProviderParams f70901b;

    /* renamed from: c */
    private final ajmq f70902c;

    public ajmd(ajmt ajmt, UnregisterSharingProviderParams unregisterSharingProviderParams, ajmq ajmq) {
        this.f70900a = ajmt;
        this.f70901b = unregisterSharingProviderParams;
        this.f70902c = ajmq;
    }

    public final void run() {
        ajmt ajmt = this.f70900a;
        NearbySharingChimeraService.m67474a(ajmt.f70933a, "unregisterSharingProvider", this.f70901b.f81138a, new ajlu(ajmt, this.f70902c));
    }
}
