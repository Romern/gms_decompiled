package p000;

import java.io.IOException;

/* renamed from: bbms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbms {

    /* renamed from: a */
    public final bbmv f102930a;

    /* renamed from: b */
    public final bnsn f102931b;

    public bbms(bbmv bbmv, bnsn bnsn) {
        this.f102930a = bbmv;
        this.f102931b = bnsn;
    }

    /* renamed from: a */
    public final bbmr mo56223a() {
        try {
            return new bbmr(new bbmu((bbnm) bbmv.m88201a(this.f102930a.f102934a.mo56235a())), this.f102931b);
        } catch (IOException e) {
            bnsi c = this.f102931b.mo68388c();
            c.mo68437a(e);
            c.mo68432a("bbms", "a", 49, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Failed to retrieve sync metadata at sync start!");
            return new bbmr(null, this.f102931b);
        }
    }

    /* renamed from: a */
    public final void mo56224a(Enum enumR) {
        try {
            bbmv.m88201a(this.f102930a.f102934a.mo56236a(enumR));
        } catch (IOException e) {
            bnsi c = this.f102931b.mo68388c();
            c.mo68437a(e);
            c.mo68432a("bbms", "a", 33, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Failed to register event occurrence!");
        }
    }

    /* renamed from: a */
    public final void mo56225a(Iterable iterable) {
        try {
            bbmv.m88201a(this.f102930a.f102934a.mo56237a(bnjd.m109575a(bnjd.m109575a(iterable, bbmq.f102927a), bbmt.f102932a)));
        } catch (IOException e) {
            bnsi c = this.f102931b.mo68388c();
            c.mo68437a(e);
            c.mo68432a("bbms", "a", 60, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Failed to flush sync metadata!");
        }
    }
}
