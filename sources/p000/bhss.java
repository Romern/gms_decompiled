package p000;

/* renamed from: bhss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhss {

    /* renamed from: a */
    final /* synthetic */ bhst f119490a;

    public bhss(bhst bhst) {
        this.f119490a = bhst;
    }

    /* renamed from: a */
    public final void mo64224a(bvnw[] bvnwArr, bvoa[] bvoaArr) {
        this.f119490a.f119491a.mo64273a(bvoaArr);
        bhtm bhtm = this.f119490a.f119492b;
        bhtm.f119561a.clear();
        bhtm.f119562b.clear();
        for (bvoa bvoa : bvoaArr) {
            bhtm.mo64276a(bvoa);
        }
        for (bvnw bvnw : bvnwArr) {
            if ((bvnw.f156973a & 4) != 0) {
                bhtm.f119562b.put(Long.valueOf(bvnw.f156974b), bvnw);
            } else {
                bhwp a = bhuj.m101555a();
                String valueOf = String.valueOf(bvnw);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                sb.append("Invalid PersonalizedPlaceInfo: ");
                sb.append(valueOf);
                a.mo64360b(sb.toString());
            }
        }
    }
}
