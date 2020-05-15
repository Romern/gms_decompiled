package p000;

import android.content.Intent;
import com.google.android.gms.instantapps.routing.DomainFilterUpdateChimeraService;

/* renamed from: adji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adji implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f61910a;

    /* renamed from: b */
    final /* synthetic */ DomainFilterUpdateChimeraService f61911b;

    public adji(DomainFilterUpdateChimeraService domainFilterUpdateChimeraService, Intent intent) {
        this.f61911b = domainFilterUpdateChimeraService;
        this.f61910a = intent;
    }

    public final void run() {
        this.f61911b.mo6269a(new aecc(DomainFilterUpdateChimeraService.m66761a(this.f61910a.getIntExtra("domain_filter_request_type", 0)), null));
        this.f61911b.stopSelf();
    }
}
