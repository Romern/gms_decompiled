package p000;

/* renamed from: pqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pqe extends C0942ds {
    public pqe(C0953ec ecVar) {
        super(ecVar);
    }

    /* renamed from: a */
    public final String mo10122a() {
        return "INSERT OR REPLACE INTO `gaia_info` (`gaia_account_name`,`last_updated_timestamp_ms`) VALUES (?,?)";
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9522a(C0939dp dpVar, Object obj) {
        pqd pqd = (pqd) obj;
        String str = pqd.f40055a;
        if (str == null) {
            dpVar.mo8917a(1);
        } else {
            dpVar.mo8919a(1, str);
        }
        dpVar.mo8918a(2, pqd.f40056b);
    }
}
