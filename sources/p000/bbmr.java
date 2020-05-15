package p000;

import java.io.IOException;

/* renamed from: bbmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbmr {

    /* renamed from: a */
    public final bbmu f102928a;

    /* renamed from: b */
    public final bnsn f102929b;

    public bbmr(bbmu bbmu, bnsn bnsn) {
        this.f102928a = bbmu;
        this.f102929b = bnsn;
    }

    /* renamed from: a */
    public final bnic mo56219a() {
        bbmu bbmu = this.f102928a;
        if (bbmu != null) {
            return bbmu.f102933a.mo56226a();
        }
        return bnon.f131923a;
    }

    /* renamed from: b */
    public final void mo56220b() {
        try {
            bbmu bbmu = this.f102928a;
            if (bbmu != null) {
                bbmv.m88201a(bbmu.f102933a.mo56231c());
            }
        } catch (IOException e) {
            bnsi c = this.f102929b.mo68388c();
            c.mo68437a(e);
            c.mo68432a("bbmr", "b", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Failed to update metadata after sync completed successfully!");
        }
    }

    /* renamed from: c */
    public final void mo56221c() {
        try {
            bbmu bbmu = this.f102928a;
            if (bbmu != null) {
                bbmv.m88201a(bbmu.f102933a.mo56232d());
            }
        } catch (IOException e) {
            bnsi c = this.f102929b.mo68388c();
            c.mo68437a(e);
            c.mo68432a("bbmr", "c", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Failed to update metadata after sync failed!");
        }
    }

    /* renamed from: d */
    public final bbnq mo56222d() {
        bbmu bbmu = this.f102928a;
        if (bbmu == null) {
            return bbnq.m88229e().mo56238a();
        }
        return bbmu.f102933a.mo56233e();
    }
}
