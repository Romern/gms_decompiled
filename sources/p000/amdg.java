package p000;

/* renamed from: amdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amdg {
    /* renamed from: a */
    public static final rke m62647a(rkb rkb, alll alll, String str, String str2, int i) {
        amah amah;
        if (str != null) {
            amaz amaz = (amaz) rkb.mo24786a(allr.f73632d);
            synchronized (amaz.f74603d) {
                if (!amaz.f74603d.containsKey(alll)) {
                    amah amah2 = new amah(rkb.mo24788a(alll));
                    amaz.f74603d.put(alll, amah2);
                    amah = amah2;
                } else {
                    amah amah3 = (amah) amaz.f74603d.get(alll);
                    amah = amah3;
                }
            }
            return rkb.mo24787a((rle) new amde(rkb, amah, str, str2, i));
        }
        throw new IllegalArgumentException("account must not be null");
    }

    /* renamed from: a */
    public static final void m62648a(rkb rkb, alll alll) {
        rkb.mo24787a((rle) new amdf(rkb, alll));
    }
}
