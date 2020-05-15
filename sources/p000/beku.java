package p000;

import java.util.concurrent.Executor;

/* renamed from: beku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beku extends belj {

    /* renamed from: a */
    public static final belj f111735a = new beku();

    private beku() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ beli mo60753a(bejr bejr, String str, Executor executor, befa befa, beir beir) {
        bmxy.m108581a(beir);
        beik beik = (beik) bejr;
        return new bekv(str, bqga.m112775a(beik.f111583a), belv.m95279a(beik.f111584b, beik.f111587e), executor, befa);
    }

    /* renamed from: a */
    public final String mo60754a(beir beir) {
        bmxy.m108581a(beir);
        return "singleproc";
    }
}
