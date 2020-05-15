package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.RegisterSharingProviderParams;

/* renamed from: ajmc */
final /* synthetic */ class ajmc implements Runnable {

    /* renamed from: a */
    private final ajmt f70896a;

    /* renamed from: b */
    private final RegisterSharingProviderParams f70897b;

    /* renamed from: c */
    private final akcb f70898c;

    /* renamed from: d */
    private final String f70899d;

    public ajmc(ajmt ajmt, RegisterSharingProviderParams registerSharingProviderParams, akcb akcb, String str) {
        this.f70896a = ajmt;
        this.f70897b = registerSharingProviderParams;
        this.f70898c = akcb;
        this.f70899d = str;
    }

    public final void run() {
        ajmt ajmt = this.f70896a;
        NearbySharingChimeraService.m67474a(ajmt.f70933a, "registerSharingProvider", this.f70897b.f81115a, new ajlv(ajmt, this.f70898c, this.f70899d));
    }
}
