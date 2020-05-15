package p000;

import android.os.IBinder;

/* renamed from: nkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nkp implements IBinder.DeathRecipient {

    /* renamed from: a */
    final /* synthetic */ nkq f35896a;

    /* renamed from: b */
    final nrf f35897b;

    public nkp(nkq nkq, nrf nrf) {
        this.f35896a = nkq;
        this.f35897b = nrf;
        nrf.f12819a.linkToDeath(this, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20957a() {
        bnsn bnsn = nkq.f35898a;
        this.f35897b.f12819a.unlinkToDeath(this, 0);
    }

    public final void binderDied() {
        nuu.m27798c(new nko(this));
    }
}
