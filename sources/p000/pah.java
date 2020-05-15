package p000;

import android.os.Handler;

/* renamed from: pah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pah extends ome {

    /* renamed from: a */
    final /* synthetic */ pam f38709a;

    public pah(pam pam) {
        this.f38709a = pam;
    }

    @Deprecated
    /* renamed from: a */
    public final void mo22284a() {
        mo22285a(true);
    }

    /* renamed from: b */
    public final void mo22286b(boolean z) {
        bnsn bnsn = pam.f38717a;
        if (!z) {
            bnsi c = pam.f38717a.mo68388c();
            c.mo68432a("pah", "b", 482, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("startAdditionalServices failed");
            pam pam = this.f38709a;
            Handler handler = pam.f38720d;
            nov nov = pam.f38724h;
            nov.getClass();
            handler.post(new pag(nov));
            this.f38709a.mo22809a();
        }
    }

    /* renamed from: a */
    public final void mo22285a(boolean z) {
        bnsn bnsn = pam.f38717a;
        if (!z) {
            bnsi c = pam.f38717a.mo68388c();
            c.mo68432a("pah", "a", 469, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("startRequiredServices failed");
            this.f38709a.f38720d.post(new pae(this));
            this.f38709a.mo22809a();
            return;
        }
        this.f38709a.f38720d.post(new paf(this));
    }
}
