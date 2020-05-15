package p000;

/* renamed from: zqs */
final /* synthetic */ class zqs implements bmxz {

    /* renamed from: a */
    private final String f55720a;

    /* renamed from: b */
    private final bnic f55721b;

    public zqs(String str, bnic bnic) {
        this.f55720a = str;
        this.f55721b = bnic;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        String str = this.f55720a;
        bnic bnic = this.f55721b;
        int i = zqx.f55726b;
        String str2 = yyo.m45042a(((yqe) obj).f54381b).f172336b;
        return str.equals(str2) || !bnic.contains(str2);
    }
}
