package p000;

/* renamed from: dpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dpg {

    /* renamed from: a */
    public final dwa f13737a;

    /* renamed from: b */
    public boolean f13738b = true;

    /* renamed from: c */
    public final bxvd f13739c = bxhc.f163338e.mo74144da();

    /* renamed from: d */
    public final bxvd f13740d;

    public dpg(dwa dwa, long j) {
        sdo.m34959a(dwa);
        if (!dwa.f14242b.mo9738a().isEmpty()) {
            bxvd bxvd = this.f13739c;
            String a = dwa.f14242b.mo9738a();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bxhc bxhc = (bxhc) bxvd.f164949b;
            a.getClass();
            bxhc.f163340a |= 1;
            bxhc.f163341b = a;
        }
        if (!dwa.f14242b.mo9739b().isEmpty()) {
            bxvd bxvd2 = this.f13739c;
            String b = dwa.f14242b.mo9739b();
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bxhc bxhc2 = (bxhc) bxvd2.f164949b;
            b.getClass();
            bxhc2.f163340a |= 2;
            bxhc2.f163342c = b;
        }
        bxvd da = bxhl.f163417d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxhl bxhl = (bxhl) da.f164949b;
        int i = 1 | bxhl.f163419a;
        bxhl.f163419a = i;
        bxhl.f163420b = j;
        bxhl.f163419a = i | 2;
        bxhl.f163421c = Long.MAX_VALUE;
        this.f13740d = da;
        this.f13737a = dwa;
    }

    /* renamed from: a */
    public final boolean mo9377a(long j) {
        if (!this.f13738b) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dpg", "a", 46, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[AppIntervalImpl] closeInterval: ongoing");
            return false;
        }
        bxvd bxvd = this.f13740d;
        if (j > ((bxhl) bxvd.f164949b).f163420b) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bxhl bxhl = (bxhl) bxvd.f164949b;
            bxhl bxhl2 = bxhl.f163417d;
            bxhl.f163419a |= 2;
            bxhl.f163421c = j;
            this.f13738b = false;
            return true;
        }
        bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
        bnsl2.mo68432a("dpg", "a", 52, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68417a("[AppIntervalImpl] closeInterval: stopTimeMillis invalid, stop=%s, start=%s", j, ((bxhl) this.f13740d.f164949b).f163420b);
        return false;
    }
}
