package p000;

/* renamed from: ppv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ppv extends C0942ds {
    public ppv(C0953ec ecVar) {
        super(ecVar);
    }

    /* renamed from: a */
    public final String mo10122a() {
        return "INSERT OR REPLACE INTO `gaia_device_link` (`gaia_account_name`,`cloud_device_id`) VALUES (?,?)";
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9522a(C0939dp dpVar, Object obj) {
        ppu ppu = (ppu) obj;
        String str = ppu.f40040a;
        if (str == null) {
            dpVar.mo8917a(1);
        } else {
            dpVar.mo8919a(1, str);
        }
        String str2 = ppu.f40041b;
        if (str2 == null) {
            dpVar.mo8917a(2);
        } else {
            dpVar.mo8919a(2, str2);
        }
    }
}
