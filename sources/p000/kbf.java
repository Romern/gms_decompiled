package p000;

/* renamed from: kbf */
final /* synthetic */ class kbf implements bmxj {

    /* renamed from: a */
    private final kbh f23690a;

    public kbf(kbh kbh) {
        this.f23690a = kbh;
    }

    public final Object apply(Object obj) {
        kbh kbh = this.f23690a;
        bnre i = ((bngx) obj).listIterator();
        while (i.hasNext()) {
            quo quo = (quo) i.next();
            if ("billing_customer_number".equals(quo.f42182b)) {
                try {
                    long parseLong = Long.parseLong(quo.f42183c);
                    kbh.f23692b.edit().putLong("billing_customer_number", parseLong).apply();
                    return bmxv.m108566b(Long.valueOf(parseLong));
                } catch (NumberFormatException e) {
                    ((bnsl) kbh.f23691a.mo68388c()).mo68405a("Billing Customer Number key in PreferenceSpecificsData does not contain a numerical value.");
                    return bmvz.f131120a;
                }
            }
        }
        return bmvz.f131120a;
    }
}
