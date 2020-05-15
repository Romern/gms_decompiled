package p000;

/* renamed from: aih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aih {
    /* renamed from: a */
    public static bqgg m807a(aie aie) {
        aic aic = new aic();
        aig aig = new aig(aic);
        aic.f586b = aig;
        aic.f585a = aie.getClass();
        try {
            Object a = aie.mo753a(aic);
            if (a != null) {
                aic.f585a = a;
            }
        } catch (Exception e) {
            aig.mo754a(e);
        }
        return aig;
    }
}
