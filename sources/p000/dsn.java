package p000;

import java.util.Set;

/* renamed from: dsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dsn implements aubq {

    /* renamed from: a */
    final /* synthetic */ Set f13947a;

    /* renamed from: b */
    final /* synthetic */ dsp f13948b;

    public dsn(dsp dsp, Set set) {
        this.f13948b = dsp;
        this.f13947a = set;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (!aucb.mo50384b() || !((Boolean) aucb.mo50386d()).booleanValue()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dsn", "a", 174, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[UpdateFenceRegistrationOperation] Gesture nano app is not available.");
            this.f13948b.mo9531a(7514);
            return;
        }
        this.f13947a.remove(23);
        this.f13948b.mo9532a(this.f13947a);
    }
}
