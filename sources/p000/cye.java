package p000;

/* renamed from: cye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cye implements cyn {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055 A[RETURN] */
    /* renamed from: a */
    public final cut mo8390a(cuo cuo, cyp cyp) {
        cva cva;
        byte[] a;
        if (cyp instanceof cyq) {
            cwf cwf = ((cyq) cyp).f12405h;
            cvb c = cve.m7671c(cuo.mo8308h());
            if (!(c == null || !(c instanceof cuz) || (a = cyp.mo8341a(c.mo8321b())) == null)) {
                cuz cuz = (cuz) c;
                int length = a.length;
                Long a2 = cwf.mo8355a(cuz);
                if (a2 != null) {
                    cva = cuz.mo8318a(cvz.m7712a(cvz.m7728d(a2.toString()), length));
                    if (cva != null) {
                        return null;
                    }
                    cuu.CONDITIONS_OF_USE_NOT_SATISFIED.mo8315a(!cyp.mo8340a().mo8362a(cwk.ALLOW_RETRIEVAL_OF_VALUES_AND_LIMITS_OF_CRM_CVM_COUNTER_AND_ACCUMULATOR_THROUGH_GET_DATA));
                    return cut.m7621a(cva);
                }
            }
        }
        cva = null;
        if (cva != null) {
        }
    }
}
