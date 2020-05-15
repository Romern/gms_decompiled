package p000;

import java.util.concurrent.Callable;

/* renamed from: xrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xrb implements Callable {

    /* renamed from: a */
    final /* synthetic */ xrf f52959a;

    public xrb(xrf xrf) {
        this.f52959a = xrf;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (!rfy.m33550g(this.f52959a.f52975m) || !cdve.m135097b()) {
            xrf xrf = this.f52959a;
            return Boolean.valueOf(xrf.f52978p.mo29606a(xrf.f52306d.mo30222b(), this.f52959a.f52977o).mo66813a());
        }
        xrf.f52973q.mo25414c("Skipping rpId validation", new Object[0]);
        return true;
    }
}
