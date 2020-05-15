package p000;

/* renamed from: bkti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkti {

    /* renamed from: a */
    private static final bktd f125266a = new bktd();

    /* renamed from: a */
    public static Object m106597a(bkxi bkxi) {
        if (bkxi.mo66433f()) {
            return bkta.f125260a;
        }
        bkxi.mo66430c();
        int b = bkxi.mo66429b();
        bkte bkte = (bkte) f125266a.f125263a.get(b);
        if (bkte != null) {
            Object a = bkte.mo66345a(bkxi);
            bkxi.mo66431d();
            return a;
        }
        StringBuilder sb = new StringBuilder(66);
        sb.append("No decoder found to deserialize object with type code: ");
        sb.append(b);
        throw new bkth(sb.toString());
    }
}
