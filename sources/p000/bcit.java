package p000;

import java.util.concurrent.Future;

/* renamed from: bcit */
final /* synthetic */ class bcit implements bqeg {

    /* renamed from: a */
    private final bcjm f104256a;

    /* renamed from: b */
    private final bqgg f104257b;

    /* renamed from: c */
    private final bcoh f104258c;

    public bcit(bcjm bcjm, bqgg bqgg, bcoh bcoh) {
        this.f104256a = bcjm;
        this.f104257b = bqgg;
        this.f104258c = bcoh;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bcjm bcjm = this.f104256a;
        bqgg bqgg = this.f104257b;
        bcoh bcoh = this.f104258c;
        try {
            bqga.m112780a((Future) bqgg);
        } catch (Throwable th) {
            if (chuv.m149608a(th).f189233s == chuv.f189223j.f189233s) {
                return bcjm.f104336e.mo56272a(bcoh, true);
            }
        }
        return bqga.m112775a((Object) null);
    }
}
