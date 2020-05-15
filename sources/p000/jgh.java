package p000;

import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;

/* renamed from: jgh */
final /* synthetic */ class jgh implements aubq {

    /* renamed from: a */
    private final jgj f22416a;

    public jgh(jgj jgj) {
        this.f22416a = jgj;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        jgj jgj = this.f22416a;
        jgj.f22417a = true;
        if (aucb.mo50384b()) {
            jgj.f22418b = ((ManagedAccountSetupInfo) aucb.mo50386d()).f107900c;
        }
        jgj.mo13711a();
    }
}
