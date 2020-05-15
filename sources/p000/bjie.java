package p000;

/* renamed from: bjie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjie {

    /* renamed from: a */
    public static bjif f122757a;

    /* renamed from: a */
    public static void m103593a(aweg aweg, int i) {
        synchronized (bjie.class) {
            if (f122757a == null) {
                bjig d = bjii.m103598d();
                bjic bjic = new bjic();
                cazf.m127594a(bjic);
                d.f122758a = bjic;
                bjij bjij = new bjij(aweg);
                cazf.m127594a(bjij);
                d.f122759b = bjij;
                bjix bjix = new bjix(i);
                cazf.m127594a(bjix);
                d.f122760c = bjix;
                cazf.m127595a(d.f122758a, bjic.class);
                cazf.m127595a(d.f122759b, bjij.class);
                cazf.m127595a(d.f122760c, bjix.class);
                f122757a = new bjii(d.f122759b, d.f122760c);
            }
        }
    }
}
