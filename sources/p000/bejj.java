package p000;

import java.util.concurrent.Executor;

/* renamed from: bejj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bejj extends belj {

    /* renamed from: a */
    public static final belj f111648a = new bejj();

    private bejj() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ beli mo60753a(bejr bejr, String str, Executor executor, befa befa, beir beir) {
        bmxy.m108581a(beir);
        beik beik = (beik) bejr;
        bmxy.m108588a(beik.f111586d instanceof bejb);
        return new bejk(str, bqga.m112775a(beik.f111583a), beik.f111584b, executor, befa, beik.f111587e);
    }

    /* renamed from: a */
    public final String mo60754a(beir beir) {
        bmxy.m108581a(beir);
        return "multiproc";
    }
}
