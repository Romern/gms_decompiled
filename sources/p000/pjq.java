package p000;

/* renamed from: pjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pjq extends peo {

    /* renamed from: a */
    final /* synthetic */ pjs f39371a;

    public pjq(pjs pjs) {
        this.f39371a = pjs;
    }

    /* renamed from: a */
    public final void mo22976a() {
        pep pep = this.f39371a.f39380h;
        if (pep != null) {
            roz b = rpa.m34196b();
            b.f43472a = pfh.f39026a;
            ((rjx) pep).mo24732b(b.mo24977a());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pjs.a(boolean, bpfe):void
     arg types: [int, bpfe]
     candidates:
      pjs.a(android.content.Intent, int):android.app.PendingIntent
      pjs.a(boolean, bpfe):void */
    /* renamed from: b */
    public final void mo22978b() {
        pjs.f39373a.mo23677d("CastClient connection suspended. Device = %s", this.f39371a.f39375c);
        this.f39371a.mo23280a(false, bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_CONNECTION_TO_GMSCORE_FAILED);
    }

    /* renamed from: c */
    public final void mo22979c() {
        this.f39371a.mo23278a(bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_CONNECTION_TO_RECEIVER_FAILED);
        pxi pxi = this.f39371a.f39388p;
        if (pxi != null) {
            pxi.mo23799a();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pjs.a(boolean, bpfe):void
     arg types: [int, bpfe]
     candidates:
      pjs.a(android.content.Intent, int):android.app.PendingIntent
      pjs.a(boolean, bpfe):void */
    /* renamed from: a */
    public final void mo22977a(int i) {
        pjs.f39373a.mo23677d("CastClient connection failed. Device = %s", this.f39371a.f39375c);
        pwq pwq = this.f39371a.f39374b;
        phy phy = pwq.f40514a;
        phy.mo23119a(pwq.f40515b, (long) pwq.f40516c, phy.mo23146j(), pwq.f40517d, i);
        this.f39371a.mo23280a(false, bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_CONNECTION_TO_RECEIVER_FAILED);
    }
}
