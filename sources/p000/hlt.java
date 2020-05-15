package p000;

/* renamed from: hlt */
final /* synthetic */ class hlt implements bmxj {

    /* renamed from: a */
    static final bmxj f19993a = new hlt();

    private hlt() {
    }

    public final Object apply(Object obj) {
        bnhe bnhe = (bnhe) obj;
        sek sek = hmc.f20015a;
        if (bnhe.containsKey("credentials_enable_sync") && !((Boolean) bnhe.get("credentials_enable_sync")).booleanValue()) {
            return false;
        }
        if (!bnhe.containsKey("credentials_enable_service") || ((Boolean) bnhe.get("credentials_enable_service")).booleanValue()) {
            return Boolean.valueOf(!((Boolean) bnhe.getOrDefault("credentials_need_first_time_welcome", true)).booleanValue());
        }
        return false;
    }
}
