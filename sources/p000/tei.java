package p000;

/* renamed from: tei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tei {

    /* renamed from: a */
    final /* synthetic */ tej f45750a;

    public tei(tej tej) {
        this.f45750a = tej;
    }

    /* renamed from: a */
    public final void mo26438a(int i) {
        synchronized (this.f45750a.f45756f) {
            this.f45750a.f45758h = i;
        }
        tej.f45751a.mo25418e("Verification failed, reason: %d.", Integer.valueOf(i));
        try {
            this.f45750a.f45752b.put(cbqy.f178081i);
        } catch (InterruptedException e) {
            tej.f45751a.mo25417e("fails to put into blocking queue.", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo26439a(String str) {
        synchronized (this.f45750a.f45756f) {
            tds a = tds.m36774a(rpr.m34216b());
            tej tej = this.f45750a;
            a.mo26411a(tej.f45754d, (cbqy) tej.f45757g.mo74062i(), 58);
        }
        this.f45750a.mo26440a(str);
        tej.f45751a.mo25412b("Phone call received: %s.", str);
    }
}
