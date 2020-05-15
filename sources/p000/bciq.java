package p000;

import java.util.concurrent.Future;

/* renamed from: bciq */
final /* synthetic */ class bciq implements bqeg {

    /* renamed from: a */
    private final bcjm f104248a;

    /* renamed from: b */
    private final bqgg f104249b;

    /* renamed from: c */
    private final bcoh f104250c;

    public bciq(bcjm bcjm, bqgg bqgg, bcoh bcoh) {
        this.f104248a = bcjm;
        this.f104249b = bqgg;
        this.f104250c = bcoh;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bcjm bcjm = this.f104248a;
        bqgg bqgg = this.f104249b;
        bcoh bcoh = this.f104250c;
        if (((Boolean) bqga.m112780a((Future) bqgg)).booleanValue()) {
            return bcjm.f104336e.mo56272a(bcoh, true);
        }
        return bqga.m112775a((Object) null);
    }
}
