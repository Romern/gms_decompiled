package p000;

/* renamed from: zdv */
final /* synthetic */ class zdv implements yuu {

    /* renamed from: a */
    static final yuu f54980a = new zdv();

    private zdv() {
    }

    /* renamed from: a */
    public final Object mo30727a(Object obj, Object obj2) {
        String str = (String) obj;
        bnhe bnhe = (bnhe) obj2;
        srn srn = zdw.f54981a;
        try {
            return bnhe.m109413a(bnmt.m109799a(zdw.f54982b.mo66915a(str), zdt.f54978a));
        } catch (IllegalArgumentException e) {
            ((bnsl) zdw.f54981a.mo68388c()).mo68420a("Malformed flag value (continuing with default): %s", str);
            return bnoj.f131912b;
        }
    }
}
