package p000;

/* renamed from: ecu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ecu {

    /* renamed from: a */
    public tnj f14703a;

    /* renamed from: b */
    public long f14704b;

    public ecu(tnj tnj, long j) {
        this.f14703a = tnj;
        this.f14704b = j;
    }

    /* renamed from: a */
    public static ecu m10126a(tjq tjq) {
        if (tjq.mo26591a() != 1) {
            return null;
        }
        try {
            return new ecu((tnj) bxvk.m124016a(tnj.f46291e, tjq.mo26593c(), bxus.m123744c()), tjq.mo26592b().mo18096c());
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ecu", "a", 240, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[RegistrationManager] Could not parse device registration.");
            return null;
        }
    }

    public final String toString() {
        tni tni;
        sdf a = sdg.m34948a(this);
        a.mo25396a("deviceId", this.f14703a.f46294b);
        a.mo25396a("gcmId", this.f14703a.f46295c);
        tnj tnj = this.f14703a;
        if ((tnj.f46293a & 4) != 0) {
            tni = tni.m37265a(tnj.f46296d);
            if (tni == null) {
                tni = tni.NOT_SYNCED_MISSING_GCM_ID;
            }
        } else {
            tni = null;
        }
        a.mo25396a("state", tni);
        a.mo25396a("time", egc.m10349a(this.f14704b));
        return a.toString();
    }

    /* renamed from: a */
    public final void mo9971a(tni tni) {
        tnj tnj = this.f14703a;
        bxvd bxvd = (bxvd) tnj.mo74142c(5);
        bxvd.mo73625a((bxvk) tnj);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        tnj tnj2 = (tnj) bxvd.f164949b;
        tnj tnj3 = tnj.f46291e;
        tnj2.f46296d = tni.f46290d;
        tnj2.f46293a |= 4;
        this.f14703a = (tnj) bxvd.mo74062i();
        this.f14704b = dwq.m9665i().mo20505a();
    }

    /* renamed from: a */
    public final boolean mo9972a() {
        tni tni;
        tni tni2 = tni.NOT_SYNCED_MISSING_GCM_ID;
        tni a = tni.m37265a(this.f14703a.f46296d);
        if (a == null) {
            a = tni.NOT_SYNCED_MISSING_GCM_ID;
        }
        int ordinal = a.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return true;
        }
        if (ordinal == 2) {
            return dwq.m9665i().mo20505a() - this.f14704b > cdgp.f180782a.mo6606a().mo77604x();
        }
        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
        bnsl.mo68432a("ecu", "a", 284, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        tnj tnj = this.f14703a;
        if ((tnj.f46293a & 4) != 0) {
            tni = tni.m37265a(tnj.f46296d);
            if (tni == null) {
                tni = tni.NOT_SYNCED_MISSING_GCM_ID;
            }
        } else {
            tni = null;
        }
        bnsl.mo68420a("[RegistrationManager] Unknown device registration state=%s", tni);
        return false;
    }
}
